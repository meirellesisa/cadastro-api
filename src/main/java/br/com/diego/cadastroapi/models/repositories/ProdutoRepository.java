package br.com.diego.cadastroapi.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.diego.cadastroapi.models.entities.Produtos;

public interface ProdutoRepository 
    extends PagingAndSortingRepository<Produtos, Integer>, JpaRepository<Produtos,Integer> {


	public Iterable<Produtos> findByNomeContainingIgnoreCase(String nome);
}
