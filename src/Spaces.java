public class Spaces {
    public String index;
    public boolean isWhite;
    public boolean isEmpty;
    public String figureHere;

    public Spaces(String index, boolean isWhite, boolean isEmpty, String figureHere) {
        this.index = index;
        this.isWhite = isWhite;
        this.isEmpty = isEmpty;
        this.figureHere = figureHere;

    }

    public String getFigureHere() {
        return figureHere;
    }
}
