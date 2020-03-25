package com.e419.arma.dao;

import java.util.List;
import com.e419.arma.model.Player;

public interface PlayerDao {
	List<Player> getAll();
	Player find(String steamID);
}
