package com.arthur.workshop.services;

import com.arthur.workshop.domain.Post;
import com.arthur.workshop.domain.User;
import com.arthur.workshop.dto.UserDTO;
import com.arthur.workshop.repository.PostRepository;
import com.arthur.workshop.repository.UserRepository;
import com.arthur.workshop.services.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repository.findByTitleContainingIgnoreCase(text);
    }

}
