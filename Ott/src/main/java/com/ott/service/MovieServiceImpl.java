package com.ott.service;
import com.ott.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ott.entity.Movie;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{
    private MovieRepository productRepository;
    @Autowired
    MovieServiceImpl(MovieRepository productRepository){
        this.productRepository=productRepository;
    }
    @Override
    @Transactional
    public List<Movie> findAll() {
        return productRepository.findAll();
    }

  /*  @Override
    @Transactional
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }
*/
    @Override
    @Transactional
    public void save(Movie product) {
        productRepository.save(product);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

  /*  @Override
    @Transactional
    public int findUserIdById(int id) {
        return productRepository.findUserIdById(id);
    }*/


  /*  @Override
    @Transactional
    public void updateStatus(int id) {
        productRepository.updateStatus(id);
    }
*/
/*    @Override
    @Transactional
    public Movie findProductsByProductsId(int i) {
        return productRepository.findProductsIdByUserId;
    }
*/
    @Override
    public Page<Movie> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.productRepository.findAll(pageable);
    }

  /*  @Override
    @Transactional
    public List<Movie> findByStatus() {
        return productRepository.findByStatus();
    }*/

/*    @Override
    public List<Integer> findProductsIdByUserId(int id) {
        return productRepository.findProductsIdByUserId(id);
    }
*/
}