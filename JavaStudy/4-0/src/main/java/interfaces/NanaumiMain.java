package interfaces;

public interface NanaumiMain {
	 public static void main(String[] args) {
		  // 3. 現実（1, 2 を使ってみる）
		 Nanaumi Nanaumi = new Nanaumi("七海", "2019/03");
		 Nanaumi.daseyaKinmuhyo();
		 Nanaumi.daseyaKotsuhi();
		 Nanaumi.doNothing();
		 Nanaumi.goToSevenEleven();
		 }

}
