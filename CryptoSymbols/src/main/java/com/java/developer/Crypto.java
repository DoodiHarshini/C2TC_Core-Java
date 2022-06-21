package com.java.developer;

public class Crypto {
	private int Bitcoin;
	private int Ethereum;
	private int Tether;
	private int USDCoin;
	private int  BianceCoin;
	private int BinanceUSD;
	private int cardano;
	private int Ripple;
	private int polygon;
	
	public Crypto() {
		super();
	}

	
	public Crypto(int bitcoin, int ethereum, int tether, int uSDCoin, int bianceCoin, int binanceUSD, int cardano,
			int ripple, int polygon) {
		super();
		Bitcoin = bitcoin;
		Ethereum = ethereum;
		Tether = tether;
		USDCoin = uSDCoin;
		BianceCoin = bianceCoin;
		BinanceUSD = binanceUSD;
		this.cardano = cardano;
		Ripple = ripple;
		this.polygon = polygon;
	}


	public int getBitcoin() {
		return Bitcoin;
	}


	public void setBitcoin(int bitcoin) {
		Bitcoin = bitcoin;
	}


	public int getEthereum() {
		return Ethereum;
	}


	public void setEthereum(int ethereum) {
		Ethereum = ethereum;
	}


	public int getTether() {
		return Tether;
	}


	public void setTether(int tether) {
		Tether = tether;
	}


	public int getUSDCoin() {
		return USDCoin;
	}


	public void setUSDCoin(int uSDCoin) {
		USDCoin = uSDCoin;
	}


	public int getBianceCoin() {
		return BianceCoin;
	}


	public void setBianceCoin(int bianceCoin) {
		BianceCoin = bianceCoin;
	}


	public int getBinanceUSD() {
		return BinanceUSD;
	}


	public void setBinanceUSD(int binanceUSD) {
		BinanceUSD = binanceUSD;
	}


	public int getCardano() {
		return cardano;
	}


	public void setCardano(int cardano) {
		this.cardano = cardano;
	}


	public int getRipple() {
		return Ripple;
	}


	public void setRipple(int ripple) {
		Ripple = ripple;
	}


	public int getPolygon() {
		return polygon;
	}


	public void setPolygon(int polygon) {
		this.polygon = polygon;
	}
}



	