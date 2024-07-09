package Programmers;

import java.util.Arrays;
import java.util.Hashtable;

public class OnceSeenChar {
    public String solution(String s){
        Hashtable<String, Integer> ht = new Hashtable<>();
        String[] arr = s.split("");

        for(String str : arr){
            ht.merge(str,1,Integer::sum);
        }

        StringBuilder sb = new StringBuilder();

        for(String str : ht.keySet()){
            if(ht.get(str) == 1){
                sb.append(str);
            }
        }

        char[] charArr = sb.toString().toCharArray();
        Arrays.sort(charArr);

        return new String(charArr);
    }
}
