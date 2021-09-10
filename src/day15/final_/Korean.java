package day15.final_;

public class Korean {

    String name;

    // 상수는 불변해야 하며 공유되어야 함.
    static final String NATION;
    final String sid;

    static {
        NATION = "대전";
    }

    public Korean(String name, String sid) {
        this.name = name;
        this.sid = sid;

    }

    public static void main(String[] args) {


    }
}
