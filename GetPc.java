package jp.ac.uryukyu.ie.e205710_e215749;

import java.util.Random;
public class GetPc {//Randomをインポートして３未満の数字をランダムで生成（０〜２）
    public static int getPc(){
        Random random = new Random();
        int handNumber = random.nextInt(3);
        return handNumber;//ランダムで生成された数字を返す
    }     
}
