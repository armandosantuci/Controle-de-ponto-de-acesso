package com.dio.liveUm.controller;

import com.dio.liveUm.Service.NivelAcessoService;
import com.dio.liveUm.model.NivelAcesso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nivelAcesso")
public class NivelAcessoController {

    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.saveNivelAcesso(nivelAcesso);
    }
    @GetMapping
    public List<NivelAcesso> getNivelAcessoList() {
        return nivelAcessoService.findAll();
    }
    @GetMapping("/{idNivelAcesso}")
    public java.util.Optional<NivelAcesso> getNivelAcessoById(@PathVariable("idNivelAcesso") Long idNivelAcesso) {
        return nivelAcessoService.getById(idNivelAcesso);
    }
    @PutMapping
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.updateNivelAcesso(nivelAcesso);
    }
    @DeleteMapping("/{idNivelAcesso}")
    public void deleteByID(@PathVariable("idNivelAcesso") Long idNivelAcesso) {
        nivelAcessoService.deleteNivelAcesso(idNivelAcesso);
    }
}
