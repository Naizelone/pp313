package com.example.pp3_1_2.entity;

public enum Permission {
    USER("permission:user"), ADMIN("permission:admin");

    private final String permission;
    Permission(String permission){
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
