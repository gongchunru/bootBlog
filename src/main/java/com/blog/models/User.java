package com.blog.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by gongchunru
 * Date：2017/8/10.
 * Time：19:08
 */
@Entity
@Table(name = "user")
public class User extends BaseModel{

    @Column(unique = true)
    private String email;


    private String password;

}
