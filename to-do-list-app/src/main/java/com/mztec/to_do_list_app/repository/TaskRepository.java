package com.mztec.to_do_list_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mztec.to_do_list_app.model.Task;


public interface TaskRepository extends JpaRepository<Task, Long> {

}