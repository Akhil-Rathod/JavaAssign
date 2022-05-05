package Assignment7;

public class Constructor {
    static class innerclass{
        innerclass(String str){
            System.out.println("the string is "+str);
        }
    }
}
class secondClass{
    static class inner2 extends Constructor.innerclass {

        inner2(String str) {
            super(str);
        }
    }
}