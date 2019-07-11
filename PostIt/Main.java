package PostIt;

public class Main {


    public static void main(String[] args) {


        PostIt example1 = new PostIt("Orange", "Idea 1", "blue");
        PostIt example2 = new PostIt("Pink", "Awesome", "black");
        PostIt example3 = new PostIt("Yellow", "Superb!", "green");

        System.out.println(example2.backgroundcolor);
    }
}
