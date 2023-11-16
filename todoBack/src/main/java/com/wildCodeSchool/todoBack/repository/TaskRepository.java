package com.wildCodeSchool.todoBack.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wildCodeSchool.todoBack.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
