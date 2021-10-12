package com.ideas2it.healthcare.userservice.dto;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="role_table")
public class RoleDto {
    @Id
    @Column(name = "role_id", columnDefinition = "VARCHAR(200)", insertable = false, updatable = false, nullable = false)
    @Type(type = "uuid-char")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID roleId;
    @Column(name = "role_name")
    private String roleName;
    @OneToMany(targetEntity = UserDto.class,fetch = FetchType.EAGER,cascade =CascadeType.ALL)
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    private List<UserDto> users;

    public RoleDto() {
    }

    public RoleDto(UUID roleId, String roleName, List<UserDto> users) {
        super();
        this.roleId = roleId;
        this.roleName = roleName;
        this.users = users;
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

    public List<UserDto> getUsers() {
        return users;
    }

    public void setUsers(List<UserDto> users) {
        this.users = users;
    }
}
