package thiru.cp.leetcode.array;

import java.util.Arrays;

/*
    Rotate Image
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/
*/
public class RotateImage {

    public static void print(int[][] mat) {
        System.out.println("Matrix -> ");
        for (int[] ints : mat){
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }


    public void rotate(int[][] matrix) {
        for(int i=0; i<Math.floor((double) matrix.length/2.0); i++){
            for(int j=0; j<Math.ceil((double) matrix[i].length/2.0); j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-j-1][i];
                matrix[matrix.length-j-1][i] = matrix[matrix.length-1-i][matrix.length-1-j];
                matrix[matrix.length-1-i][matrix.length-1-j] = matrix[j][matrix.length-1-i];
                matrix[j][matrix.length-1-i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();

        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotateImage.rotate(matrix);
        print(matrix);
/*
        matrix = new int[][]{{1}};
        rotateImage.rotate(matrix);
        print(matrix);

        matrix = new int[][]{{1,2},{3,4}};
        rotateImage.rotate(matrix);
        print(matrix);

        matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotateImage.rotate(matrix);
        print(matrix);*/

    }
}
