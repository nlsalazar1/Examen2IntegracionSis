package com.springboot.pruebaapis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.pruebaapis.entity.Factura;
import com.springboot.pruebaapis.service.IFacturaService;

@Controller
@RequestMapping("/views/facturas")
public class FacturaController {

	@Autowired
	private IFacturaService facturaService;
	
	@GetMapping("/")
	public String listarFacturas(Model model) {
		List<Factura> listadoFactura = facturaService.listarTodos();
		
		model.addAttribute("titulo", "Lista de Facturas");
		model.addAttribute("facturas", listadoFactura);
		return "/views/facturas/listar";
	}
}

