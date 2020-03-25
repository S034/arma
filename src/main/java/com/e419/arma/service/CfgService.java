package com.e419.arma.service;

import java.io.IOException;
import com.e419.arma.model.Cfg;
import com.e419.arma.model.Difficulty;
import com.e419.arma.model.Param;
import com.e419.arma.model.Status;
import com.e419.arma.model.Basic;

public interface CfgService {
	String getSecurityCode();
	Cfg getAll();
	int setAll(Cfg cfg);
	void writeCfg() throws IOException;
	Difficulty getDifficulty();
	int setDifficulty(Difficulty difficulty);
	void writeDifficulty() throws IOException;
	Basic getBasic();
	int setBasic(Basic basic);
	void writeBasic() throws IOException;
	Param getParam();
	int setParam(Param param);
	int startUp() throws IOException;
	Status status() throws IOException;
	int shutDown() throws IOException;
}
