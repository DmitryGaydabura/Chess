public class Figure {
    String Name;
    boolean isWhite;

    String code;

    public String getName() {
        return Name;
    }

    public String getCode() {
        return code;
    }

    public String position;

    public String getPosition() {
        return position;
    }

    public Figure(String name, boolean isWhite, String code, String position) {
        this.Name = name;
        this.isWhite = isWhite;
        this.code = code;
        this.position = position;
    }
}
