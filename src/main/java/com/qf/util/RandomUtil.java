package com.qf.util;


import java.util.Random;

public class RandomUtil {
	private static Random charR = new Random();
	private static Random numbR = new Random();
	private static final char CHARS = 'a';
	private static final char NUMBS = '0';


	public static String getRandomStringByChar(int length) {
		String str = null;
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				char c = (char) (charR.nextInt(26) + CHARS);
				str = str + c;
			}
		}
		return str;
	}

	public static String getRandomStringByNumber(int length) {
		String str = "";
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				char c = (char) (charR.nextInt(10) + NUMBS);
				str = str + c;
			}
		}
		return str;
	}


	public static String getRandomStringByCharAndNumber(int length) {
		String str ="";
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				char c = ' ';
				if (numbR.nextInt(2) == 0) {
					c = (char) (charR.nextInt(26) + CHARS);
				} else {
					c = (char) (charR.nextInt(10) + NUMBS);
				}
				str = str + c;
			}
		}
		return str;
	}

}
