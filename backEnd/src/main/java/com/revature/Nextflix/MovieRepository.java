package com.revature.Nextflix;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface class MovieRepository extends CrudRepository<Movie, Integer> {
    Movie findByID(int id);
}
