package hu.kacsandi.apps.infosystembuild.web.api;

import hu.kacsandi.apps.infosystembuild.db.entity.BlogEntity;

import java.util.List;

public class GetBlogsResponse {

    private List<BlogEntity> blogEntities;

    public List<BlogEntity> getBlogEntities() {
        return blogEntities;
    }

    public void setBlogEntities(List<BlogEntity> blogEntities) {
        this.blogEntities = blogEntities;
    }
}
