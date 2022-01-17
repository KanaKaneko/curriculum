package omikuji;

import java.util.Random;

public class OmikujiMethod {

	public static final String sb = null;

	public static void main (String[] args) {

		// 0から3までの範囲で乱数を1つ生成する
		Random rand = new Random();
		int no = rand.nextInt(4);

		// 取得した乱数の値によって、結果を決定
		String result = "";
		if(no == 0) {
			result = "大吉";
		}else if(no == 1) {
			result ="中吉";
		}else if(no == 2) {
			result ="吉";
		}else {
			result ="小吉";
		}

        //appendメソッドを使って連結
	
		String str1 = result;
		String str2 = ".JPG";
			
			
		StringBuilder sb = new StringBuilder();
		sb.append(str1);
	    sb.append(str2);
	    System.out.println(sb);
	}
}