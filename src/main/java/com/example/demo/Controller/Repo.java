package com.example.demo.Controller;

import org.springframework.data.repository.CrudRepository;

import java.util.Map;

public interface Repo extends CrudRepository<Map<String,Double>,Integer> {
}
