package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer>{
	List<Emp> findAll();
}
