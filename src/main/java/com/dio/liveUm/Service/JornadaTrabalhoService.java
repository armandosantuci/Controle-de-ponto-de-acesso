package com.dio.liveUm.Service;

import com.dio.liveUm.Repository.JornadaTrabalhoRepository;
import com.dio.liveUm.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {

        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById( Long idJornada) {

        return jornadaTrabalhoRepository.findById(idJornada);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void deleteAll() {

       jornadaTrabalhoRepository.deleteAll();
    }

    public void deleteJornada(Long idJornada) {

        jornadaTrabalhoRepository.deleteById(idJornada);
    }


}
