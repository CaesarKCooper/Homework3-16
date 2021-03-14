package Homework;

public class Test {
    public static void main(String[] args) {
        String[] testString = {"cat", "dog"};
        int testStringLength = testString.length;
        int rand1 = (int) (Math.random() * testString.length);

        System.out.println(testString[rand1]);
    }
}
