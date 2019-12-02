import { Component, OnInit } from '@angular/core';
import { MainService } from 'src/app/service/main.service';
import { Blog } from 'src/app/model/blog';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.scss']
})
export class NewsComponent implements OnInit {

  blogs: Blog[];

  constructor(private mainService: MainService) { }

  ngOnInit() {
    this.mainService.getBlogs().subscribe(data => {
      this.blogs = data;

      console.log("miez?: ", this.blogs);
    });

  }

}
