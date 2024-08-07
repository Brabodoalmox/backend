package com.belval.maniadepets.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.belval.maniadepets.model.Produto;


@Repository
public interface ProdutoRepository {
	//Select * from Produto where descricao = <parametro>
		List<Produto> findByDescricao(String descricao);

}
