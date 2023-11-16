package com.wildCodeSchool.todoBack;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.wildCodeSchool.todoBack.entity.Task;
import com.wildCodeSchool.todoBack.repository.TaskRepository;

@SpringBootApplication
public class TodoBackApplication {

	private TaskRepository taskRepository;

	public TodoBackApplication(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TodoBackApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return (String[] args) -> {
			Task task1 = new Task("Rédiger cours Angular", "Rédiger cours Angular", "High", "In Progress");
			taskRepository.save(task1);
			Task task2 = new Task("Rédiger cours RXjs", "Rédiger cours RXjs", "High", "In Progress");
			taskRepository.save(task2);
		};
	}

}
