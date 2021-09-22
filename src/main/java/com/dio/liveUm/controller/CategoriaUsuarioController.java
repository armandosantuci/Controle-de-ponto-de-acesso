package com.dio.liveUm.controller;

import com.dio.liveUm.Service.CategoriaUsuarioService;
import com.dio.liveUm.model.CategoriaUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoriaUsuario")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario createCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioService.saveCategoriaUsuario(categoriaUsuario);
    }
    @GetMapping
    public List<CategoriaUsuario> getCategoriaUsuarioList() {
        return categoriaUsuarioService.findAll();
    }
    @GetMapping("/{idCategoriaUsuario}")
    public java.util.Optional<CategoriaUsuario> getCategoriaUsuarioById(@PathVariable("idCategoriaUsuario") Long idCategoriaUsuario) {
        return categoriaUsuarioService.getById(idCategoriaUsuario);
    }
    @PutMapping
    public CategoriaUsuario updateCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioService.updateCategoriaUsuario(categoriaUsuario);
    }
    @DeleteMapping("/{idCategoriaUsuario}")
    public void deleteByID(@PathVariable("idCategoriaUsuario") Long idCategoriaUsuario) {
        categoriaUsuarioService.deleteCategoriaUsuario(idCategoriaUsuario);
    }
}
