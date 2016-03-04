package application.service;

import application.model.User;

/**
 * Created by Rahul Bhandwalkar on 3/4/2016.
 */
public interface IUserService {
    Iterable<User> getAllUser();
}
