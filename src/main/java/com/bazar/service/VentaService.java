package com.bazar.service;

import com.bazar.model.Venta;
import com.bazar.repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService implements IVentaService{
    @Autowired
    IVentaRepository ventaRepository;

    @Override
    public void postVenta(Venta venta) {
        ventaRepository.save(venta);
    }

    @Override
    public List<Venta> getAllVenta() {
        return ventaRepository.findAll();
    }

    @Override
    public Venta getVentaById(Long codigoVenta) {
        return ventaRepository.findById(codigoVenta).orElse(null);
    }

    @Override
    public void deleteVenta(Long codigoVenta) {
        ventaRepository.deleteById(codigoVenta);
    }
}
