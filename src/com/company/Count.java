package com.company;

public class Count {

    public static int count = 0;

    public Count() {
        count++;
    }

    public static void main(String[] args) {
        Count Count1 = new Count();
        Count Count2 = new Count();
        Count Count3 = new Count();

        System.out.println("Created " + Count.count + " objects");
    }
}