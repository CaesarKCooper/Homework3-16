package Homework;

public class Phraseomatic {
    public static void main(String[] args) {

        String[] wordListOne = {"car", "dog", "cat", "mouse", "cow"};
        String[] wordListTwo = {"towel", "box", "zipper", "floor", "chair"};
        String[] wordListThree = {"shoe", "bag", "blanket", "shirt", "cereal"};

        int oneLength = wordListOne.length;
        int twolength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twolength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.print("What we need is a " + phrase);
    }
}

