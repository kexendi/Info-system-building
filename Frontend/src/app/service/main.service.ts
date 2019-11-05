import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Blogs } from '../model/blogs';

@Injectable({
  providedIn: 'root'
})
export class MainService {

  constructor(private http: HttpClient) { }

  getBlogs() {
    return this.http.get<Blogs>('/api/blogs');
  }
}
