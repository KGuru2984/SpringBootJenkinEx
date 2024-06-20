package com.edubridge.servie.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edubridge.model.UserInfo;
import com.edubridge.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService
{
	public static List<UserInfo> userinfo;

	public UserInfoServiceImpl()
	{
		userinfo = new LinkedList<>();
		userinfo.add(new UserInfo(100, "David"));
		userinfo.add(new UserInfo(101, "Peter"));
		userinfo.add(new UserInfo(102, "John"));
		
	}
	@Override
	public List<UserInfo> getAllUserInfo() {
		// TODO Auto-generated method stub
		return this.userinfo;
	}

	@Override
	public UserInfo getUserInfo(Integer userid) {
		// TODO Auto-generated method stub
				return userinfo.stream()
				.filter(x -> x.getUserid() == userid)
				.findAny()
				.orElse(new UserInfo(0, "Not Available"));
	}

	@Override
	public void createUserInfo(Integer userid, String username) {
		// TODO Auto-generated method stub
		UserInfo user = new UserInfo(userid, username);
		this.userinfo.add(user);

	}

	@Override
	public void updateUserInfo(Integer userid, String username) {
		// TODO Auto-generated method stub
		userinfo.stream()
		.filter(x -> x.getUserid() == userid)
		.findAny()
		.orElseThrow(() -> new RuntimeException("Item not found"))
		.setUsername(username);
	}

	@Override
	public void deleteUserInfo(Integer userid) {
		// TODO Auto-generated method stub
		userinfo.removeIf((UserInfo u) -> u.getUserid() == userid);
	}

}
