import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Logic {



    public static void startGame() throws UnsupportedEncodingException {
        Figure WPawnA = new Figure("*P", true,"\u2659");
        Figure WPawnB = new Figure("*P", true,"\u2659");
        Figure WPawnC = new Figure("*P", true,"\u2659");
        Figure WPawnD = new Figure("*P", true,"\u2659");
        Figure WPawnE = new Figure("*P", true,"\u2659");
        Figure WPawnF = new Figure("*P", true,"\u2659");
        Figure WPawnG = new Figure("*P", true,"\u2659");
        Figure WPawnH = new Figure("*P", true,"\u2659");
        Figure WRookA = new Figure("*R", true,"\u2656");
        Figure WRookH = new Figure("*R", true,"\u2656");
        Figure WKnightB = new Figure("*N", true, "\u2658");
        Figure WKnightG = new Figure("*N", true, "\u2658");
        Figure WBishopC = new Figure("*B", true,"\u2657");
        Figure WBishopF = new Figure("*B", true,"\u2657");
        Figure WQueen = new Figure("*Q", true,"\u2655");
        Figure WKing = new Figure("*K", true,"\u2654");

        Figure BPawnA = new Figure(" P", true, "\u265F");
        Figure BPawnB = new Figure(" P", true, "\u265F");
        Figure BPawnC = new Figure(" P", true, "\u265F");
        Figure BPawnD = new Figure(" P", true, "\u265F");
        Figure BPawnE = new Figure(" P", true, "\u265F");
        Figure BPawnF = new Figure(" P", true, "\u265F");
        Figure BPawnG = new Figure(" P", true, "\u265F");
        Figure BPawnH = new Figure(" P", true, "\u265F");
        Figure BRookA = new Figure(" R", true, "\u265C");
        Figure BRookH = new Figure(" R", true, "\u265C");
        Figure BKnightB = new Figure(" N", true, "\u265E");
        Figure BKnightG = new Figure(" N", true, "\u265E");
        Figure BBishopC = new Figure(" B", true, "\u265D");
        Figure BBishopF = new Figure(" B", true, "\u265D");
        Figure BQueen = new Figure(" Q", true, "\u265B");
        Figure BKing = new Figure(" K", true, "\u265A");

        Figure empty = new Figure("  ", true,"\u2001");

        Spaces A1 = new Spaces("A1", false, false,WRookA);
        Spaces B1 = new Spaces("B1", true, false,WKnightB);
        Spaces C1 = new Spaces("C1", false, false,WBishopC);
        Spaces D1 = new Spaces("D1", true, false,WQueen);
        Spaces E1 = new Spaces("E1", false, false,WKing);
        Spaces F1 = new Spaces("F1", true, false,WBishopF);
        Spaces G1 = new Spaces("G1", false, false,WKnightG);
        Spaces H1 = new Spaces("H1", true, false,WRookH);

        Spaces A2 = new Spaces("A2", true, false,WPawnA);
        Spaces B2 = new Spaces("B2", false, false,WPawnB);
        Spaces C2 = new Spaces("C2", true, false,WPawnC);
        Spaces D2 = new Spaces("D2", false, false,WPawnD);
        Spaces E2 = new Spaces("E2", true, false,WPawnE);
        Spaces F2 = new Spaces("F2", false, false,WPawnF);
        Spaces G2 = new Spaces("G2", true, false,WPawnG);
        Spaces H2 = new Spaces("H2", false, false,WPawnH);

        Spaces A3 = new Spaces("A3", false, true,empty);
        Spaces B3 = new Spaces("B3", true, true,empty);
        Spaces C3 = new Spaces("C3", false, true,empty);
        Spaces D3 = new Spaces("D3", true, true,empty);
        Spaces E3 = new Spaces("E3", false, true,empty);
        Spaces F3 = new Spaces("F3", true, true,empty);
        Spaces G3 = new Spaces("G3", false, true,empty);
        Spaces H3 = new Spaces("H3", true, true,empty);

        Spaces A4 = new Spaces("A4", true, true,empty);
        Spaces B4 = new Spaces("B4", false, true,empty);
        Spaces C4 = new Spaces("C4", true, true,empty);
        Spaces D4 = new Spaces("D4", false, true,empty);
        Spaces E4 = new Spaces("E4", true, true,empty);
        Spaces F4 = new Spaces("F4", false, true,empty);
        Spaces G4 = new Spaces("G4", true, true,empty);
        Spaces H4 = new Spaces("H4", false, true,empty);

        Spaces A5 = new Spaces("A5", false, true,empty);
        Spaces B5 = new Spaces("B5", true, true,empty);
        Spaces C5 = new Spaces("C5", false, true,empty);
        Spaces D5 = new Spaces("D5", true, true,empty);
        Spaces E5 = new Spaces("E5", false, true,empty);
        Spaces F5 = new Spaces("F5", true, true,empty);
        Spaces G5 = new Spaces("G5", false, true,empty);
        Spaces H5 = new Spaces("H5", true, true,empty);

        Spaces A6 = new Spaces("A6", true, true,empty);
        Spaces B6 = new Spaces("B6", false, true,empty);
        Spaces C6 = new Spaces("C6", true, true,empty);
        Spaces D6 = new Spaces("D6", false, true,empty);
        Spaces E6 = new Spaces("E6", true, true,empty);
        Spaces F6 = new Spaces("F6", false, true,empty);
        Spaces G6 = new Spaces("G6", true, true,empty);
        Spaces H6 = new Spaces("H6", false, true,empty);

        Spaces A7 = new Spaces("A7", false, false,BPawnA);
        Spaces B7 = new Spaces("B7", true, false,BPawnB);
        Spaces C7 = new Spaces("C7", false, false,BPawnC);
        Spaces D7 = new Spaces("D7", true, false,BPawnD);
        Spaces E7 = new Spaces("E7", false, false,BPawnE);
        Spaces F7 = new Spaces("F7", true, false,BPawnF);
        Spaces G7 = new Spaces("G7", false, false,BPawnG);
        Spaces H7 = new Spaces("H7", true, false,BPawnH);

        Spaces A8 = new Spaces("A8", true, false,BRookA);
        Spaces B8 = new Spaces("B8", false, false,BKnightB);
        Spaces C8 = new Spaces("C8", true, false,BBishopC);
        Spaces D8 = new Spaces("D8", false, false,BQueen);
        Spaces E8 = new Spaces("E8", true, false,BKing);
        Spaces F8 = new Spaces("F8", false, false,BBishopF);
        Spaces G8 = new Spaces("G8", true, false,BKnightG);
        Spaces H8 = new Spaces("H8", false, false,BRookH);


        Utility.drawScene(A1.getFigureHere(),A2.getFigureHere(),A3.getFigureHere(),A4.getFigureHere(),A5.getFigureHere(),A6.getFigureHere(),A7.getFigureHere(),A8.getFigureHere(),
                B1.getFigureHere(),B2.getFigureHere(),B3.getFigureHere(),B4.getFigureHere(),B5.getFigureHere(),B6.getFigureHere(),B7.getFigureHere(),B8.getFigureHere(),
                C1.getFigureHere(),C2.getFigureHere(),C3.getFigureHere(),C4.getFigureHere(),C5.getFigureHere(),C6.getFigureHere(),C7.getFigureHere(),C8.getFigureHere(),
                D1.getFigureHere(),D2.getFigureHere(),D3.getFigureHere(),D4.getFigureHere(),D5.getFigureHere(),D6.getFigureHere(),D7.getFigureHere(),D8.getFigureHere(),
                E1.getFigureHere(),E2.getFigureHere(),E3.getFigureHere(),E4.getFigureHere(),E5.getFigureHere(),E6.getFigureHere(),E7.getFigureHere(),E8.getFigureHere(),
                F1.getFigureHere(),F2.getFigureHere(),F3.getFigureHere(),F4.getFigureHere(),F5.getFigureHere(),F6.getFigureHere(),F7.getFigureHere(),F8.getFigureHere(),
                G1.getFigureHere(),G2.getFigureHere(),G3.getFigureHere(),G4.getFigureHere(),G5.getFigureHere(),G6.getFigureHere(),G7.getFigureHere(),G8.getFigureHere(),
                H1.getFigureHere(),H2.getFigureHere(),H3.getFigureHere(),H4.getFigureHere(),H5.getFigureHere(),H6.getFigureHere(),H7.getFigureHere(),H8.getFigureHere());
    }




}
