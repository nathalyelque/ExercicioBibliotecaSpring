package com.biblioteca.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.biblioteca.model.Livro;
import com.biblioteca.biblioteca.repository.LivrosRepository;

@RestController
@RequestMapping("/livros")
@CrossOrigin("*")
public class LivrosController {
	
	@Autowired
	private LivrosRepository repositorioDeLivros;
	
	@GetMapping
	public ResponseEntity<List<Livro>> GetAll(){
		return ResponseEntity.ok(repositorioDeLivros.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Livro> GetById(@PathVariable long id){
		return repositorioDeLivros.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Livro> Post(@RequestBody Livro livro){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorioDeLivros.save(livro));
	}
	
	@PutMapping
	public ResponseEntity<Livro> Put(@RequestBody Livro livro){
		return ResponseEntity.status(HttpStatus.OK).body(repositorioDeLivros.save(livro));
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable long id) {
		repositorioDeLivros.deleteById(id);
	}
	
}
