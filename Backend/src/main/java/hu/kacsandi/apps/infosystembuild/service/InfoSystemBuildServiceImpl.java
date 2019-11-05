package hu.kacsandi.apps.infosystembuild.service;

import hu.kacsandi.apps.infosystembuild.db.entity.BlogEntity;
import hu.kacsandi.apps.infosystembuild.db.repo.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoSystemBuildServiceImpl implements InfoSystemBuildService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<BlogEntity> getBlogs() {return blogRepository.findAll();}
}
