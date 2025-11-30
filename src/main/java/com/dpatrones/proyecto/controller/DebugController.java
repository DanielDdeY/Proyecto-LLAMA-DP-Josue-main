package com.dpatrones.proyecto.controller;

import com.dpatrones.proyecto.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DebugController {

    private final ProductoService productoService;

    @GetMapping("/debug/productos")
    public String debugProductos() {
        int total = productoService.listarTodos().size();
        return "Total productos en BD: " + total;
    }
}