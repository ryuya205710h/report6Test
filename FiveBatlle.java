package jp.ac.uryukyu.ie.e205710_e215749;

public class FiveBatlle {
    public static void fiveBatlle(){
        int u = 0;
        int p = 0;
        int a = 0;
        String w = "勝ち";
        String l = "負け";
        String d = "あいこ";
        GetPc pc = new GetPc();
        User user = new User();
        for(int i = 0; i <= 5; i += 1){
            if(判定処理(user.getUser(),pc.getPc()).epuals(w)){
                u += 1;
            }else if(判定処理(user.getUser(),pc.getPc()).epuals(l)){
                p += 1;
            }else{
                a += 1;
            }
        }
        if(u > p){
            System.out.println("あなた:" + u + "勝");
            System.out.println("PC:" + p + "勝");
            System.out.println("あなたの勝ち！");
        }else if(u < p){
            System.out.println("あなた:" + u + "勝");
            System.out.println("PC:" + p + "勝");
            System.out.println("PCの勝ち！");
        }else{
            System.out.println("引き分け！");
        }
    }
}
