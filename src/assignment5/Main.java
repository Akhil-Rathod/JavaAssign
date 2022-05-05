package assignment5;


public class Main {
    public static void main(String[] args) {
        First obj1 = new First();
        obj1.printVar();
        obj1.printLocal();

        Second obj2= Second.getObject("ram");
        obj2.printIt();


    }


}