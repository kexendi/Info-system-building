package hu.kacsandi.apps.infosystembuild.web;

import hu.kacsandi.apps.infosystembuild.service.InfoSystemBuildService;
import hu.kacsandi.apps.infosystembuild.web.api.GetBlogsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/infosystembuild")
public class InfoSystemBuildController {


    private InfoSystemBuildService infoSystemBuildService;

    @CrossOrigin(origins = "https://localhost:4200")
    @GetMapping("/blogs")
    public GetBlogsResponse blogs() {
        GetBlogsResponse response = new GetBlogsResponse();
        response.setBlogEntities(infoSystemBuildService.getBlogs());
        return response;
    }
}
