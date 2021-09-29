package com.ott.service;
import java.util.List;
import java.util.Optional;
import com.ott.entity.Movie;
import org.springframework.data.domain.Page;

public interface MovieService {
    List<Movie> findAll();
    //Optional<Movie> findById(int id);
    void save(Movie product);
    void deleteById(int id);

   // Movie findProductsByProductsId(int i);

    Page<Movie> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}