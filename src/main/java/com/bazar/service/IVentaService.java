package com.bazar.service;

import com.bazar.model.Venta;

import java.util.List;

public interface IVentaService {
    public void postVenta(Venta venta);
    public List<Venta> getAllVenta();
    public Venta getVentaById(Long codigoVenta);
    public void deleteVenta(Long codigoVenta);
}
