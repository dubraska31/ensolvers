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

import com.ensolvers.exercise.model.Folder;
import com.ensolvers.exercise.service.FolderService;


@RestController
public class FolderController {

	@Autowired
	FolderService folderService;

	@GetMapping("/folders")
	public List<Folder> getAllFolders() {
		return folderService.getAllFolders();
	}

	@GetMapping("/folders/{idFolder}")
	public Folder getFolderById(@PathVariable long idFolder) {
		return folderService.getFolderById(idFolder);
	}

	@PostMapping("/folders")
	public Folder saveFolder(@RequestBody Folder folder) {
		return folderService.saveFolder(folder);
	}

	@PutMapping("/folders")
	public Folder updateFolder(@RequestBody Folder folder) {
		return folderService.updateFolder(folder);
	}

	@DeleteMapping("/folders/{idFolder}")
	public void deleteFolder(@PathVariable long idFolder) {
		folderService.deleteFolder(idFolder);
	}
}
