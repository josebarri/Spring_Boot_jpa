package com.example.demo.repositories;

import com.example.demo.models.EstudianteModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EstudianteRepository extends CrudRepository<EstudianteModel, Long> {

}