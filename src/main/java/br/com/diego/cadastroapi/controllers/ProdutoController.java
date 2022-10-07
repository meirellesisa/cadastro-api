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

import br.com.diego.cadastroapi.models.entities.Produtos;
import br.com.diego.cadastroapi.models.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
//--------------INSERT--------------------------	
	@PostMapping("/cadastrar")
	public @ResponseBody Produtos novoProduto(@Valid Produtos produto ) {
		
		produtoRepository.save(produto);
		return produto;
	}

//----------------- UPDATE----------------------
	@PutMapping("/atualizar")
	public @ResponseBody Produtos atualizarProduto(@Valid Produtos produto ) {
		
		produtoRepository.save(produto);
		return produto;
	}
	
//------------READE----------------------------------------
	
	@GetMapping(path = "/consultar/pagina/{numeroPagina}/{quantidadePagina}")
	public Iterable<Produtos> obterProdutoPorPagina(
			@PathVariable int numeroPagina, 
			@PathVariable int quantidadePagina){
		
		Pageable page = PageRequest.of(numeroPagina, quantidadePagina);
	
		return produtoRepository.findAll(page);
	}
	
	@GetMapping(path = "consultar/nome/{nome}" ) 
	public Iterable<Produtos> obterProdutosPorNome(
			@PathVariable String nome) {
		
	 return produtoRepository.findByNomeContainingIgnoreCase(nome);
	}
	
	
//----------------------DELETE------------------------	
	@DeleteMapping(path = "/deletar/id/{id}")
	public void deletarProduto(@PathVariable int id ) {
		
		produtoRepository.deleteById(id);
		
	}


}
