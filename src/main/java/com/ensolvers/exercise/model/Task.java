package com.ensolvers.exercise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "task")
public class Task {

	@Column(name = "id_task", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTask;

	@Column(name = "task_description", nullable = false)
	private String taskDescription;

	private boolean completed;

	@JsonBackReference
	@ManyToOne()
	@JoinColumn(name = "id_folder")
	private Folder folder;

	public long getIdTask() {
		return idTask;
	}

	public void setIdTask(long idTask) {
		this.idTask = idTask;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public Folder getFolder() {
		return folder;
	}

	public void setFolder(Folder folder) {
		this.folder = folder;
	}

}
