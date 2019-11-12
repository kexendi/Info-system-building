import { Component, OnInit } from '@angular/core';
import { MainService } from 'src/app/service/main.service';
import { Blogs } from 'src/app/model/blogs';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.scss']
})
export class NewsComponent implements OnInit {

  blogs: Blogs[];

  constructor(private mainService: MainService) { }

  ngOnInit() {
    this.mainService.getBlogs().subscribe(data => {
      this.blogs = data;
    });

  }

}
