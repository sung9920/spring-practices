package com.bit2025.fileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FileuploadController {

	@RequestMapping("/")
	public String form() {
		return "form";
	}

	@RequestMapping("/upload")
	public String upload(
			@RequestParam(value="email", defaultValue="")String email,
			@RequestParam(value="file") MutipartFile multipartFiles
			Model model) {
			System.out.println("email:" + email);

			String url = fileuploadService.restore(mutipartFiles);

			model.addAttribute("url", url);
		return "result";
	}
}
