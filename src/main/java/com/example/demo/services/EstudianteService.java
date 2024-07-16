package com.example.demo.services;

import com.example.demo.models.EstudianteModel;
import com.example.demo.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository usuarioRepository;
    public ArrayList<EstudianteModel> obtenerUsuarios(){
       return (ArrayList<EstudianteModel>) usuarioRepository.findAll();
    }
    public EstudianteModel guardarUsuario(EstudianteModel usuario){
        return usuarioRepository.save(usuario);
    }

    public void update(EstudianteModel usuario){
        usuarioRepository.save(usuario);
    }


    public Boolean deleteById(Long id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return !usuarioRepository.existsById(id);
        }
        return false;
    }
}
