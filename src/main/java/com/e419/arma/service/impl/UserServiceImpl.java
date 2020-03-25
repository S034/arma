package com.e419.arma.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.e419.arma.dao.UserDao;
import com.e419.arma.model.User;
import com.e419.arma.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	 @Autowired
	 private UserDao userDao;
	 
	 @Override
	 public List<User> getAll() {
	     return userDao.getAll();
	 }
	 
	 @Override
	 public int insert(User user) {
	     return userDao.insert(user);
	 }
	 
	 @Override
	 public int delete(String steamID) {
	     return userDao.delete(steamID);
	 }
	 
	 @Override
	 public int update(User user) {
		 User userOutVo=null;
		 if(user!=null && !StringUtils.isEmpty(user.getSteamID())) {
			 userOutVo=userDao.find(user.getSteamID());
			 if(userOutVo!=null) {
				 userOutVo.setName(user.getName());
				 userOutVo.setPassword(user.getPassword());
			 }
		 }
		 return userDao.update(userOutVo);
	 }

	 @Override
	 public User find(String steamID) {
		 return userDao.find(steamID);
	 }
}
