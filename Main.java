public class Main {


    public static void main(String[] args) {
        BlogPost lorem = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        BlogPost wait = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        BlogPost engineer = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention." +
                "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");
        System.out.println(lorem.title);


        PostIt example1 = new PostIt("Orange", "Idea 1", "blue");
        PostIt example2 = new PostIt("Pink", "Awesome", "black");
        PostIt example3 = new PostIt("Yellow", "Superb!", "green");

        System.out.println(example2.backgroundcolor);

        Animal dog = new Animal();

        dog.eat();
        dog.play();
        dog.play();
        dog.drink();

        System.out.println(dog.hunger);

        Sharpie sharpie1 = new Sharpie();
        sharpie1.use();
        System.out.println(sharpie1.inkAmount);








    }

}
