//ʵ�ֺ��� ToLowerCase()���ú�������һ���ַ������� str���������ַ����еĴ�д��ĸת����Сд��ĸ��֮�󷵻��µ��ַ�����
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