package com.edubridge.service;

import java.util.List;

import com.edubridge.model.UserInfo;

public interface UserInfoService 
{
	List<UserInfo> getAllUserInfo();
	UserInfo getUserInfo(Integer userid);
	void createUserInfo(Integer userid,String username);
	void updateUserInfo(Integer userid,String username);
	void deleteUserInfo(Integer userid);
}
