package homework.lesson11.task3;

public enum  Color implements Comparable<Color>{

    BLACK (1),
    GRAY(2),
    BROWN(3),
    ORANGE(4),
    BEIGE(5),
    WHITE(6)
    ;
    private int code;
    Color(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
