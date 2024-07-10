package Q_Oops3.Package;

public class Teacher {

    public int teachingClass;
    private int id;
    String degree ; // default (package private) only accessible to package
    protected int studentCount;

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass = 12;
        obj.id = 123;
    }
}
