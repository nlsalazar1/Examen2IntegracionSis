package com.springboot.pruebaapis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		for (Factura factura : listadoFactura) {
	        System.out.println(factura);
	    }
		model.addAttribute("titulo", "Lista de Facturas");
		model.addAttribute("facturas", listadoFactura);
		return "/views/facturas/listar";
	}
	
	@GetMapping("/create")
	public String crear(Model model) {
		
		Factura factura = new Factura();
		
		model.addAttribute("titulo", "Formulario:   Nueva Factura"); //Enviamos informacion al formulario
		model.addAttribute("factura", factura);
		
		
		return "/views/facturas/frmCrear";
	}
	
	//@Secured("ROLE_ADMIN") //video 12 seguridad
		@PostMapping("/save")
		public String guardar(@ModelAttribute Factura factura, BindingResult result, //@BindigResult captura los errores del formulario 
				Model model, RedirectAttributes attribute) { //RedirectAttributes utilizamos para dar los mensajes de exito o error de la plantilla - video 14 crud
			
			//List<Factura> listCiudades = facturaService.listarTodos();
			
			if(result.hasErrors()) {
				
				
				model.addAttribute("titulo", "Formulario: Nuevo Cliente"); //Enviamos informacion al formulario
				model.addAttribute("factura", factura);
				//model.addAttribute("ciudades", listCiudades);
				System.out.println("Existieron errores en el formulario..!!!");
				
				return "/views/facturas/frmCrear";
			}
			
			facturaService.guardar(factura);
			
			System.out.println("Factura guardada con exito..!!!");
			attribute.addFlashAttribute("success","Factura guardado con exito..!!!");
			return "redirect:/views/facturas/";
		}
}

