package com.dio.liveUm.controller;


import com.dio.liveUm.Service.JornadaTrabalhoService;
import com.dio.liveUm.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jornada")
public class jornadaTrabalhoController {
    @Autowired
    JornadaTrabalhoService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();

    }


    @GetMapping("/{idJornada}")
    public Optional<JornadaTrabalho> getJornadaByID(@PathVariable("idJornada") Long idJornada){
        return jornadaService.getById( idJornada);

    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaService.deleteJornada(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping
    public void deleteAll(){
        jornadaService.deleteAll();
    }





}