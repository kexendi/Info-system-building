import { Component, OnInit } from '@angular/core';
import { MainService } from 'src/app/service/main.service';
import { Blogs } from 'src/app/model/blogs';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.scss']
})
export class NewsComponent implements OnInit {

  blogs: any;

  constructor(private mainService: MainService) { }

  ngOnInit() {
    this.mainService.getBlogs().subscribe(data => {
      this.blogs = Object.keys(data).map(key => ({entity: key, blogs: data[key]}));

      console.log("miez?: ", this.blogs);
    });

  }

}
