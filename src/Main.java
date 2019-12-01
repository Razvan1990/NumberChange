import methods.Transformations;
import rechange.Rechange;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Transformations transformations = new Transformations();
        Rechange rechange = new Rechange(transformations);

        List<Integer> myList = transformations.digitList(transformations.giveNumber());
        Integer[] array = transformations.arrayList(myList);
        Integer[] newArray = transformations.sortedArray(array);
        System.out.println(rechange.finalNumber(newArray));

        String s = rechange.numberAsString();
        System.out.println(s);



    }
}
