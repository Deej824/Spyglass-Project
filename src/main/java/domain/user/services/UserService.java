package domain.user.services;

import domain.user.model.User;

public interface UserService {
    User create(User user);
    User findById(Long id);
    Iterable<User> findAll();
    void delete(Long id);
}
