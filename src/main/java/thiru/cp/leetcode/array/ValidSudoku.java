package thiru.cp.leetcode.array;

import java.util.*;

/*
    Valid Sudoku
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/
*/
public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> elementsSetMap = new HashMap<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] != '.'){
                    int element = Integer.parseInt(String.valueOf(board[i][j]));
                    if(element<1 || element>9){
                        return false;
                    }
                    else {
                        if(!elementsSetMap.containsKey(i)){
                            elementsSetMap.put(i, new HashSet<>());
                        }
                        if(elementsSetMap.get(i).contains(element)){
                            return false;
                        }
                        else {
                            elementsSetMap.get(i).add(element);
                        }
                        if(!elementsSetMap.containsKey(board.length+j)){
                            elementsSetMap.put(board.length+j, new HashSet<>());
                        }
                        if(elementsSetMap.get(board.length+j).contains(element)){
                            return false;
                        }
                        else {
                            elementsSetMap.get(board.length+j).add(element);
                        }
                    }
                }
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                Set<Integer> elementSet = new HashSet<>();
                for(int k=i*3;k<(i*3)+3;k++){
                    for(int l=j*3;l<(j*3)+3;l++){
                        if(board[k][l] != '.'){
                            int element = Integer.parseInt(String.valueOf(board[k][l]));
                            if (elementSet.contains(element)){
                                return false;
                            }
                            else {
                                elementSet.add(element);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));

        board = new char[][] {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));
    }
}
