package hu.kacsandi.apps.infosystembuild.service;

import hu.kacsandi.apps.infosystembuild.db.entity.BlogEntity;

import java.util.List;

public interface InfoSystemBuildService {

    List<BlogEntity> getBlogs();
}
