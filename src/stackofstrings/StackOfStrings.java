package stackofstrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String > date;

    StackOfStrings () {
        this.date= new ArrayList<>();

    }
    public  void push(String item) {
        this.date.add(item);

    }
    public  String pop() {
        return  this.date.remove(this.getLastIndex());

    }
    public  String peek () {
        return  this.date.get(this.getLastIndex());

    }
    public  boolean inEmpty () {
        return  this.date.isEmpty();
    }
    private int getLastIndex () {
        return this.date.size() - 1;
    }
}
