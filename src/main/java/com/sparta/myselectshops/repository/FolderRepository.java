package com.sparta.myselectshops.repository;

import com.sparta.myselectshops.entity.Folder;
import com.sparta.myselectshops.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);

    List<Folder> findAllByUser(User user);
}
