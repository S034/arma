package com.e419.arma.service.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.e419.arma.dao.CfgDao;
import com.e419.arma.model.Basic;
import com.e419.arma.model.Cfg;
import com.e419.arma.model.Difficulty;
import com.e419.arma.model.Param;
import com.e419.arma.model.Status;
import com.e419.arma.service.CfgService;

@Service
public class CfgServiceImpl implements CfgService{
	@Autowired
	 private CfgDao cfgDao;
	@Override
	public Cfg getAll() {
		// TODO Auto-generated method stub
		Cfg cfg=cfgDao.getAll();
		cfg.setPassword("");
		cfg.setPasswordAdmin("");
		return cfg;
	}
	
	@Override
	public Basic getBasic() {
		// TODO Auto-generated method stub
		return cfgDao.getBasic();
	}
	
	@Override
	public String getSecurityCode() {
		// TODO Auto-generated method stub
		String securityCode=cfgDao.getSecurityCode().getSecurityCode();
		return securityCode;
	}
	
	@Override
	public Difficulty getDifficulty() {
		// TODO Auto-generated method stub
		return cfgDao.getDifficulty();
	}
	
	@Override
	public Param getParam() {
		// TODO Auto-generated method stub
		Param param=cfgDao.getParam();
		return param;
	}
	
	@Override
	public int setAll(Cfg cfg) {
		// TODO Auto-generated method stub
		return cfgDao.setAll(cfg);
	}
	
