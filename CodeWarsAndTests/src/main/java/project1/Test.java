package project1;

import com.google.common.math.BigIntegerMath;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        char[] pieces = new char[]{'Q', 'R', 'B', 'N', 'P'};
        char[][] chessboard = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessboard[i][j] = ' ';
            }
        }
        char chessman = pieces[(int)(Math.random()*5)];
        int[] king = new int[]{(int)(Math.random()*8),(int)(Math.random()*8)};

        int[] position = new int[]{(int)(Math.random() * 8),(int)(Math.random() * 8)};
        while (king == position) position = new int[]{(int) (Math.random() * 8), (int) (Math.random() * 8)};
        chessboard[king[0]][king[1]] = 'K';
        chessboard[position[0]][position[1]] = pieces[(int)(Math.random()*5)];

        System.out.println(Arrays.deepToString(chessboard));
//        for (int i = 0; i < 50; i++) {
//            System.out.println((int)(Math.random()*8));
//        }
    }

}
