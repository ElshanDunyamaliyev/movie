package dev.elshan.movies.service;

import dev.elshan.movies.model.Movie;
import dev.elshan.movies.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Movie getMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }


}
