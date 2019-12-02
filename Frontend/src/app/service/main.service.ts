import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Blog } from '../model/blog';
import { Observable } from 'rxjs';
import { Users } from '../model/users';

@Injectable({
  providedIn: 'root'
})
export class MainService {

  baseURL = '/api/v1/infosystembuild';

  constructor(private http: HttpClient) { }

  getBlogs(): Observable<Blog[]> {
    return this.http.get<Blog[]>(this.baseURL + '/blogs');
  }

  getUsers(): Observable<Users[]> {
    return this.http.get<Users[]>(this.baseURL + '/user');
  }
}
