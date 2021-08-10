package com.ensolvers.exercise.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "folder")
public class Folder {

	@Column(name = "id_folder", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idFolder;

	@Column(name = "folder_description", nullable = false)
	private String folderDescription;

	@JsonManagedReference
	@OneToMany(mappedBy = "folder", targetEntity = Task.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Task> task = new ArrayList<>();

	public long getIdFolder() {
		return idFolder;
	}

	public void setIdFolder(long idFolder) {
		this.idFolder = idFolder;
	}

	public String getFolderDescription() {
		return folderDescription;
	}

	public void setFolderDescription(String folderDescription) {
		this.folderDescription = folderDescription;
	}

	public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}

}
