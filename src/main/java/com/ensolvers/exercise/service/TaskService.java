package com.ensolvers.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ensolvers.exercise.model.Task;
import com.ensolvers.exercise.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	TaskRepository taskRepository;

	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	public Task getTaskById(long idTask) {
		return taskRepository.findById(idTask).get();
	}

	public Task saveTask(Task task) {
		return taskRepository.save(task);
	}

	public Task updateTask(Task task) {
		return taskRepository.save(task);
	}

	public void deleteTask(long idTask) {
		taskRepository.deleteById(idTask);
	}

}
