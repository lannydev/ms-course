package com.microservices.hrworker.controller;

import com.microservices.hrworker.entities.Worker;
import com.microservices.hrworker.service.impl.WorkerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {


    private final WorkerServiceImpl workerService;

    public WorkerController(WorkerServiceImpl workerService) {
        this.workerService = workerService;
    }

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        return new ResponseEntity<>(workerService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable  Long id){
        return new ResponseEntity<>(workerService.findById(id), HttpStatus.OK);
    }
}
