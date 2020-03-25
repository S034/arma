package com.e419.arma.dao;

import java.util.List;
import com.e419.arma.model.User;

public interface UserDao {
	List<User> getAll();
    User find(String steamID);
    int insert(User user);
    int delete(String steamID);
    int update(User user);
}
