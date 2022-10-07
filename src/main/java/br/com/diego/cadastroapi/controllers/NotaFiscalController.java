package br.com.diego.cadastroapi.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.diego.cadastroapi.models.entities.NotaFiscal;
import br.com.diego.cadastroapi.models.repositories.NotaFiscalRepository;

@RestController
@RequestMapping("/api/notaFiscal")
public class NotaFiscalController {
	
	
	@Autowired
	private NotaFiscalRepository notaFiscalRepositry;
	
	
	
	
	
//----------INSERT-----------------------------------
	
	@PostMapping("/cadastrar")
	public @ResponseBody NotaFiscal cadastrarNota( @Valid NotaFiscal notaFiscal) {
		
		notaFiscalRepositry.save(notaFiscal);
		
		return notaFiscal;
		
	}
	
	
	
//--------UPDATE-------------------------------------
	
	@PutMapping("/atualizar")
	public @ResponseBody NotaFiscal atualizarNota( @Valid NotaFiscal notaFiscal) {
		
		notaFiscalRepositry.save(notaFiscal);
		
		return notaFiscal;
		
	}
	
//------------READ---------------------------
	

	@GetMapping("/consultar/pagina/{numeroPaginas}/{qtdDeRegistros}")
	public Iterable<NotaFiscal> obterNotaPorPagina(
			@PathVariable int numeroPaginas,
			@PathVariable int qtdDeRegistros){
		
		Pageable page= PageRequest.of(numeroPaginas, qtdDeRegistros);
		
		 return notaFiscalRepositry.findAll(page);
		

	}
	
//-----------------DELETED------------------------
	
	@DeleteMapping("/deletar/id/{id}")
	public void deletarNota(@PathVariable int id) {
		
		notaFiscalRepositry.deleteById(id);
		
	}
	
}
