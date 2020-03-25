package com.e419.arma.dao;

import com.e419.arma.model.Cfg;
import com.e419.arma.model.Difficulty;
import com.e419.arma.model.Param;
import com.e419.arma.model.Basic;

public interface CfgDao {
	Cfg getAll();
	Basic getBasic();
	Difficulty getDifficulty();
	Param getParam();
	int setAll(Cfg cfg);
	Cfg getSecurityCode();
	int setDifficulty(Difficulty difficulty);
	int setBasic(Basic basic);
	int setParam(Param param);
}
