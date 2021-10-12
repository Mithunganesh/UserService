package com.ideas2it.healthcare.userservice.entity;

public class RoleSearchEntity {
    private String userName;
    private String roleName;

    public RoleSearchEntity() {}

    public RoleSearchEntity(String userName, String roleName) {
        this.userName = userName;
        this.roleName = roleName;
    }

    public RoleSearchEntity(RoleSearchEntityBuilder roleSearchEntityBuilder) {
        this.userName = roleSearchEntityBuilder.userName;
        this.roleName = roleSearchEntityBuilder.roleName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public static class RoleSearchEntityBuilder{
        private String userName;
        private String roleName;
        public RoleSearchEntityBuilder userName(String userName){
            this.userName = userName;
            return this;
        }
        public RoleSearchEntityBuilder roleName(String roleName){
            this.roleName = roleName;
            return this;
        }
        public RoleSearchEntity build(){
            RoleSearchEntity roleSearchEntity = new RoleSearchEntity(this);
            return roleSearchEntity;
        }
    }
}
