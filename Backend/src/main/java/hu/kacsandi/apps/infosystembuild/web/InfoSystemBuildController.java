package hu.kacsandi.apps.infosystembuild.web;

import hu.kacsandi.apps.infosystembuild.db.entity.BlogEntity;
import hu.kacsandi.apps.infosystembuild.db.entity.UserEntity;
import hu.kacsandi.apps.infosystembuild.service.InfoSystemBuildService;
import hu.kacsandi.apps.infosystembuild.service.InfoSystemBuildServiceImpl;
import hu.kacsandi.apps.infosystembuild.web.api.GetBlogsResponse;
import hu.kacsandi.apps.infosystembuild.web.api.GetUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/infosystembuild")
public class InfoSystemBuildController {


    @Autowired
    private InfoSystemBuildService infoSystemBuildService;

    @CrossOrigin(origins = "https://localhost:4200")
    @GetMapping("/blogs")
    public List<BlogEntity> blogs() {
        return infoSystemBuildService.getBlogs();
    }

    @CrossOrigin(origins = "https://localhost:4200")
    @GetMapping("/user")
    public List<UserEntity> user() {
        return  infoSystemBuildService.getUser();
    }
}
