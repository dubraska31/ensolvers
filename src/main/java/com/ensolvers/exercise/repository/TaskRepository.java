package com.ensolvers.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ensolvers.exercise.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
