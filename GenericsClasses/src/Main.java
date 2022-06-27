import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //bounded types = you can create the objects of a generic class to have data
        //                of specific derived types ex.Number

        MyGenerics<Integer,String> myInt = new MyGenerics(1,"dd");
        MyGenerics<Double,String> myDouble = new MyGenerics(3.14,"ss");
        MyGenerics<Integer,String> myChar = new MyGenerics(1,"d");
        MyGenerics<Integer,String> myString = new MyGenerics(2,"s");

        HashMap<Integer,String> users = new HashMap<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

    }
}