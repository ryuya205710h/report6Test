package jp.ac.uryukyu.ie.e205710_e215749;

import java.util.Random;
public class GetPc {
    public static int getPc(){
        Random random = new Random();
        int handNumber = random.nextInt(3);
        return handNumber;
    }     
}
