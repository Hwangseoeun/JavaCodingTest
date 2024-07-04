package Programmers;

import java.util.*;

public class NoSameNumber {
    public int[] solution(int []arr) {
        int[] answer;
        LinkedList<Integer> que=new LinkedList<Integer>();

        int temp=-1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==temp)continue;
            else {
                temp=arr[i];
                que.add(temp);

            }
        }
        answer=new int[que.size()];
        int cnt=0;
        for (Integer i : que) {
            answer[cnt++]=i;
        }
        return answer;
    }
}