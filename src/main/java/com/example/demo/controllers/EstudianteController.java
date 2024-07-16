package com.example.demo.controllers;

import com.example.demo.models.EstudianteModel;
import com.example.demo.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    EstudianteService estudianteService;

    @GetMapping()
    public ArrayList<EstudianteModel> obtenerUsuarios(){
        return estudianteService.obtenerUsuarios();
    }
    @PostMapping
    public EstudianteModel guardarUsusrio(@RequestBody EstudianteModel usuario){
        return this.estudianteService.guardarUsuario(usuario);

    }
    @PutMapping
    public void update(@RequestBody EstudianteModel usuario){
        this.estudianteService.update(usuario);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePersona(@PathVariable("id") Long id) {
        boolean eliminado = estudianteService.deleteById(id);
        if (eliminado) {
            return ResponseEntity.ok("Estudiante eliminado con id: " + id);
        } else {
            return ResponseEntity.status(404).body("No se pudo eliminar el estudiante con id: " + id);
        }
    }


    }
