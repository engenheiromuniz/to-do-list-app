package com.mztec.to_do_list_app.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String title;
	private String description;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private  LocalDate starDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dueDate;
	
	public Task(Long id, String title, String description, LocalDate starDate, LocalDate dueDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.starDate = starDate;
		this.dueDate = dueDate;
	}	

}
