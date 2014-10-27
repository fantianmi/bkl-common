package com.km.common.utils;

import java.util.Random;


public class RandomCode {
	public static String random() {
		String s = "";
		String tex="";
		Random rn = new Random();
		int n = rn.nextInt(99999);
		tex = "" + n;
		if (tex.length() == 5) {
			s = tex;
		} else {
			s = "23426";
		}
		return s;
	}
}
