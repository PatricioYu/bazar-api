package com.bazar.service;

import com.bazar.model.Sale;

import java.util.List;

public interface ISaleService {
    public void postSale(Sale sale);
    public List<Sale> getAllSales();
    public Sale getSaleById(Long id);
    public void deleteSale(Long id);
}
