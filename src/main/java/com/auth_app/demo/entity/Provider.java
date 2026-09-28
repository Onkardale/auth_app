package com.auth_app.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Table(name = "providers")
public enum Provider {

    Local,Google ,Github
}


























