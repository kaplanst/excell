package project1;


import org.apache.commons.lang3.Range;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class testest {

    public static void main(String[] args) {
        char[] pieces = new char[]{'Q', 'R', 'B', 'N', 'P'};
        char[][] chessboard = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessboard[i][j] = ' ';
            }
        }

        for (int i = 0; i < (int)(Math.random() * 7) + 2; i++) {
            chessboard[(int)(Math.random() * 8)][(int)(Math.random() * 8)] = pieces[(int)(Math.random()*5)];
        }

        int[] king = new int[]{(int)(Math.random()*8),(int)(Math.random()*8)};
        chessboard[king[0]][king[1]] = 'K';
        for (int i = 0; i < 8; i++) System.out.println(Arrays.toString(chessboard[i]));
        System.out.println(isTheKinginCheck(chessboard));
    }

    public static boolean isTheKinginCheck(char[][] chessboard) {
        int[] kingPl = new int[2];
        List<int[]> cmCoord = new ArrayList<>();
        List<Character> cmList = new ArrayList<>();
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                if (chessboard[i][j] == ' ') continue;
                if (chessboard[i][j] == 'K') {
                    kingPl[0] = i;
                    kingPl[1] = j;
                } else {
                    cmList.add(chessboard[i][j]);
                    cmCoord.add(new int[]{i, j});
                }
            }
        }
        for (int i = 0; i < cmList.size(); i++) {
            System.out.println(Arrays.toString(kingPl) + Arrays.toString(cmCoord.get(i)) + cmList.get(i));
            switch (cmList.get(i)) {
                case 'P' -> {
                    if (kingPl[0] - cmCoord.get(i)[0] == 1 && Math.abs(kingPl[1] - cmCoord.get(i)[1]) == 1) return true;
                }

                case 'N' -> {
                    if ((Math.abs(kingPl[0] - cmCoord.get(i)[0]) == 2 && Math.abs(kingPl[1] - cmCoord.get(i)[1]) == 1)||
                (Math.abs(kingPl[0] - cmCoord.get(i)[0]) == 1 && Math.abs(kingPl[1] - cmCoord.get(i)[1]) == 2)) return true;
                }
                case 'R' -> {
                    if ((kingPl[0] == cmCoord.get(i)[0] || kingPl[1] == cmCoord.get(i)[1])
                            && (rockView(kingPl, cmCoord.get(i), chessboard))) return true;
                }
                case 'B' -> {
                    if (((Math.abs(kingPl[0] - cmCoord.get(i)[0]) == Math.abs(kingPl[1] - cmCoord.get(i)[1])))
                            && (bishopView(kingPl, cmCoord.get(i), chessboard))) return true;
                }

                case 'Q' -> {
                    if ((kingPl[0] == cmCoord.get(i)[0] || kingPl[1] == cmCoord.get(i)[1]) ||
                            (Math.abs(kingPl[0] - cmCoord.get(i)[0]) == Math.abs(kingPl[1] - cmCoord.get(i)[1]))) {
                        if (kingPl[0] == cmCoord.get(i)[0] || kingPl[1] == cmCoord.get(i)[1]) {
                        if (rockView(kingPl, cmCoord.get(i), chessboard)) return true;
                        } else if (bishopView(kingPl, cmCoord.get(i), chessboard)) return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean rockView(int[] kingPl, int[] chessmanPl, char[][] chessboard) {
        if (kingPl[0] == chessmanPl[0]) {
            for (int i = Math.min(kingPl[1], chessmanPl[1]) + 1; i < Math.max(kingPl[1], chessmanPl[1]); i++) {
                if (chessboard[kingPl[0]][i] != ' ') return false;
            }
        }
        if (kingPl[1] == chessmanPl[1]) {
            for (int i = Math.min(kingPl[0], chessmanPl[0]) + 1; i < Math.max(kingPl[0], chessmanPl[0]); i++) {
                if (chessboard[i][kingPl[1]] != ' ') return false;
            }
        }
        return true;
    }

    public static boolean bishopView(int[] min, int[] max, char[][] chessboard) {
        int c = 1;
        if ((min[0] > max[0])) {int[] temp = min; min = max; max = temp;}
        int y = min[1];
        if (min[1] > max[1]) c = -1;
        for (int i = min[0] + 1; i < max[0]; i++) {
             y = y + c;
             if (chessboard[i][y] != ' ') return false;
        }
        return true;
    }
}