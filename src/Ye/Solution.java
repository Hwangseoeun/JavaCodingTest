package Ye;

//전면 수정 필요
class Solution {
    public int solution() {
        String answer;

        String board[][] = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        int h = 1;
        int w = 1;
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