package com.dio.liveUm.controller;


import com.dio.liveUm.Service.LocalidadeService;
import com.dio.liveUm.model.Localidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {

    @Autowired
    LocalidadeService localidadeService;

    @PostMapping
    public Localidade createLocalidade(@RequestBody Localidade localidade) {
        return localidadeService.saveLocalidade(localidade);
    }
    @GetMapping
    public List<Localidade> getLocalidadeList() {
        return localidadeService.findAll();
    }
    @GetMapping("/{idLocaliade}")
    public java.util.Optional<Localidade> getLocalidadeById(@PathVariable("idLocalidade") Long idLocalidade) {
        return localidadeService.getById(idLocalidade);
    }
    @PutMapping
    public Localidade updateLocalidade(@RequestBody Localidade localidade) {
        return localidadeService.updateLocalidade(localidade);
    }
    @DeleteMapping("/{idLocalidade}")
    public void deleteByID(@PathVariable("idLocalidade") Long idLocalidade) {
        localidadeService.deleteLocalidade(idLocalidade);
    }
}
