package p1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("");
        int[] arr = new int[6];
        for(int fir = 2;fir <= 6;fir = fir + 2){
            for(int i = 1;i <= fir;i++){
                LinkedList<String> linkedList2 = new LinkedList<>();
                while (!linkedList1.isEmpty()){
                    String p = linkedList1.pop();
                    linkedList2.add(p + "(");
                    linkedList2.add(p + ")");
                }
                linkedList1.addAll(linkedList2);
            }
            Iterator<String> iterator = linkedList1.iterator();
            while (iterator.hasNext()){
                String s1 = iterator.next();
                if(check(s1) == 1){
                    arr[fir/2] = arr[fir/2] + 1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int check(String s){
        int a1 = 0;
        for(int i = 1;i <= s.length();i++){
            if (s.charAt(i - 1) == '(')a1++;
            else a1--;
            if(a1 < 0)return 0;
        }
        if (a1 == 0)return 1;
        else return 0;
    }
}
