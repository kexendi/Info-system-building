package hu.kacsandi.apps.infosystembuild.service;

import hu.kacsandi.apps.infosystembuild.db.entity.BlogEntity;
import hu.kacsandi.apps.infosystembuild.db.entity.UserEntity;
import hu.kacsandi.apps.infosystembuild.db.repo.BlogRepository;
import hu.kacsandi.apps.infosystembuild.db.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoSystemBuildServiceImpl implements InfoSystemBuildService {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<BlogEntity> getBlogs() {return blogRepository.findAll();}

    @Override
    public List<UserEntity> getUser() { return userRepository.getAllUser("USER");}

    @Override
    public List<UserEntity> getAdmin() { return userRepository.getAllAdmin("ADMIN");}
}
