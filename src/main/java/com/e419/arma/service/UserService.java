package com.e419.arma.service;

import java.util.List;
import com.e419.arma.model.User;

public interface UserService {
	List<User> getAll();
    int insert(User user);
    int delete(String steamID);
    int update(User user);
    User find(String steamID);
}
