package Programmers;

public class HIndex {
    public static void main(String[] args){
        int[] citations = {3, 0, 6, 1, 5};


//        System.out.println(list);

        class Solution{
            private void selectionSort(int[] array) {
                for (int i = 0; i < array.length - 1; i++) {
                    int minIndex = i;
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[j] < array[minIndex]) {
                            minIndex = j;
                        }
                    }
                    int temp = array[minIndex];
                    array[minIndex] = array[i];
                    array[i] = temp;
                }
            }

            public int solution(int[] citations){
                int answer = 0;

                selectionSort(citations);

                for(int i=0; i<citations.length; i++){
                    int h = citations.length - i;

                    if (citations[i] >= h){
                        answer = h;
                        break;
                    }
                }

                return answer;
            }
        }

        Solution sol = new Solution();
        int hIndex = sol.solution(citations);
        System.out.println(hIndex);
    }
}
