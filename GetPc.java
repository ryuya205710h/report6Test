package app.src.main.java.jp.ac.uryukyu.ie.e205710_e215749;
import java.util.Random;
class GetPc {
    int getPc(){
        Random random = new Random();
        int handNumber = random.nextInt(3);
        return handNumber;
    }
     
    public static void main(String[] arg) {
        GetPc pc = new GetPc();
        System.out.println(pc.getPc() + "を出しました");
    }
        
}
