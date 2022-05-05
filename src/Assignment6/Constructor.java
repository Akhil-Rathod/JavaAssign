package Assignment6;

public class Constructor {
    String name;
    int age;
    public Constructor(String name)
    {
        this.name=name;
        System.out.println(this.name);
    }
    public Constructor(int age) {
        new Constructor("Mani");
        this.age=age;
    }

    public static void main(String[] args)
    {
        Constructor example=new Constructor(45);
        System.out.println(example.name);
        System.out.println(example.age);
        Constructor[] array=new Constructor[3];
        array[0]=new Constructor("Harsha");

    }
}