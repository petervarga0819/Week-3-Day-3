package Sharpie;

public class Sharpie<inkAmount, width, color> {


    String color;
    float width;
    float inkAmount;

    public Sharpie() {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public void use() {
        this.inkAmount--;
    }
}


