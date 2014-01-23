package br.com.magazineluiza.garantiademargem.br.com.magazineluiza.garantiademargem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "bla");
		return "hello";
	}

    @RequestMapping(method = RequestMethod.GET, value = "/nova")
    public String nova(ModelMap model) {
        return "nova";
    }
}