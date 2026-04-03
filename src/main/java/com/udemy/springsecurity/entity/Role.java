package com.udemy.springsecurity.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Getter
public enum Role {
    USER(Set.of(Permissions.GET)),
    ADMIN(Set.of(Permissions.DELETE,Permissions.WRITE,Permissions.UPDATE));

    private final Set<Permissions> permissions;

    Role(Set<Permissions> permissions) {
        this.permissions = permissions;
    }
}
