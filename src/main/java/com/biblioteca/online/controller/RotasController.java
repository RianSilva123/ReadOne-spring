package com.biblioteca.online.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RotasController {
	
	@GetMapping("/home")
	public String Home() {
		return "Home";
	}
	
	@GetMapping("/login")
	public String Logar() {
		return "Login";
	}
	
	@GetMapping("/cadastro")
	public String Cadastrar() {
		return "Cadastro";
	}
	
	@GetMapping("/rec")
	public String Redefinir() {
		return "rec";
	}
}