	@Override
	public void writeCfg() throws IOException{
		Param param = cfgDao.getParam();
		String configPath = param.getConfig();
		String profiles = param.getProfiles();
		configPath = profiles+"\\"+configPath;
		Cfg cfg= cfgDao.getAll();
		String[] requiredLines= {
				"hostName="+"\""+cfg.getHostName()+"\";",
				"maxPlayers="+cfg.getMaxPlayers()+";",
				"persistent="+cfg.getPersistent()+";",
				"disableVoN="+cfg.getDisableVoN()+";",
				"vonCodecQuality="+cfg.getVonCodecQuality()+";",
				"voteMissionPlayers="+cfg.getVoteMissionPlayers()+";",
				"voteThreshold="+cfg.getVoteThreshold()+";",
				"motdInterval="+cfg.getMotdInterval()+";",
				"class missions",
				"{",
				"  class mission1",
				"  {",
				"    template="+"\""+cfg.getTemplate()+"\";",
				"    difficulty="+"\""+cfg.getDifficulty()+"\";",
				"  };",
				"};",
				"timeStampFormat="+"\""+cfg.getTimeStampFormat()+"\";",
				"logFile="+"\""+cfg.getLogFile()+"\";",
				"BattlEye="+cfg.getBattlEye()+";",
				"verifySignatures="+cfg.getVerifySignatures()+";",
				"kickDuplicate="+cfg.getKickDuplicate()+";",
				"allowedFilePatching="+cfg.getAllowedFilePatching()+";"
		};
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(configPath)), "UTF-8"));
		for(String requiredLine:requiredLines){
			writer.write(requiredLine+"\t\n");
        }
		if(cfg.getPassword()!=null&&cfg.getPassword()!=""&&cfg.getPassword().length()!=0) {
			writer.write("password="+"\""+cfg.getPassword()+"\""+";\t\n");
		}
		if(cfg.getPasswordAdmin()!=null&&cfg.getPasswordAdmin()!=""&&cfg.getPasswordAdmin().length()!=0) {
			writer.write("passwordAdmin="+"\""+cfg.getPasswordAdmin()+"\""+";\t\n");
		}
		if(cfg.getHeadlessClients1()!=null&&cfg.getHeadlessClients1()!=""&&cfg.getHeadlessClients1().length()!=0) {
			writer.write("headlessClients1="+"{"+"\""+cfg.getHeadlessClients1()+"\"");
			if(cfg.getHeadlessClients2()!=null&&cfg.getHeadlessClients2()!=""&&cfg.getHeadlessClients2().length()!=0) {
				writer.write(",\""+cfg.getHeadlessClients2()+"\"");
			}
			if(cfg.getHeadlessClients3()!=null&&cfg.getHeadlessClients3()!=""&&cfg.getHeadlessClients3().length()!=0) {
				writer.write(",\""+cfg.getHeadlessClients3()+"\"");
			}
			writer.write("}"+";\t\n");
		}
		if(cfg.getLocalClient()!=null&&cfg.getLocalClient()!=""&&cfg.getLocalClient().length()!=0) {
			writer.write("localClient="+"{"+"\""+cfg.getLocalClient()+"\""+"}"+";\t\n");
		}
		if(cfg.getMotd()!=null&&cfg.getMotd()!=""&&cfg.getMotd().length()!=0) {
			writer.write("motd[]="+"{"+"\""+cfg.getMotd()+"\""+"}"+";\t\n");
		}
		writer.close();
	}

	@Override
	public int setDifficulty(Difficulty difficulty) {
		return cfgDao.setDifficulty(difficulty);
	}

	@Override
	public void writeDifficulty() throws IOException {
		Param param=cfgDao.getParam();
		String difficultyPath=param.getProfiles();
		String name = param.getName();
		difficultyPath=difficultyPath+"\\Users\\"+name+"\\"+name+".Arma3Profile";
		Difficulty difficulty= cfgDao.getDifficulty();
		String[] requiredLines= {
				"class DifficultyPresets",
				"{",
				"  class CustomDifficulty",
				"  {",
				"    class Options",
				"    {",
				"      reducedDamage="+difficulty.getReducedDamage()+";",
				"      groupIndicators="+difficulty.getGroupIndicators()+";",
				"      friendlyTags="+difficulty.getFriendlyTags()+";",
				"      enemyTags="+difficulty.getEnemyTags()+";",
				"      detectedMines="+difficulty.getDetectedMines()+";",
				"      commands="+difficulty.getCommands()+";",
				"      waypoints="+difficulty.getWaypoints()+";",
				"      tacticalPing="+difficulty.getTacticalPing()+";",
				"      weaponInfo="+difficulty.getWeaponInfo()+";",
				"      stanceIndicator="+difficulty.getStanceIndicator()+";",
				"      staminaBar="+difficulty.getStaminaBar()+";",
				"      weaponCrosshair="+difficulty.getWeaponCrosshair()+";",
				"      visionAid="+difficulty.getVisionAid()+";",
				"      thirdPersonView="+difficulty.getThirdPersonView()+";",
				"      cameraShake="+difficulty.getCameraShake()+";",
				"      scoreTable="+difficulty.getScoreTable()+";",
				"      deathMessages="+difficulty.getDeathMessages()+";",
				"      vonID="+difficulty.getVonID()+";",
				"      mapContent="+difficulty.getMapContent()+";",
				"      autoReport="+difficulty.getAutoReport()+";",
				"      multipleSaves="+difficulty.getMultipleSaves()+";",
				"    };",
				"    aiLevelPreset="+difficulty.getAiLevelPreset()+";",
				"  };",
				"  class CustomAILevel",
				"  {",
				"    skillAI="+difficulty.getSkillAI()+";",
				"    precisionAI="+difficulty.getPrecisionAI()+";",
				"  };",
				"};"
		};
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(difficultyPath)), "UTF-8"));
		for(String requiredLine:requiredLines){
			writer.write(requiredLine+"\t\n");
        }
		writer.close();
	}

	@Override
	public void writeBasic() throws IOException {
		// TODO Auto-generated method stub
		Param param=cfgDao.getParam();
		String basicPath = param.getCfg();
		String profiles = param.getProfiles();
		basicPath = profiles+"\\"+basicPath;
		Basic basic=cfgDao.getBasic();
		String[] requiredLines= {
			"language="+"\""+basic.getLanguage()+"\""+";",
			"adapter="+basic.getAdapter()+";",
			"3D_Performance="+basic.getPerformance()+";",
			"Resolution_W="+basic.getResolution_W()+";",
			"Resolution_H="+basic.getResolution_H()+";",
			"Resolution_Bpp="+basic.getResolution_Bpp()+";",
			"MinBandwidth="+basic.getMinBandwidth()+";",
			"MaxBandwidth="+basic.getMaxBandwidth()+";",
			"MaxMsgSend="+basic.getMaxMsgSend()+";",
			"MaxSizeGuaranteed="+basic.getMaxSizeGuaranteed()+";",
			"MaxSizeNonguaranteed="+basic.getMaxSizeNonguaranteed()+";",
			"MinErrorToSend="+basic.getMinErrorToSend()+";",
			"MinErrorToSendNear="+basic.getMinErrorToSendNear()+";",
			"MaxCustomFileSize="+basic.getMaxCustomFileSize()+";",
		};
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(basicPath)), "UTF-8"));
		for(String requiredLine:requiredLines){
			writer.write(requiredLine+"\t\n");
        }
		writer.close();
	}

	@Override
	public int setBasic(Basic basic) {
		// TODO Auto-generated method stub
		return cfgDao.setBasic(basic);
	}

	@Override
	public int setParam(Param param) {
		// TODO Auto-generated method stub
		return cfgDao.setParam(param);
	}
	
	@Override
	public int startUp() throws IOException {
		writeCfg();
		writeDifficulty();
		writeBasic();
		Status status=status();
		if(status.getOnline()!=1) {
			Param param=cfgDao.getParam();
			String params="-port="+param.getPort();
			if(param.getProfiles()!=null&&param.getProfiles()!=""&&param.getProfiles().length()!=0) {
				params=params+" \"-profiles="+param.getProfiles()+"\"";
				if(param.getConfig()!=null&&param.getConfig()!=""&&param.getConfig().length()!=0) {
					params=params+" \"-config="+param.getProfiles()+"\\"+param.getConfig()+"\"";
				}
				if(param.getCfg()!=null&&param.getCfg()!=""&&param.getCfg().length()!=0) {
					params=params+" \"-cfg="+param.getProfiles()+"\\"+param.getCfg()+"\"";
				}
			}
			if(param.getName()!=null&&param.getName()!="") {
				params=params+" -name="+param.getName();
			}
			if(param.getFilePatching()==1) {
				params=params+" -filePatching";
			}
			if(param.getAutoInit()==1) {
				params=params+" -autoInit";
			}
			if(param.getNetlog()==1) {
				params=params+" -netlog";
			}
			if(param.getRanking()!=null&&param.getRanking()!=""&&param.getRanking().length()!=0) {
				params=params+" \"-ranking="+param.getRanking()+"\"";
			}
			if(param.getPid()!=null&&param.getPid()!=""&&param.getPid().length()!=0) {
				params=params+" \"-pid="+param.getPid()+"\"";
			}
			if(param.getMods()!=null&&param.getMods()!=""&&param.getMods().length()!=0) {
				params=params+" \"-mod="+param.getMods()+"\"";
			}
			if(param.getServermod()!=null&&param.getServermod()!=""&&param.getServermod().length()!=0) {
				params=params+" \"-servermod="+param.getServermod()+"\"";
			}
			System.out.println(params);
			String[] cmd=new String[] {"arma3server_x64.exe",params};
			Process process = Runtime.getRuntime().exec(cmd);
//			BufferedReader r = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//			String l = null;
//			while((l = r.readLine()) != null) {
//				System.out.println(l);
//			}
			return 1;
		}else {
			return 2;
		}
		
	}

	@Override
	public Status status() throws IOException {
		// TODO Auto-generated method stub
		Process process = Runtime.getRuntime().exec("tasklist");
		BufferedReader r = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String l = null;
		Status status=new Status();
		status.setOnline(0);
		while((l = r.readLine()) != null) {
			if(l.contains("arma3server_x64.exe")) {
				l = l.replaceAll(" +"," ");
				status.setOnline(1);
				String[] strings = l.split(" ");
				status.setName(strings[0]);
				int pid=Integer.parseInt(strings[1]);
				status.setPid(pid);
				status.setSessionName(strings[2]);
				int session = Integer.parseInt(strings[3]);
				status.setSession(session);
				strings[4]=strings[4].replaceAll(",", "");
				int memory = Integer.parseInt(strings[4]);
				status.setMemory(memory);
				return status;
			}
		}
		return status;
	}

	@Override
	public int shutDown() throws IOException {
		Status status=status();
		if(status.getOnline()==1) {
			Process process = Runtime.getRuntime().exec("taskkill /f /t /im arma3server_x64.exe");
			BufferedReader r = new BufferedReader(new InputStreamReader(process.getInputStream()));
			return 1;
		}else {
			return 2;
		}
		
	}
}
