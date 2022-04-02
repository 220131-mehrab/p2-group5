import { Component } from '@angular/core';

@Component({
  selector: 'mainmovie',
  templateUrl: './mainmovie.html',
  styleUrls: ['./mainmovie.css']
})
export class mainmovieComponent {
  title = 'Nextflix';
 Loginbn(){
      window.location.href="mainmovie.html";
  }

}

export const loginbutton = {
value: 'Login',
title: 'Click to login'
}
