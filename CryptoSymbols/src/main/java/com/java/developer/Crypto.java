package com.java.developer;

public class Crypto {
	private int Bitcoin;
	private int Ethereum;
	
	public Crypto() {
		super();
	}

	
	public Crypto(int bitcoin, int ethereum, int tether, int uSDCoin, int bianceCoin, int binanceUSD, int cardano,
			int ripple, int polygon) {
		super();
		Bitcoin = bitcoin;
		Ethereum = ethereum;
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


}



	