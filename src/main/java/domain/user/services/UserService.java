package domain.user.services;

import domain.user.exception.UserNotFoundException;
import domain.user.model.User;

public interface UserService {
    User create(User user);
    User findById(Long id) throws UserNotFoundException;
    Iterable<User> findAll();
    void delete(Long id) throws UserNotFoundException;
}
