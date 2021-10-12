package com.ideas2it.healthcare.userservice.entity;

import java.util.List;
import java.util.UUID;

public class RoleEntity {

    private UUID roleId;
    private String roleName;
    private List<UserEntity> users;

    public RoleEntity(UUID roleId, String roleName, List<UserEntity> users) {
        super();
        this.roleId = roleId;
        this.roleName = roleName;
        this.users = users;
    }

    public RoleEntity(RoleEntityBuilder roleEntityBuilder) {
        super();
        this.roleId = roleEntityBuilder.roleId;
        this.roleName = roleEntityBuilder.roleName;
        this.users = roleEntityBuilder.users;
    }


    public UUID getRoleId() {
        return roleId;
    }

    public void setRoleId(UUID roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }

    public static class RoleEntityBuilder{
        private UUID roleId;
        private String roleName;
        private List<UserEntity> users;

        public RoleEntityBuilder roleId(UUID roleId){
            this.roleId = roleId;
            return this;
        }
        public RoleEntityBuilder roleName(String roleName){
            this.roleName = roleName;
            return this;
        }
        public RoleEntityBuilder users(List<UserEntity> users){
            this.users = users;
            return this;
        }
        public RoleEntity build(){
            return new RoleEntity(this);
        }

    }
}
