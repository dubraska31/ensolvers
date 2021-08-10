package com.ensolvers.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensolvers.exercise.model.Task;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}

