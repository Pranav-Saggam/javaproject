package com.ott.service;


import com.ott.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ott.entity.User;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    @Transactional
    public List<User> findAll(){
        return userRepository.findAll();
    }
    @Override
    @Transactional
    public User findById(int id) {
        Optional<User> user=userRepository.findById(id);
        if(user.isPresent())
            return user.get();
        throw new RuntimeException("User Not Found:"+id);
    }
    @Override
    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }
    @Override
    @Transactional
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    @Override
    @Transactional
    public String findPasswordById(int id) {
        return userRepository.findPasswordById(id);
    }

    @Override
    public Page<User> findPaginated(int pageNo, int pageSize) {
        Pageable pageable= PageRequest.of(pageNo-1,pageSize);
        return this.userRepository.findAll(pageable);
    }
}