package com.dio.liveUm.controller;

import com.dio.liveUm.Service.BancoHorasService;
import com.dio.liveUm.model.BancoHoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bancoHoras")
public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras createBancoHoras(@RequestBody BancoHoras bancoHoras) {
        return bancoHorasService.saveBancoHoras(bancoHoras);
    }
    @GetMapping
    public List<BancoHoras> getBancoHorasList() {
        return bancoHorasService.findAll();
    }
    @PutMapping
    public BancoHoras updateBancoHoras(@RequestBody BancoHoras bancoHoras) {
        return bancoHorasService.updateBancoHoras(bancoHoras);
    }
    @GetMapping("/{id}")
    public Optional<BancoHoras> getBancoById(@PathVariable("id") Long id){
        return bancoHorasService.getById(id);

    }
    @DeleteMapping("/{id}")
    public void deleteByid(@PathVariable("id") Long id){
        bancoHorasService.deleteById(id);
    }
}
