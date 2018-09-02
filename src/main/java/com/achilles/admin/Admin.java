package com.achilles.admin;
import javax.persistence.*;

/**
 * @author Achilles 2018-08-28
 */
@Entity
@Table(name = "admin")
public class Admin   {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String name;
    @Column(name = "password")
    private String password;
    public Admin(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
