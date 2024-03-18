package Ye;

class Solution {
    public int solution(String[][] board, int h, int w) {
        String answer;
        int count = 0;

        answer = board[h][w];
        if(h>=1 && w>=1){
            if(board[h-1][w] == answer || board[h][w-1] == answer || board[h][w+1] == answer || board[h+1][w] == answer){
                count++;
            }
        }

        else if(h<1 && w>=1){
            if(board[h][w-1] == answer || board[h][w+1] == answer || board[h+1][w] == answer){
                count++;
            }
        }

        else if(h>=1 && w<1){
            if(board[h-1][w] == answer || board[h][w+1] == answer || board[h+1][w] == answer){
                count++;
            }
        }
        else if(h<1 && w<1){
            if(board[h][w+1] == answer || board[h-1][w] == answer){
                count++;
            }
        }

        return count;
    }
}