package br.com.anderson.mercado.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mercado")
public class MercadoController {
	
	@RequestMapping("/entrada")
	public String exibirMensagem() {
		return "Bem vindo Anderson";
	}
}
