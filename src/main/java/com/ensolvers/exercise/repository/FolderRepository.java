package com.ensolvers.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensolvers.exercise.model.Folder;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {

}
