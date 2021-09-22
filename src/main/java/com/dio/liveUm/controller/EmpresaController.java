package com.dio.liveUm.controller;

import com.dio.liveUm.Service.EmpresaService;
import com.dio.liveUm.model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return empresaService.saveEmpresa(empresa);
    }
    @GetMapping
    public List<Empresa> getEmpresaList() {
        return empresaService.findAll();
    }
    @GetMapping("/{idEmpresa}")
    public java.util.Optional<Empresa> getEmpresaById(@PathVariable("idEmpresa") Long idEmpresa) {
        return empresaService.getById(idEmpresa);
    }
    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa) {
        return empresaService.updateEmpresa(empresa);
    }
    @DeleteMapping("/{idEmpresa}")
    public void deleteByID(@PathVariable("idEmpresa") Long idEmpresa) {
        empresaService.deleteEmpresa(idEmpresa);
    }
}
