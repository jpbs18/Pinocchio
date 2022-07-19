package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Pinocchio pinocchio = new Pinocchio();

        pinocchio.lie();// nose gets bigger
        pinocchio.fixHead();// not exploded yet, don't need to fix it
        pinocchio.lie();// nose gets bigger
        pinocchio.lie();// nose gets bigger
        pinocchio.lie();// head just exploded

        pinocchio.goodDeed();// can't do anything before fixing head
        pinocchio.fixHead();// your head is fixed but damaged forever
        pinocchio.goodDeed();// nose getting smaller, good boy!
        pinocchio.goodDeed();// nose getting smaller, good boy!
        pinocchio.goodDeed();// nose getting smaller, good boy!
        pinocchio.goodDeed();// pinocchio lied too much, can't be a boy.

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        Pinocchio  pinocchio2 = new Pinocchio();

        pinocchio2.goodDeed();// nose getting smaller, good boy!
        pinocchio2.goodDeed();// nose getting smaller, good boy!
        pinocchio2.goodDeed();// nose getting smaller, good boy!
        pinocchio2.goodDeed();// you are a real boy!
        pinocchio2.fixHead();// don't need to fix what is perfect.
        pinocchio2.lie();//nose stay the same
        pinocchio2.goodDeed();//good deeds always welcome



    }
}

