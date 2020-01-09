//实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
package com.aine.day_02;

import java.util.Arrays;

public class ToLowerCase {

	public static void main(String[] args) {
		String arr = "HhHhhheeEEE";
		System.out.println(toLowerCase(arr));
	}

	public static String toLowerCase(String str) {

		char a[] = str.toCharArray();
		str = "";
		for (char i : a) {
			if (i < 'a' && i > 'z') {
				i += 25;
				str += i;
			}
			str += i;
		}
		return str;
	}
}