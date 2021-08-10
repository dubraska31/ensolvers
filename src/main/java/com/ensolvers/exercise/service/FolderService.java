package com.ensolvers.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensolvers.exercise.model.Folder;
import com.ensolvers.exercise.repository.FolderRepository;

@Service
public class FolderService {
	
	@Autowired
	FolderRepository folderRepository;

	public List<Folder> getAllFolders() {
		return folderRepository.findAll();
	}

	public Folder getFolderById(long idFolder) {
		return folderRepository.findById(idFolder).get();
	}

	public Folder saveFolder(Folder folder) {
		return folderRepository.save(folder);
	}

	public Folder updateFolder(Folder folder) {
		return folderRepository.save(folder);
	}

	public void deleteFolder(long idFolder) {
		folderRepository.deleteById(idFolder);
	}
}


