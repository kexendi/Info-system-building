package hu.kacsandi.apps.infosystembuild.service;

import hu.kacsandi.apps.infosystembuild.db.entity.BlogEntity;
import hu.kacsandi.apps.infosystembuild.db.entity.UserEntity;

import java.util.List;

public interface InfoSystemBuildService {

    List<BlogEntity> getBlogs();
    List<UserEntity> getUser();
    List<UserEntity> getAdmin();
}
