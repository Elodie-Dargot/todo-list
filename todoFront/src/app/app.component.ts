import { Component, OnInit } from '@angular/core';
import { TaskService } from './services/task.service';
import { Task } from './models/task.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {

  tasks!: Task[];

  constructor(private taskService: TaskService ){}


  ngOnInit(): void {
    
    this.taskService.getTasks().subscribe((data) => {
      this.tasks = data;
    });
  }

}
