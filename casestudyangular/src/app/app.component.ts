import { Component } from '@angular/core';
import { Router, RouterOutlet } from '@angular/router';
import { ProjectsComponent } from './projects/projects.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'casestudyangular';

  constructor(
    private router: Router
  ){}

  goToRoute(route:string) {
    this.router.navigate([route])
  }
}