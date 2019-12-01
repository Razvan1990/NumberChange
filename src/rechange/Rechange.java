package rechange;


import methods.Transformations;

import java.util.Arrays;
import java.util.List;

public class Rechange {

    private Transformations transformations;


    public Rechange(Transformations transformations ) {
        this.transformations = transformations;

    }

    public int finalNumber (Integer[] array){
        int number = 0;

        for(int i =0;i<array.length;i++){
            number*=10;
            number +=array[i];
        }
        return number;
    }



    public String numberAsString() {
        List<Integer> myList = transformations.digitList(transformations.giveNumber());
        Integer[] array = transformations.arrayList(myList);
        Integer[] newArray = transformations.sortedArray(array);
        String newNumber = Arrays.toString(newArray);
        return newNumber;
    }



}
