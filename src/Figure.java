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

    public Figure(String name, boolean isWhite, String code) {
        this.Name = name;
        this.isWhite = isWhite;
        this.code = code;
    }
}
