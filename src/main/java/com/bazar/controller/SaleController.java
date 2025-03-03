package com.bazar.controller;

import com.bazar.model.Sale;
import com.bazar.service.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SaleController {
    @Autowired
    private ISaleService intSaleService;

    @PostMapping(path = "/sales")
    public void postSale(@RequestBody Sale sale) {
        intSaleService.postSale(sale);
    }

    @GetMapping(path = "/sales")
    public List<Sale> getAllSales() {
        return intSaleService.getAllSales();
    }

    @GetMapping(path = "/sales/{id}")
    public Sale getSaleById(@PathVariable Long id) {
        return intSaleService.getSaleById(id);
    }

    @DeleteMapping(path = "/sales/{id}")
    public void deleteSaleById(@PathVariable Long id) {
        intSaleService.deleteSale(id);
    }
}
