package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cursos", path = "cursos")
public interface UserRepository extends PagingAndSortingRepository<User, Integer>,CrudRepository<User, Integer> {
    
    List<User> findByNombre(@Param("nombre") String nombre);

}