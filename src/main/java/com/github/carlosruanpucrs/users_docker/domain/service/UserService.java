package com.github.carlosruanpucrs.users_docker.domain.service;

import com.github.carlosruanpucrs.users_docker.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private List<User> database = new ArrayList<>();

    @Autowired
    public UserService() {
       setup();
    }

    public List<User> findAll() {
        return database.stream()
                .collect(Collectors.toList());
    }

    public User findById(Integer id) {
       return database.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .get();
    }

    public void create(User user) {
        database.add(user);
    }

    public void delete(Integer id) {
        User user = findById(id);
        database.remove(user);
    }

    private void setup() {
        User u1 = new User(1, "Carlos Ruan", "Grêmio", "Andryi Shevchenko", 23);
        User u2 = new User(2, "Emannuel", "Internacional", "D'Alessandro", 24);
        User u3 = new User(3, "Vanessa", "Chelsea", "Eden Hazard", 18);
        User u4 = new User(4, "Larissa", "Milan", "Fernando Torres", 19);
        User u5 = new User(5, "Luan", "Grêmio", "Neymar", 28);
        User u6 = new User(6, "Roberta", "Napoli", "Mertens", 31);
        User u7 = new User(7, "Diego", "Grêmio", "Cristiano Ronaldo", 23);

        database.add(u1);
        database.add(u2);
        database.add(u3);
        database.add(u4);
        database.add(u5);
        database.add(u6);
        database.add(u7);
    }

}
