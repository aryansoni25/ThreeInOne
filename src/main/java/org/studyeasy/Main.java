package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        ThreeInOne TIO=new ThreeInOne(3);
        TIO.push(0,1);
        TIO.push(0,2);
        TIO.push(0,3);
        TIO.push(1,4);
        TIO.push(1,5);
        TIO.push(1,6);
        TIO.push(2,7);
        TIO.push(2,8);
        System.out.println(TIO.peek(0));
        System.out.println(TIO.peek(2));
        System.out.println(TIO.peek(1));
    }
}