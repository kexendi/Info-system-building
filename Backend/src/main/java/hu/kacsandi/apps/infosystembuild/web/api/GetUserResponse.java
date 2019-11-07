package hu.kacsandi.apps.infosystembuild.web.api;

import hu.kacsandi.apps.infosystembuild.db.entity.UserEntity;

import java.util.List;

public class GetUserResponse {

    private List<UserEntity> userEntity;

    public List<UserEntity> getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(List<UserEntity> userEntity) {
        this.userEntity = userEntity;
    }
}
