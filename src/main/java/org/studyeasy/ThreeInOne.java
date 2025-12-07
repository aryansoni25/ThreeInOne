package org.studyeasy;

public class ThreeInOne {
    private int numberOfStack=3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize){
        stackCapacity=stackSize;
        values=new int[stackSize*numberOfStack];
        sizes=new int[numberOfStack];
    }

    public boolean isFull(int stackNum){
        if(sizes[stackNum]==stackCapacity){
            return true;
        }else {
            return false;
        }
    }


    public boolean isEmpty(int stackNum){
        if(sizes[stackNum]==0){
            return true;
        }else{
            return false;
        }
    }


    private int indexOfTop(int stackNum){
        int offset=stackNum*stackCapacity;
        int size=sizes[stackNum];
        return offset+size-1;
    }

    public void push(int stackNum,int value){
        if(isFull(stackNum)){
            System.out.println("The Stack id Full!!");
        }else{
            sizes[stackNum]++;
            values[indexOfTop(stackNum)]=value;
        }
    }

    public int pop(int stackNum){
        if(isEmpty(stackNum)){
            System.out.println("The Stack id Empty!! ");
            return -1;
        }else{
            int topOfIndex=indexOfTop(stackNum);
            int value=values[topOfIndex];
            values[topOfIndex]=0;
            sizes[stackNum]--;
            return value ;
        }
    }

    public int peek(int stackNum){
        if(isEmpty(stackNum)){
            System.out.println("The Stack id Empty!! ");
            return -1;
        }else{
            return values[indexOfTop(stackNum)];
        }
    }

}
