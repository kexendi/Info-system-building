import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Blogs } from '../model/blogs';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MainService {

  baseURL = '/api/v1/infosystembuild';

  constructor(private http: HttpClient) { }

  getBlogs(): Observable<Blogs[]> {
    return this.http.get<Blogs[]>(this.baseURL + '/blogs');
  }
}
