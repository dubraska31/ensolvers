package com.ensolvers.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ensolvers.exercise.model.Folder;

public interface FolderRepository extends JpaRepository<Folder, Long> {

}
