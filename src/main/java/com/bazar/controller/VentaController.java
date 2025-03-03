package com.bazar.controller;

import com.bazar.model.Venta;
import com.bazar.service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VentaController {
    @Autowired
    private IVentaService intVentaService;

    @PostMapping(path = "/ventas")
    public void postVenta(@RequestBody Venta venta) {
        intVentaService.postVenta(venta);
    }

    @GetMapping(path = "/ventas")
    public List<Venta> getAllVentas() {
        return intVentaService.getAllVenta();
    }

    @GetMapping(path = "/ventas/{id}")
    public Venta getVentaById(@PathVariable Long id) {
        return intVentaService.getVentaById(id);
    }

    @DeleteMapping(path = "/ventas/{id}")
    public void deleteVentaById(@PathVariable Long id) {
        intVentaService.deleteVenta(id);
    }
}
