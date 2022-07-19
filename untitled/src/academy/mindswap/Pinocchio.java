package academy.mindswap;

public class Pinocchio {

    private int noseSize = 2;
    private final int MAX_NOSE_SIZE = 5;
    private boolean maxSizeReached;
    private boolean realBoy;
    private boolean cantBeABoy;

    public int getNoseSize(){
        return noseSize;
    }

    private void setNoseSize(int size){
        this.noseSize = size;
    }

    private void headExplode(){
        maxSizeReached = true;
        System.out.println("The head has just exploded, too many lies.");
    }

    public void fixHead(){
        if(realBoy){
            System.out.println("Don't need to fix what is perfect.");
            return;
        }

        if(maxSizeReached){
            maxSizeReached = false;
            cantBeABoy = true;
            setNoseSize(2);
            System.out.println("The head is fixed, but damaged forever....");
            return;
        }

        System.out.println("The head has not exploded yet, don't need to fix it!");
    }

    public void lie(){
        if(realBoy){
            System.out.println("Even if he lies, his nose will remain the same.");
            return;
        }

        if(noseSize == MAX_NOSE_SIZE){
            headExplode();
            return;
        }

        noseSize++;
        System.out.println("The nose is getting bigger...");
    }

    public void goodDeed(){
        if(realBoy){
            System.out.println("Good deeds are always welcome!");
            return;
        }

        if(getNoseSize() == -1){
            canHeBeAGoodBoy();
            return;
        }

        if(maxSizeReached){
            System.out.println("You need to fix the head before doing anything.");
            return;
        }

        noseSize--;
        System.out.println("The nose is getting smaller, good boy!");
    }

    private void canHeBeAGoodBoy(){
        if(cantBeABoy){
            System.out.println("Pinocchio lied to much, he will never be a real boy :(");
            return;
        }

        realBoy = true;
        System.out.println("You are a real boy :)");
    }

}
