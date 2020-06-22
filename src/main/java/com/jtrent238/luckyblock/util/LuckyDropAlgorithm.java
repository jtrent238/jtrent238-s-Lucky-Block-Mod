package com.jtrent238.luckyblock.util;

import java.util.Random;

import com.sun.media.jfxmedia.logging.Logger;

public class LuckyDropAlgorithm {

	public static double luck = 1;
	
	public void isLuckValid() {
		if(luck > 1 || luck < 0) {
			System.out.println("Luck is invalid, setting luck to 1!");
			Logger.logMsg(0, "Luck is invalid, setting luck to 1!");
			luck = 1;
		}
	}
	
	public static int basicDrop(int i) {
		
		int basicDrop = 1;
		
		int min = 1;
		int max = i;
		
		Random rand = new Random();
		basicDrop = rand.nextInt((max - min) + 1) + min;
		//basicDrop = basicDrop / 2;
		
		basicDrop = basicDrop / (int) ((basicDrop * luck) / 2);
		
		return basicDrop;
	}
}
