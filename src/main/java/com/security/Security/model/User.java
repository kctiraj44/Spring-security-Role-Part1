package com.security.Security.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter

public class User {

    @Id
    private int userid;
    private String username;
    private String password;
    private String email;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "User_Role_Tbl",joinColumns = @JoinColumn(name = "userid"),inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

}
