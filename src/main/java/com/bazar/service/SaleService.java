package com.bazar.service;

import com.bazar.model.Sale;
import com.bazar.repository.ISaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService implements ISaleService {
    @Autowired
    private ISaleRepository saleRepository;

    @Override
    public void postSale(Sale sale) {
        saleRepository.save(sale);
    }

    @Override
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    @Override
    public Sale getSaleById(Long id) {
        return saleRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteSale(Long id) {
        saleRepository.deleteById(id);
    }
}
