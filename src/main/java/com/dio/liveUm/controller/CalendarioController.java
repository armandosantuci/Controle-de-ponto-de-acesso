package com.dio.liveUm.controller;

import com.dio.liveUm.Service.CalendarioService;
import com.dio.liveUm.model.Calendario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {

    @Autowired
    CalendarioService calendarioService;

    @PostMapping
    public Calendario createCalendario(@RequestBody Calendario calendario) {
        return calendarioService.saveCalendario(calendario);
    }
    @GetMapping
    public List<Calendario> getCalendarioList() {
        return calendarioService.findAll();
    }
    @GetMapping("/{idCalendario}")
    public java.util.Optional<Calendario> getCalendarioById(@PathVariable("idCalendario") Long idCalendario) {
        return calendarioService.getById(idCalendario);
    }
    @PutMapping
    public Calendario updateCalendario(@RequestBody Calendario calendario) {
        return calendarioService.updateCalendario(calendario);
    }
    @DeleteMapping("/{idCalendario}")
    public void deleteByID(@PathVariable("idCalendario") Long idCalendario) {
        calendarioService.deleteCalendario(idCalendario);
    }
}