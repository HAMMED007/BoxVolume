package oop;

public class Main {

    public static void main(String[] args) {

        // test
        Box box = new Box(2,3,4,"red","plastic",true);
        System.out.println(box);
        System.out.println(box.calculateVolume());
        System.out.println(box.isReusable);
        System.out.println(box.height);

    }
}
