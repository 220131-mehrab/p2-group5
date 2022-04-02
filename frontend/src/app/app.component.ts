import { Component } from '@angular/core';
//import{loginbutton} from'../mainmovie';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend';

 //ac=document.getElementById('#app_container');
 Loginbn(){
  let app = (id : 'app_container') : HTMLDivElement => {
    let app1= document.getElementById(id);
    if (!(app1 instanceof HTMLDivElement)) {
      throw new Error('Can\'t access "${id}"');
    }
    return app1;
  };
  let name = (id : 'Name_movie') : HTMLDivElement => {
    let name1 = document.getElementById(id);
    if (!(name1 instanceof HTMLDivElement)) {
      throw new Error('Can\'t access "${id}"');
    }
    return name1;
  };
  let Namediv: HTMLDivElement = <HTMLDivElement> document.getElementById('app_container');

  let appdiv: HTMLDivElement = <HTMLDivElement> document.getElementById('Name_movie');

  Namediv.style.left = "-100%";
  appdiv.style.left = "40%";

};
}


