package com.microservices.hrworker.service.impl;

import com.microservices.hrworker.entities.Worker;
import com.microservices.hrworker.repositories.WorkerRepository;
import com.microservices.hrworker.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public List<Worker> findAll() {
        return workerRepository.findAll();
    }

    @Override
    public Worker findById(Long id) {
        return workerRepository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Resource %d not found", id)));
    }
}
