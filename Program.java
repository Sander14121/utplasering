import java.sql.SQLOutput;

public class Program {
    public static void main(String[] args) {
        Student student1 = new Student("Hendrik", "gutt", 23, 42);
        System.out.println(student1.toString());
        Car car1 = new Car("Tesla", "Model s", 2021);
        System.out.println(car1.manufacturers + " " +car1.model);
        Car car2 = new Car("Aston Martin", "DB11", 2022);
        System.out.println(car2.manufacturers + " " + car2.model);
        Math matte1 = new Math(3,5);
        System.out.println(matte1.addison());
        Math matte2 = new Math(3,5);
        System.out.println(matte2.subtraksjon(5,3));
    }
}
