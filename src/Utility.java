import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Utility {
    public Utility() throws UnsupportedEncodingException {
    }

    public static void drawScene(Figure A1, Figure A2, Figure A3, Figure A4, Figure A5, Figure A6, Figure A7, Figure A8,
                                 Figure B1, Figure B2, Figure B3, Figure B4, Figure B5, Figure B6, Figure B7, Figure B8,
                                 Figure C1, Figure C2, Figure C3, Figure C4, Figure C5, Figure C6, Figure C7, Figure C8,
                                 Figure D1, Figure D2, Figure D3, Figure D4, Figure D5, Figure D6, Figure D7, Figure D8,
                                 Figure E1, Figure E2, Figure E3, Figure E4, Figure E5, Figure E6, Figure E7, Figure E8,
                                 Figure F1, Figure F2, Figure F3, Figure F4, Figure F5, Figure F6, Figure F7, Figure F8,
                                 Figure G1, Figure G2, Figure G3, Figure G4, Figure G5, Figure G6, Figure G7, Figure G8,
                                 Figure H1, Figure H2, Figure H3, Figure H4, Figure H5, Figure H6, Figure H7, Figure H8) throws UnsupportedEncodingException {

        PrintStream printStream = new PrintStream(System.out, true, "utf-8");

        printStream.println("   +----+---+----+---+----+---+----+----+");
        printStream.println(" 8 | " + A8.getCode() + " | " + B8.getCode() + " | " + C8.getCode() + " | " + D8.getCode() + " | " + E8.getCode() + " | " + F8.getCode() + " | " + G8.getCode() + " | " + H8.getCode() + " |");
        printStream.println("   +----+---+----+---+----+---+----+----+");
        printStream.println(" 7 | " + A7.getCode() + " | " + B7.getCode() + " | " + C7.getCode() + " | " + D7.getCode() + " | " + E7.getCode() + " | " + F7.getCode() + " | " + G7.getCode() + " | " + H7.getCode() + " |");
        printStream.println("   +----+---+----+---+----+---+----+----+");
        printStream.println(" 6 | " + A6.getCode() + " | " + B6.getCode() + " | " + C6.getCode() + " | " + D6.getCode() + " | " + E6.getCode() + " | " + F6.getCode() + " | " + G6.getCode() + " | " + H6.getCode() + " |");
        printStream.println("   +----+---+----+---+----+---+----+----+");
        printStream.println(" 5 | " + A5.getCode() + " | " + B5.getCode() + " | " + C5.getCode() + " | " + D5.getCode() + " | " + E5.getCode() + " | " + F5.getCode() + " | " + G5.getCode() + " | " + H5.getCode() + " |");
        printStream.println("   +----+---+----+---+----+---+----+----+");
        printStream.println(" 4 | " + A4.getCode() + " | " + B4.getCode() + " | " + C4.getCode() + " | " + D4.getCode() + " | " + E4.getCode() + " | " + F4.getCode() + " | " + G4.getCode() + " | " + H4.getCode() + " |");
        printStream.println("   +----+---+----+---+----+---+----+----+");
        printStream.println(" 3 | " + A3.getCode() + " | " + B3.getCode() + " | " + C3.getCode() + " | " + D3.getCode() + " | " + E3.getCode() + " | " + F3.getCode() + " | " + G3.getCode() + " | " + H3.getCode() + " |");
        printStream.println("   +----+---+----+---+----+---+----+----+");
        printStream.println(" 2 | " + A2.getCode() + " | " + B2.getCode() + " | " + C2.getCode() + " | " + D2.getCode() + " | " + E2.getCode() + " | " + F2.getCode() + " | " + G2.getCode() + " | " + H2.getCode() + " |");
        printStream.println("   +----+---+----+---+----+---+----+----+");
        printStream.println(" 1 | " + A1.getCode() + " | " + B1.getCode() + " | " + C1.getCode() + " | " + D1.getCode() + " | " + E1.getCode() + " | " + F1.getCode() + " | " + G1.getCode() + " | " + H1.getCode() + " |");
        printStream.println("   +----+---+----+---+----+---+----+----+");
        printStream.println("      A   B    C   D   E    F   G    H  ");


        System.out.println("\u2654");
    }


    // String symbol = "\u2654";


}

