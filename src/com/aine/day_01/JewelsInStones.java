package com.aine.day_01;
//宝石
//根据J字符串判断S字符串中存在多少个相同字符
public class JewelsInStones {

	public static void main(String[] args) {
		String J = "aA";
		String S = "aAAbbbb";
		System.out.println(numJewelsInStones(J,S));
	}

	public static int numJewelsInStones(String J, String S) {
		if (J.length() < S.length())
			return numJewelsInStones(S, J);
		int gens = 0;
		char a[] = J.toCharArray();
		char b[] = S.toCharArray();
		for (int i : a) {
			for (int j : b) {
				
				if (i == j) {
					
					gens++;
				}
				
			}
		}
		return gens;
	}
}