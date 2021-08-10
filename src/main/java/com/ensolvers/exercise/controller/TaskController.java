package com.ensolvers.exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ensolvers.exercise.model.Task;
import com.ensolvers.exercise.service.TaskService;

@RestController
public class TaskController {
	
	@Autowired
	TaskService taskService;

	@GetMapping("/tasks")
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}

	@GetMapping("/tasks/{idTask}")
	public Task getTaskById(@PathVariable long idTask) {
		return taskService.getTaskById(idTask);
	}

	@PostMapping("/tasks")
	public Task saveTask(@RequestBody Task task) {
		return taskService.saveTask(task);
	}

	@PutMapping("/tasks")
	public Task updateTask(@RequestBody Task task) {
		return taskService.updateTask(task);
	}

	@DeleteMapping("/tasks/{idTask}")
	public void deleteTask(@PathVariable long idTask) {
		taskService.deleteTask(idTask);
	}
}
