public class Spaces {
    public String index;
    public boolean isWhite;
    public boolean isEmpty;
    public Figure figureHere;

    public Spaces(String index, boolean isWhite, boolean isEmpty, Figure figureHere) {
        this.index = index;
        this.isWhite = isWhite;
        this.isEmpty = isEmpty;
        this.figureHere = figureHere;

    }

    public Figure getFigureHere() {
        return figureHere;
    }
}
