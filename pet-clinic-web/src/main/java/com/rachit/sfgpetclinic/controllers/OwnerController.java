package com.rachit.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

	
	@RequestMapping({"/Owners","/Owners/index","/Owners/index.html"})
	public String listOwners() {
		return "Owners/index";
	}
}
