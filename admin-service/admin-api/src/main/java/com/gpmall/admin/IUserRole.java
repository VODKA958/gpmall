package com.gpmall.admin;

/**
 * 用户权限获取
 */
public interface IUserRole {
    boolean hasRole(String userID,String roleID);
}
