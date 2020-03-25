package com.e419.arma.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.e419.arma.model.Basic;
import com.e419.arma.model.Cfg;
import com.e419.arma.model.Difficulty;
import com.e419.arma.model.Param;
import com.e419.arma.model.Status;
import com.e419.arma.service.CfgService;

@RestController
@RequestMapping("/cfg")
public class CfgController {
	@Autowired
	CfgService cfgService;

	@RequestMapping(value = { "/getCfgList" }, method = RequestMethod.POST)
	public Cfg getCfgList() {
		return cfgService.getAll();
	}
	
	@RequestMapping(value = { "/getBasicList" }, method = RequestMethod.POST)
	public Basic getBasicList() {
		return cfgService.getBasic();
	}
	
	@RequestMapping(value = { "/getDifficultyList" }, method = RequestMethod.POST)
	public Difficulty getDifficultyList() {
		return cfgService.getDifficulty();
	}
	
	@RequestMapping(value = { "/getParamList" }, method = RequestMethod.POST)
	public Param getParamList() {
		return cfgService.getParam();
	}

	@RequestMapping(value = { "/setCfg" }, method = RequestMethod.POST)
	@ResponseBody
	public int setCfgList(@RequestBody Cfg cfg) throws IOException {
		if(cfg.getSecurityCode().contentEquals(cfgService.getSecurityCode())) {
			cfgService.setAll(cfg);
			cfgService.writeCfg();
			return 1;
		}else {
			return 0;
		}
	}
	
	@RequestMapping(value = { "/setBasic" }, method = RequestMethod.POST)
	@ResponseBody
	public int setBasic(@RequestBody Basic basic) throws IOException {
		if(basic.getSecurityCode().contentEquals(cfgService.getSecurityCode())) {
			cfgService.setBasic(basic);
			cfgService.writeBasic();
			return 1;
		}else {
			return 0;
		}
	}
	
	@RequestMapping(value = { "/setDifficulty" }, method = RequestMethod.POST)
	@ResponseBody
	public int setDifficultyList(@RequestBody Difficulty difficulty) throws IOException {
		if(difficulty.getSecurityCode().contentEquals(cfgService.getSecurityCode())) {
			cfgService.setDifficulty(difficulty);
			cfgService.writeDifficulty();
			return 1;
		}else {
			return 0;
		}
	}
	
	@RequestMapping(value = { "/setParam" }, method = RequestMethod.POST)
	@ResponseBody
	public int setParam(@RequestBody Param param) throws IOException {
		if(param.getSecurityCode().contentEquals(cfgService.getSecurityCode())) {
			cfgService.setParam(param);
			return 1;
		}else {
			return 0;
		}
	}
	
	@RequestMapping(value = { "/startUp" }, method = RequestMethod.POST)
	@ResponseBody
	public int startUp(@RequestParam String securityCode) throws IOException {
		if(securityCode.contentEquals(cfgService.getSecurityCode())) {
			int result=cfgService.startUp();
			if(result==1) {
				return 1;
			}else {
				return 2;
			}
		}else {
			return 0;
		}
	}
	
	@RequestMapping(value = { "/shutDown" }, method = RequestMethod.POST)
	@ResponseBody
	public int shutDown(@RequestParam String securityCode) throws IOException {
		if(securityCode.contentEquals(cfgService.getSecurityCode())) {
			int result=cfgService.shutDown();
			if(result==1) {
				return 1;
			}else {
				return 2;
			}
		}else {
			return 0;
		}
	}
	
	@RequestMapping(value = { "/status" }, method = RequestMethod.POST)
	@ResponseBody
	public Status status() throws IOException {
		return cfgService.status();
	}
}
