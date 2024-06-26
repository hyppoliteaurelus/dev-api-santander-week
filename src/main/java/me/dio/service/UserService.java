package me.dio.service;

import me.dio.domain.model.User;

import java.util.List;

public interface UserService {
    User findById (Long id);

    User create(User userToCreate);

    User update(Long id, User userToUpdate);

    void delete(Long id);

    List<User> findAll();


}
