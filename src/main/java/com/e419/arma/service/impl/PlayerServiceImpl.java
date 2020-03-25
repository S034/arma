package com.e419.arma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.e419.arma.dao.PlayerDao;
import com.e419.arma.model.Player;
import com.e419.arma.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService{
	@Autowired
	 private PlayerDao playerDao;
	 @Override
	 public List<Player> getAll() {
	     return playerDao.getAll();
	 }
	 
	 @Override
	 public Player find(String steamID) {
		 return playerDao.find(steamID);
	 }
}
