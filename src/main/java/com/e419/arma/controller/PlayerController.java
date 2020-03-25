package com.e419.arma.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.e419.arma.model.Player;
import com.e419.arma.service.PlayerService;
@RestController
@RequestMapping("/player")
public class PlayerController {
	@Autowired
    PlayerService playerService;
	
	@RequestMapping(value={"/getPlayerList"}, method=RequestMethod.POST)
	public List<Player> getPlayerList(){
		return playerService.getAll();
	}
	
	@RequestMapping(value={"/findPlayer"}, method=RequestMethod.POST)
	@ResponseBody
	public Player findPlayer(@RequestParam String steamID){
		return playerService.find(steamID);
	}
}
