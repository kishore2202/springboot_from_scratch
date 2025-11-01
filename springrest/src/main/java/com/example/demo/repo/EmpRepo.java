package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.controller.Emp;

@RepositoryRestResource(collectionResourceRel = "emp", path="emp")
public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
