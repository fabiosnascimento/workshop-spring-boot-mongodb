package com.fabionascimento.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabionascimento.workshopmongo.domain.Post;
import com.fabionascimento.workshopmongo.repository.PostRepository;
import com.fabionascimento.workshopmongo.services.exception.ObjectNotFoundException;


@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
