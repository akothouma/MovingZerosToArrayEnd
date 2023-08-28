package MovingZerosToArrayEnd;

import java.util.Arrays;

public class MovingZerosToArrayEnd {
    public void movingZerosToArrayEnd( int [] array){
        int nonzeroindex,zeroindex=0,size=array.length;
        for(nonzeroindex=0;nonzeroindex<size;nonzeroindex++){
            if(array[nonzeroindex]!=0 && array[zeroindex]==0){
                int temp=array[nonzeroindex];
                array[nonzeroindex]=array[zeroindex];
                array[zeroindex]=temp;
            }
            if(array[zeroindex]!=0){
                zeroindex++;
            }

        }
        System.out.println("The array with zeros moved th the end is "+ Arrays.toString(array));
        }


    public static void main(String[] args) {
        MovingZerosToArrayEnd mztae= new MovingZerosToArrayEnd();
        mztae.movingZerosToArrayEnd( new int [] {0,1,0,4,12});
    }
    }

