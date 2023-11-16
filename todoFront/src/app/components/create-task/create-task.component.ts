import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Task } from 'src/app/models/task.model';
import { TaskService } from 'src/app/services/task.service';

@Component({
  selector: 'app-create-task',
  templateUrl: './create-task.component.html',
  styleUrls: ['./create-task.component.scss']
})
export class CreateTaskComponent implements OnInit {
  taskForm!: FormGroup; 

  constructor(private formBuilder: FormBuilder,
              private service: TaskService) {}

  ngOnInit() {

    this.taskForm = this.formBuilder.group({
      title: ['', Validators.required],
      description: [''],
      priority: [''],
      status: ['']
    });
  }

  saveTask(task: Task) {
    this.service.createTask(task);
    console.log(task);
  }
}
