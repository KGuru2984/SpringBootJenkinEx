package com.edubridge.controllers;


import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HomeController 
{
	@ResponseBody
	@RequestMapping("")
	public Map<String, Object> test() 
	{
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("result", "Hello");
		return map;
	}
}
