package com.dio.liveUm.Service;

import com.dio.liveUm.Repository.BancoHorasRepository;
import com.dio.liveUm.model.BancoHoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {
    BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository) {
        this.bancoHorasRepository = bancoHorasRepository;
    }
    public BancoHoras saveBancoHoras(BancoHoras bancoHoras) {

        return bancoHorasRepository.save(bancoHoras);
    }
    public List<BancoHoras> findAll() {

        return bancoHorasRepository.findAll();
    }
    public BancoHoras updateBancoHoras(BancoHoras bancoHoras) {

        return bancoHorasRepository.save(bancoHoras);
    }

    public Optional<BancoHoras> getById(Long id){
        return bancoHorasRepository.findById(id);
    }

    public void deleteAll(){
        bancoHorasRepository.deleteAll();
    }

    public  void deleteById(Long id){
        bancoHorasRepository.deleteById(id);
    }
}