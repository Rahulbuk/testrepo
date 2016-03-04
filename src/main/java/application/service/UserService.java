package application.service;

import application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import application.repository.UserRepository;

/**
 * Created by Rahul Bhandwalkar on 3/4/2016.
 */
@Service
@Transactional
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public Iterable<User> getAllUser(){

        return userRepo.findAll();

    }
}
