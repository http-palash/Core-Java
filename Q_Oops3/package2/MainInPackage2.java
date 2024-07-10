package Q_Oops3.package2;
import Q_Oops3.Package.Teacher;

public class MainInPackage2 extends Teacher{

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        // obj.id = 123; not accessible
        obj.teachingClass = 12;

        //obj.degree = "Masters";
        //java: degree is not public in Oops3.Package.Teacher; cannot be accessed from outside package

        MainInPackage2 mainInPackage2Obj = new MainInPackage2();
        mainInPackage2Obj.studentCount = 100;
    }
}
