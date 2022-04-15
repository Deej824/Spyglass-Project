package domain.user.services;

import domain.user.exception.UserNotFoundException;
import domain.user.model.User;
import domain.user.repo.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private UserService userService;
    private UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User create(User user) {
        return userRepo.save(user);
    }

    @Override
    public User findById(Long id) {
        Optional<User> userOptional = userRepo.findById(id);
        if(userOptional.isEmpty())
            throw new UserNotFoundException("User not found");
        return userOptional.get();
    }

    @Override
    public Iterable<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<User> userOptional = userRepo.findById(id);
        if(userOptional.isEmpty())
            throw  new UserNotFoundException("User not found");
        User userToRemove = userOptional.get();
        userRepo.delete(userToRemove);
    }
}
