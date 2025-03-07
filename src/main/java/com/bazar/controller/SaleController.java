package com.bazar.controller;

import com.bazar.model.Sale;
import com.bazar.service.ISaleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/sales")
public class SaleController {
    private final ISaleService intSaleService;

    public SaleController(ISaleService intSaleService) {
        this.intSaleService = intSaleService;
    }

    @PostMapping
    public void postSale(@RequestBody Sale sale) {
        intSaleService.postSale(sale);
    }

    @GetMapping
    public List<Sale> getAllSales() {
        return intSaleService.getAllSales();
    }

    @GetMapping(path = "/{id}")
    public Sale getSaleById(@PathVariable Long id) {
        return intSaleService.getSaleById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteSaleById(@PathVariable Long id) {
        intSaleService.deleteSale(id);
    }
}
