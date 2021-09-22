package com.dio.liveUm.Service;

import com.dio.liveUm.Repository.NivelAcessoRepository;
import com.dio.liveUm.model.NivelAcesso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {
    NivelAcessoRepository nivelAcessoRepository;

    @Autowired
    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository) {
        this.nivelAcessoRepository = nivelAcessoRepository;
    }

    public NivelAcesso saveNivelAcesso(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public List<NivelAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }

    public Optional<NivelAcesso> getById(Long idNivelAcesso) {
        return nivelAcessoRepository.findById(idNivelAcesso);
    }

    public NivelAcesso updateNivelAcesso(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public void deleteNivelAcesso(Long idNivelAcesso) {
        nivelAcessoRepository.deleteById(idNivelAcesso);
    }
}