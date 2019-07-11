package Counter;

public class Counter {

    int number;
    int initVal;

    public Counter(){
        this(0);
    }
    public Counter (int number){
        this.number = number;
    }

    public void add(){
        this.number += 1;
    }

    public void add(int number){
        this.initVal = this.number;
        this.number += number;
    }

    public int get () {

        return this.number;
    }

    public void reset() {
        this.number = this.initVal;
    }
}