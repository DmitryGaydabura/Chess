import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Logic {


    public static void startGame() throws UnsupportedEncodingException {
        Figure WPawnA = new Figure("*P", true, "\u265F", "A2");
        Figure WRookA = new Figure("*R", true, "\u265C", "A1");
        Figure WKnightB = new Figure("*N", true, "\u265E", "B1");
        Figure WKnightG = new Figure("*N", true, "\u265E", "G1");
        Figure WBishopC = new Figure("*B", true, "\u265D", "C1");
        Figure WBishopF = new Figure("*B", true, "\u265D", "F1");
        Figure WQueen = new Figure("*Q", true, "\u265B", "D1");
        Figure WKing = new Figure("*K", true, "\u265A", "E1");

        Figure BPawnA = new Figure(" P", true, "\u2659", "A7");
        Figure BRookA = new Figure(" R", true, "\u2656", "A8");
        Figure BRookH = new Figure(" R", true, "\u2656", "H8");
        Figure BKnightB = new Figure(" N", true, "\u2658", "B8");
        Figure BKnightG = new Figure(" N", true, "\u2658", "G8");
        Figure BBishopC = new Figure(" B", true, "\u2657", "C8");
        Figure BBishopF = new Figure(" B", true, "\u2657", "F8");
        Figure BQueen = new Figure(" Q", true, "\u2655", "D8");
        Figure BKing = new Figure(" K", true, "\u2654", "E8");

        Figure empty = new Figure("  ", true, "\u2001", "A3");


        Figure[] allFigures = new Figure[64];
        allFigures[0] = WRookA;
        allFigures[1] = WPawnA;
        allFigures[2] = empty;
        allFigures[3] = empty;
        allFigures[4] = empty;
        allFigures[5] = empty;
        allFigures[6] = BPawnA;
        allFigures[7] = BRookA;

        allFigures[8] = WKnightB;
        allFigures[9] = WPawnA;
        allFigures[10] = empty;
        allFigures[11] = empty;
        allFigures[12] = empty;
        allFigures[13] = empty;
        allFigures[14] = BPawnA;
        allFigures[15] = BKnightB;

        allFigures[16] = WBishopC;
        allFigures[17] = WPawnA;
        allFigures[18] = empty;
        allFigures[19] = empty;
        allFigures[20] = empty;
        allFigures[21] = empty;
        allFigures[22] = BPawnA;
        allFigures[23] = BBishopC;

        allFigures[24] = WQueen;
        allFigures[25] = WPawnA;
        allFigures[26] = empty;
        allFigures[27] = empty;
        allFigures[28] = empty;
        allFigures[29] = empty;
        allFigures[30] = BPawnA;
        allFigures[31] = BQueen;

        allFigures[32] = WKing;
        allFigures[33] = WPawnA;
        allFigures[34] = empty;
        allFigures[35] = empty;
        allFigures[36] = empty;
        allFigures[37] = empty;
        allFigures[38] = BPawnA;
        allFigures[39] = BKing;

        allFigures[40] = WBishopF;
        allFigures[41] = WPawnA;
        allFigures[42] = empty;
        allFigures[43] = empty;
        allFigures[44] = empty;
        allFigures[45] = empty;
        allFigures[46] = BPawnA;
        allFigures[47] = BBishopF;

        allFigures[48] = WKnightG;
        allFigures[49] = WPawnA;
        allFigures[50] = empty;
        allFigures[51] = empty;
        allFigures[52] = empty;
        allFigures[53] = empty;
        allFigures[54] = BPawnA;
        allFigures[55] = BKnightG;

        allFigures[56] = WRookA;
        allFigures[57] = WPawnA;
        allFigures[58] = empty;
        allFigures[59] = empty;
        allFigures[60] = empty;
        allFigures[61] = empty;
        allFigures[62] = BPawnA;
        allFigures[63] = BRookH;

        while (true) {
            Utility.drawScene(allFigures);
            Utility.makeMove(allFigures);
        }
    }


}
