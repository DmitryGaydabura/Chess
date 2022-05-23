import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Utility {
    public Utility() throws UnsupportedEncodingException {
    }

    public static void drawScene(Figure[] allFigures) throws UnsupportedEncodingException {

        PrintStream printStream = new PrintStream(System.out, true, "utf-8");

        printStream.println("   +------------------------------------+");
        printStream.println(" 8 | " + allFigures[7].getCode() + " | " + allFigures[15].getCode() + " | " + allFigures[23].getCode() + " | " + allFigures[31].getCode() + " | " + allFigures[39].getCode() + " | " + allFigures[47].getCode() + " | " + allFigures[55].getCode() + " | " + allFigures[63].getCode() + " |");
        printStream.println("   +------------------------------------+");
        printStream.println(" 7 | " + allFigures[6].getCode() + " | " + allFigures[14].getCode() + " | " + allFigures[22].getCode() + " | " + allFigures[30].getCode() + " | " + allFigures[38].getCode() + " | " + allFigures[46].getCode() + " | " + allFigures[54].getCode() + " | " + allFigures[62].getCode() + " |");
        printStream.println("   +------------------------------------+");
        printStream.println(" 6 | " + allFigures[5].getCode() + " | " + allFigures[13].getCode() + " | " + allFigures[21].getCode() + " | " + allFigures[29].getCode() + " | " + allFigures[37].getCode() + " | " + allFigures[45].getCode() + " | " + allFigures[53].getCode() + " | " + allFigures[61].getCode() + " |");
        printStream.println("   +------------------------------------+");
        printStream.println(" 5 | " + allFigures[4].getCode() + " | " + allFigures[12].getCode() + " | " + allFigures[20].getCode() + " | " + allFigures[28].getCode() + " | " + allFigures[36].getCode() + " | " + allFigures[44].getCode() + " | " + allFigures[52].getCode() + " | " + allFigures[60].getCode() + " |");
        printStream.println("   +------------------------------------+");
        printStream.println(" 4 | " + allFigures[3].getCode() + " | " + allFigures[11].getCode() + " | " + allFigures[19].getCode() + " | " + allFigures[27].getCode() + " | " + allFigures[35].getCode() + " | " + allFigures[43].getCode() + " | " + allFigures[51].getCode() + " | " + allFigures[59].getCode() + " |");
        printStream.println("   +------------------------------------+");
        printStream.println(" 3 | " + allFigures[2].getCode() + " | " + allFigures[10].getCode() + " | " + allFigures[18].getCode() + " | " + allFigures[26].getCode() + " | " + allFigures[34].getCode() + " | " + allFigures[42].getCode() + " | " + allFigures[50].getCode() + " | " + allFigures[58].getCode() + " |");
        printStream.println("   +------------------------------------+");
        printStream.println(" 2 | " + allFigures[1].getCode() + " | " + allFigures[9].getCode() + " | " + allFigures[17].getCode() + " | " + allFigures[25].getCode() + " | " + allFigures[33].getCode() + " | " + allFigures[41].getCode() + " | " + allFigures[49].getCode() + " | " + allFigures[57].getCode() + " |");
        printStream.println("   +------------------------------------+");
        printStream.println(" 1 | " + allFigures[0].getCode() + " | " + allFigures[8].getCode() + " | " + allFigures[16].getCode() + " | " + allFigures[24].getCode() + " | " + allFigures[32].getCode() + " | " + allFigures[40].getCode() + " | " + allFigures[48].getCode() + " | " + allFigures[56].getCode() + " |");
        printStream.println("   +------------------------------------+");
        printStream.println("      A   B    C   D   E    F    G   H  ");
    }

    public static Figure[] makeMove(Figure[] allFigures){
        System.out.println("Enter your move:");
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int m = decidingIndexWhat(n);


        Scanner on = new Scanner(System.in);
        String m1 = in.nextLine();
        int k = decidingIndexWhat(m1);

        Figure A = new Figure("",false,"","");

        A = allFigures[m];
        allFigures[m] = allFigures[k];
        allFigures[k] = A;
        return allFigures;


    }


    public static int decidingIndexWhat(String n) {



        if (n.startsWith("A")){
            if(n.endsWith("1")){
                return 0;
            } else if (n.endsWith("2")) {
                return 1;
            } else if (n.endsWith("3")) {
                return 2;
            } else if (n.endsWith("4")) {
                return 3;
            } else if (n.endsWith("5")) {
                return 4;
            } else if (n.endsWith("6")) {
                return 5;
            } else if (n.endsWith("7")) {
                return 6;
            } else if (n.endsWith("8")) {
                return 7;
            }
        } else if (n.startsWith("B")) {
            if(n.endsWith("1")){
                return 8;
            } else if (n.endsWith("2")) {
                return 9;
            } else if (n.endsWith("3")) {
                return 10;
            } else if (n.endsWith("4")) {
                return 11;
            } else if (n.endsWith("5")) {
                return 12;
            } else if (n.endsWith("6")) {
                return 13;
            } else if (n.endsWith("7")) {
                return 14;
            } else if (n.endsWith("8")) {
                return 15;
            }

        } else if (n.startsWith("C")) {
            if(n.endsWith("1")){
                return 16;
            } else if (n.endsWith("2")) {
                return 17;
            } else if (n.endsWith("3")) {
                return 18;
            } else if (n.endsWith("4")) {
                return 19;
            } else if (n.endsWith("5")) {
                return 20;
            } else if (n.endsWith("6")) {
                return 21;
            } else if (n.endsWith("7")) {
                return 22;
            } else if (n.endsWith("8")) {
                return 23;
            }

        } else if (n.startsWith("D")) {
            if(n.endsWith("1")){
                return 24;
            } else if (n.endsWith("2")) {
                return 25;
            } else if (n.endsWith("3")) {
                return 26;
            } else if (n.endsWith("4")) {
                return 27;
            } else if (n.endsWith("5")) {
                return 28;
            } else if (n.endsWith("6")) {
                return 29;
            } else if (n.endsWith("7")) {
                return 30;
            } else if (n.endsWith("8")) {
                return 31;
            }

        } else if (n.startsWith("E")) {
            if(n.endsWith("1")){
                return 32;
            } else if (n.endsWith("2")) {
                return 33;
            } else if (n.endsWith("3")) {
                return 34;
            } else if (n.endsWith("4")) {
                return 35;
            } else if (n.endsWith("5")) {
                return 36;
            } else if (n.endsWith("6")) {
                return 37;
            } else if (n.endsWith("7")) {
                return 38;
            } else if (n.endsWith("8")) {
                return 39;
            }

        } else if (n.startsWith("F")) {
            if(n.endsWith("1")){
                return 40;
            } else if (n.endsWith("2")) {
                return 41;
            } else if (n.endsWith("3")) {
                return 42;
            } else if (n.endsWith("4")) {
                return 43;
            } else if (n.endsWith("5")) {
                return 44;
            } else if (n.endsWith("6")) {
                return 45;
            } else if (n.endsWith("7")) {
                return 46;
            } else if (n.endsWith("8")) {
                return 47;
            }

        } else if (n.startsWith("G")) {
            if(n.endsWith("1")){
                return 48;
            } else if (n.endsWith("2")) {
                return 49;
            } else if (n.endsWith("3")) {
                return 50;
            } else if (n.endsWith("4")) {
                return 51;
            } else if (n.endsWith("5")) {
                return 52;
            } else if (n.endsWith("6")) {
                return 53;
            } else if (n.endsWith("7")) {
                return 54;
            } else if (n.endsWith("8")) {
                return 55;
            }

        } else if (n.startsWith("H")) {
            if(n.endsWith("1")){
                return 56;
            } else if (n.endsWith("2")) {
                return 57;
            } else if (n.endsWith("3")) {
                return 58;
            } else if (n.endsWith("4")) {
                return 59;
            } else if (n.endsWith("5")) {
                return 60;
            } else if (n.endsWith("6")) {
                return 61;
            } else if (n.endsWith("7")) {
                return 62;
            } else if (n.endsWith("8")) {
                return 63;
            }

        }
        return 0;
    }
}

