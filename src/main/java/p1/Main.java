package p1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String s = "abbbcccc";
        char max_c = s.charAt(0);
        int maxNum = 1;
        char c = s.charAt(0);
        int num = 1;
        for(int i = 2;i <= s.length();i++){
            if(s.charAt(i - 1) == c){
                num++;
            }else{
                if(num > maxNum){
                    max_c = c;
                    maxNum = num;
                }
                num = 1;
                c = s.charAt(i - 1);
            }
        }
        if(num > maxNum){
            max_c = c;
            maxNum = num;
        }
        String result = "";
        for(int i = 1;i <= maxNum;i++){
            result = result + max_c;
        }
        System.out.println(result);
    }
}
