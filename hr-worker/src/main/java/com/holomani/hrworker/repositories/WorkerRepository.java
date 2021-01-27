package com.holomani.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.holomani.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
