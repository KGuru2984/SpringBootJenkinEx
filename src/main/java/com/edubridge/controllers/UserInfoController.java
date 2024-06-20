package com.edubridge.controllers;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.model.UserInfo;
import com.edubridge.service.UserInfoService;

@RestController
@RequestMapping("/user")
public class UserInfoController 
{
	@Autowired
	UserInfoService userinfoservice;

	@ResponseBody
	@RequestMapping("")
	public List<UserInfo> getAllUsers() 
	{
	return userinfoservice.getAllUserInfo();
	}
	
	@ResponseBody
	@RequestMapping("/{id}")
	public UserInfo getUser(@PathVariable("id") Integer id) 
	{
	return userinfoservice.getUserInfo(id);
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> createUser(@RequestParam(value = "userid") Integer userid, @RequestParam(value = "username") String username) 
	{
		Map<String, Object> map = new LinkedHashMap<>();
		userinfoservice.createUserInfo(userid, username);
		map.put("result", "added");
		return map;
	}
		
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public Map<String, Object> updateUser(@RequestParam(value = "userid") Integer userid, @RequestParam(value = "username") String username) 
	{
		Map<String, Object> map = new LinkedHashMap<>();
		userinfoservice.updateUserInfo(userid, username);
		map.put("result", "updated");
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> deleteUser(@PathVariable("id") Integer userid) 
	{
		Map<String, Object> map = new LinkedHashMap<>(); 
		userinfoservice.deleteUserInfo(userid); 
		map.put("result", "deleted");
		return map;
	}

}
