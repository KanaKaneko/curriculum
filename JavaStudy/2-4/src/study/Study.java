package study;


//①FruitsConstants.javaをインポートしなさい。
import constants.FruitsConstants;
/*ソース→ウィンドウの追加で自動削除を防ぐことが可能。
 * 
 */
//②Fruits.javaをインポートしなさい。
import fruits.Fruits;

/**
 * 本課題では、基本的なJavaの構造と、importについて理解を深めていきましょう。
 *
 * 問①〜問③まであります。
 * 全て回答し、課題にある画像と同じ表示になるようにしてください。
 *
 */
public class Study extends constants.FruitsConstants {

    public static void main(String[] args) {
    	
        /* ③ Fruits.javaのprintFruitsメソッドを呼び出しなさい。
         *     また、課題の画像と同じ表示になるように
         *     printFruitsの引数にはFruitsConstantsに指定されている定数を設定してください。
         */
    	Fruits.printFruits(FRUITS_LEMON_04,FRUITS_COUNT_20);
    	
    	/*extendsで継承しない場合
    	 * Fruits.printFruits(fruits,count);
    	 * String fruits = FruitsConstants.FRUITS_LEMON_04;
    	 * int count =FruitsConstants.FRUITS_COUNT_20;
    	 *でもOK
    	 */

    }
}
