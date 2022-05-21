public class Logic {



    public static void startGame() {
        Figure WPawnA = new Figure("P1", true);
        Figure WPawnB = new Figure("P2", true);
        Figure WPawnC = new Figure("P3", true);
        Figure WPawnD = new Figure("P4", true);
        Figure WPawnE = new Figure("P5", true);
        Figure WPawnF = new Figure("P6", true);
        Figure WPawnG = new Figure("P7", true);
        Figure WPawnH = new Figure("P8", true);
        Figure WRookA = new Figure("R1", true);
        Figure WRookH = new Figure("R8", true);
        Figure WKnightB = new Figure("N2", true);
        Figure WKnightG = new Figure("N7", true);
        Figure WBishopC = new Figure("B3", true);
        Figure WBishopF = new Figure("B6", true);
        Figure WQueen = new Figure("Q ", true);
        Figure WKing = new Figure("♔ ", true);

        Figure BPawnA = new Figure("p1", true);
        Figure BPawnB = new Figure("p2", true);
        Figure BPawnC = new Figure("p3", true);
        Figure BPawnD = new Figure("p4", true);
        Figure BPawnE = new Figure("p5", true);
        Figure BPawnF = new Figure("p6", true);
        Figure BPawnG = new Figure("p7", true);
        Figure BPawnH = new Figure("p8", true);
        Figure BRookA = new Figure("r1", true);
        Figure BRookH = new Figure("r8", true);
        Figure BKnightB = new Figure("n2", true);
        Figure BKnightG = new Figure("n7", true);
        Figure BBishopC = new Figure("b3", true);
        Figure BBishopF = new Figure("b6", true);
        Figure BQueen = new Figure("q ", true);
        Figure BKing = new Figure("k ", true);

        Spaces A1 = new Spaces("A1", false, false,WRookA.getName());
        Spaces B1 = new Spaces("B1", true, false,WKnightB.getName());
        Spaces C1 = new Spaces("C1", false, false,WBishopC.getName());
        Spaces D1 = new Spaces("D1", true, false,WQueen.getName());
        Spaces E1 = new Spaces("E1", false, false,WKing.getName());
        Spaces F1 = new Spaces("F1", true, false,WBishopF.getName());
        Spaces G1 = new Spaces("G1", false, false,WKnightG.getName());
        Spaces H1 = new Spaces("H1", true, false,WRookH.getName());

        Spaces A2 = new Spaces("A2", true, false,WPawnA.getName());
        Spaces B2 = new Spaces("B2", false, false,WPawnB.getName());
        Spaces C2 = new Spaces("C2", true, false,WPawnC.getName());
        Spaces D2 = new Spaces("D2", false, false,WPawnD.getName());
        Spaces E2 = new Spaces("E2", true, false,WPawnE.getName());
        Spaces F2 = new Spaces("F2", false, false,WPawnF.getName());
        Spaces G2 = new Spaces("G2", true, false,WPawnG.getName());
        Spaces H2 = new Spaces("H2", false, false,WPawnH.getName());

        Spaces A3 = new Spaces("A3", false, true,"  ");
        Spaces B3 = new Spaces("B3", true, true,"  ");
        Spaces C3 = new Spaces("C3", false, true,"  ");
        Spaces D3 = new Spaces("D3", true, true,"  ");
        Spaces E3 = new Spaces("E3", false, true,"  ");
        Spaces F3 = new Spaces("F3", true, true,"  ");
        Spaces G3 = new Spaces("G3", false, true,"  ");
        Spaces H3 = new Spaces("H3", true, true,"  ");

        Spaces A4 = new Spaces("A4", true, true,"  ");
        Spaces B4 = new Spaces("B4", false, true,"  ");
        Spaces C4 = new Spaces("C4", true, true,"  ");
        Spaces D4 = new Spaces("D4", false, true,"  ");
        Spaces E4 = new Spaces("E4", true, true,"  ");
        Spaces F4 = new Spaces("F4", false, true,"  ");
        Spaces G4 = new Spaces("G4", true, true,"  ");
        Spaces H4 = new Spaces("H4", false, true,"  ");

        Spaces A5 = new Spaces("A5", false, true,"  ");
        Spaces B5 = new Spaces("B5", true, true,"  ");
        Spaces C5 = new Spaces("C5", false, true,"  ");
        Spaces D5 = new Spaces("D5", true, true,"  ");
        Spaces E5 = new Spaces("E5", false, true,"  ");
        Spaces F5 = new Spaces("F5", true, true,"  ");
        Spaces G5 = new Spaces("G5", false, true,"  ");
        Spaces H5 = new Spaces("H5", true, true,"  ");

        Spaces A6 = new Spaces("A6", true, true,"  ");
        Spaces B6 = new Spaces("B6", false, true,"  ");
        Spaces C6 = new Spaces("C6", true, true,"  ");
        Spaces D6 = new Spaces("D6", false, true,"  ");
        Spaces E6 = new Spaces("E6", true, true,"  ");
        Spaces F6 = new Spaces("F6", false, true,"  ");
        Spaces G6 = new Spaces("G6", true, true,"  ");
        Spaces H6 = new Spaces("H6", false, true,"  ");

        Spaces A7 = new Spaces("A7", false, false,BPawnA.getName());
        Spaces B7 = new Spaces("B7", true, false,BPawnB.getName());
        Spaces C7 = new Spaces("C7", false, false,BPawnC.getName());
        Spaces D7 = new Spaces("D7", true, false,BPawnD.getName());
        Spaces E7 = new Spaces("E7", false, false,BPawnE.getName());
        Spaces F7 = new Spaces("F7", true, false,BPawnF.getName());
        Spaces G7 = new Spaces("G7", false, false,BPawnG.getName());
        Spaces H7 = new Spaces("H7", true, false,BPawnH.getName());

        Spaces A8 = new Spaces("A8", true, false,BRookA.getName());
        Spaces B8 = new Spaces("B8", false, false,BKnightB.getName());
        Spaces C8 = new Spaces("C8", true, false,BBishopC.getName());
        Spaces D8 = new Spaces("D8", false, false,BQueen.getName());
        Spaces E8 = new Spaces("E8", true, false,BKing.getName());
        Spaces F8 = new Spaces("F8", false, false,BBishopF.getName());
        Spaces G8 = new Spaces("G8", true, false,BKnightG.getName());
        Spaces H8 = new Spaces("H8", false, false,BRookH.getName());


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
