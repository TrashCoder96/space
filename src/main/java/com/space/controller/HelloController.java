package com.space.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ivan Timofeev on 23.05.2016.
 */

@RestController
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String get()
	{
		return "hello";
	}
}
