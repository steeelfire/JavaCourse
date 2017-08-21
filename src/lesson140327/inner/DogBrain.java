package lesson140327.inner;

public class DogBrain {

    private interface BrainState{
        void feed();
        void pat();

    }

    private class Hungry implements BrainState{

        @Override
        public void feed() {
            mood += 2;
            System.out.println("bark");
            if (mood > 0){
                state = fat;
            }
        }

        @Override
        public void pat() {
            mood--;
            System.out.println("bite");

        }
    }


    private BrainState hungry = new Hungry();

    //Аннонимный класс
    private BrainState fat = new BrainState(){

        @Override
        public void feed() {
            mood += 1;
            System.out.println("bark");
        }

        @Override
        public void pat() {
            mood--;
            System.out.println("wag");
            if (mood <= 0){
                state = hungry;
            }
        }
    };


    private BrainState state;
    private int mood;

    public DogBrain() {
        state = hungry;
    }

    public void feed(){
        state.feed();
    }

    public void pat(){
        state.pat();
    }

    public static void main(String[] args) {
        DogBrain dog = new DogBrain();

        dog.pat();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.pat();
        dog.pat();
        dog.pat();
        dog.pat();
    }
}
