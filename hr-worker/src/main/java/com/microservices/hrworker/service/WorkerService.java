package com.microservices.hrworker.service;

import com.microservices.hrworker.entities.Worker;

import java.util.List;

public interface WorkerService {

    List<Worker> findAll();
    Worker findById(Long id);
}
