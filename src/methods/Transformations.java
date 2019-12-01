package methods;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transformations {


        public int giveNumber() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please introduce the number");
            int numar = scanner.nextInt();
            return numar;
        }



    public List<Integer> digitList(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number != 0) {
            int digit = number % 10;
            digits.add(digit);
            number /= 10;
        }
        return digits;
    }

    public Integer[] arrayList(List<Integer> list) {
        Integer[] arrayDigits = new Integer[list.size()];
        arrayDigits = list.toArray(arrayDigits);
        return arrayDigits;


    }

    public Integer[] sortedArray (Integer[] unsortedArray){
        // Integer [] newArray = new Integer[unsortedArray.length];

        for(Integer i =0;i<unsortedArray.length;i++){
            for(Integer j =0;j<unsortedArray.length;j++){
                if(unsortedArray[i]<unsortedArray[j]){
                    Integer temp = unsortedArray[i];
                    unsortedArray[i]=unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }


        return unsortedArray;
    }

}
