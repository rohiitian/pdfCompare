package com.springproject.pdfcompare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PDFComparer {
	
	@GetMapping("/home")
	public String home() {
		return "Hi Rohit ,  here we start our rest application";
	}

}
