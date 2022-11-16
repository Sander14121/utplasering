public class Student extends Human{
    int id;

    public Student(String name, String gender, int age, int id) {
        super(name, gender, age);
        this.id = id;
    }
    public int getAge(){
    return age;
    }
    public String getName(){
    return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
