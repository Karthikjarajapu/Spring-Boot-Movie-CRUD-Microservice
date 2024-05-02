package com.wipro.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.movie.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
