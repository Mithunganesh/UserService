package com.ideas2it.healthcare.userservice.entity;

import java.util.Date;
import java.util.UUID;

public class UserEntity {

    private UUID userId;
    private String userName;
    private String password;
    private UUID roleId;
    private Date createdTime;
    private Date lastUpdatedTime;

    public UserEntity(UUID userId, String userName, String password, UUID roleId, Date createdTime, Date lastUpdatedTime) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.roleId = roleId;
        this.createdTime = createdTime;
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public UserEntity(UserEntityBuilder userBuilder) {
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.password = userBuilder.password;
        this.roleId = userBuilder.roleId;
        this.createdTime = userBuilder.createdTime;
        this.lastUpdatedTime = userBuilder.lastUpdatedTime;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UUID getRoleId() {
        return roleId;
    }

    public void setRoleId(UUID roleId) {
        this.roleId = roleId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public static class UserEntityBuilder{
        private UUID userId;
        private String userName;
        private String password;
        private UUID roleId;
        private Date createdTime;
        private Date lastUpdatedTime;

        public UserEntityBuilder userId(UUID userId){
            this.userId = userId;
            return this;
        }
        public UserEntityBuilder userName(String userName){
            this.userName = userName;
            return this;
        }
        public UserEntityBuilder password(String password){
            this.password = password;
            return this;
        }
        public UserEntityBuilder roleId(UUID roleId){
            this.roleId = roleId;
            return this;
        }
        public UserEntityBuilder createdTime(Date createdTime){
            this.createdTime = createdTime;
            return this;
        }

        public UserEntityBuilder lastUpdatedTime(Date lastUpdatedTime){
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public UserEntity build(){
            UserEntity entity = new UserEntity(this);
            return entity;
        }
    }
}
