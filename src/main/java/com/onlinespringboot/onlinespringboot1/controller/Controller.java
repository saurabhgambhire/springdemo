package com.onlinespringboot.onlinespringboot1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
	@RequestMapping("/save")
	public String saveData()
	{
		return "Save Data method ";
	}
}
