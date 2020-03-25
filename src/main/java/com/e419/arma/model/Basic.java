package com.e419.arma.model;

public class Basic {
	private String securityCode;
	private String language;
	private int adapter;
	private float Performance;
	private int Resolution_W;
	private int Resolution_H;
	private int Resolution_Bpp;
	private int MinBandwidth;
	private long MaxBandwidth;
	private int MaxMsgSend;
	private int MaxSizeGuaranteed;
	private int MaxSizeNonguaranteed;
	private float MinErrorToSend;
	private float MinErrorToSendNear;
	private int MaxCustomFileSize;
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getAdapter() {
		return adapter;
	}
	public void setAdapter(int adapter) {
		this.adapter = adapter;
	}
	public float getPerformance() {
		return Performance;
	}
	public void setPerformance(float performance) {
		Performance = performance;
	}
	public int getResolution_W() {
		return Resolution_W;
	}
	public void setResolution_W(int resolution_W) {
		Resolution_W = resolution_W;
	}
	public int getResolution_H() {
		return Resolution_H;
	}
	public void setResolution_H(int resolution_H) {
		Resolution_H = resolution_H;
	}
	public int getResolution_Bpp() {
		return Resolution_Bpp;
	}
	public void setResolution_Bpp(int resolution_Bpp) {
		Resolution_Bpp = resolution_Bpp;
	}
	public int getMinBandwidth() {
		return MinBandwidth;
	}
	public void setMinBandwidth(int minBandwidth) {
		MinBandwidth = minBandwidth;
	}
	public long getMaxBandwidth() {
		return MaxBandwidth;
	}
	public void setMaxBandwidth(long maxBandwidth) {
		MaxBandwidth = maxBandwidth;
	}
	public int getMaxMsgSend() {
		return MaxMsgSend;
	}
	public void setMaxMsgSend(int maxMsgSend) {
		MaxMsgSend = maxMsgSend;
	}
	public int getMaxSizeGuaranteed() {
		return MaxSizeGuaranteed;
	}
	public void setMaxSizeGuaranteed(int maxSizeGuaranteed) {
		MaxSizeGuaranteed = maxSizeGuaranteed;
	}
	public int getMaxSizeNonguaranteed() {
		return MaxSizeNonguaranteed;
	}
	public void setMaxSizeNonguaranteed(int maxSizeNonguaranteed) {
		MaxSizeNonguaranteed = maxSizeNonguaranteed;
	}
	public float getMinErrorToSend() {
		return MinErrorToSend;
	}
	public void setMinErrorToSend(float minErrorToSend) {
		MinErrorToSend = minErrorToSend;
	}
	public float getMinErrorToSendNear() {
		return MinErrorToSendNear;
	}
	public void setMinErrorToSendNear(float minErrorToSendNear) {
		MinErrorToSendNear = minErrorToSendNear;
	}
	public int getMaxCustomFileSize() {
		return MaxCustomFileSize;
	}
	public void setMaxCustomFileSize(int maxCustomFileSize) {
		MaxCustomFileSize = maxCustomFileSize;
	}
}
