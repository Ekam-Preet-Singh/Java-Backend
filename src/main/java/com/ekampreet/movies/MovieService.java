package com.ekampreet.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository mRepository;

    public List<Movie> allMovies() {
        return mRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return mRepository.findMovieByImdbId(imdbId);
    }
}
