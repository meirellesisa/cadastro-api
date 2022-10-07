package br.com.diego.cadastroapi.models.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.diego.cadastroapi.models.entities.NotaFiscal;

public interface NotaFiscalRepository extends PagingAndSortingRepository<NotaFiscal, Integer>{

}
