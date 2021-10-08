package com.ideas2it.healthcare.userservice.dto;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "user_table")
public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "uuid-char")
    @Column(name="user_id", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Type(type = "uuid-char")
    @Column(name = "role_id", columnDefinition = "VARCHAR(255)")
    private UUID roleId;
    @Column(name = "created_time")
    @CreationTimestamp
    private Date createdTime;
    @Column(name = "last_updated_time")
    @UpdateTimestamp
    private Date lastUpdatedTime;

    public UserDto() {
        super();
    }

    public UserDto(UUID userId, String userName, String password, UUID roleId, Date createdTime, Date lastUpdatedTime) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.roleId = roleId;
        this.createdTime = createdTime;
        this.lastUpdatedTime = lastUpdatedTime;
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
}
