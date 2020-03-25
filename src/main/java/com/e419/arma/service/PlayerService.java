package com.e419.arma.service;

import java.util.List;
import com.e419.arma.model.Player;

public interface PlayerService {
	List<Player> getAll();
	Player find(String steamID);
}
