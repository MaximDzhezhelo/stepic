package lesson_7;

import java.util.Arrays;

public class SortTwoSortedArrays {

    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 5, 7, 9, 11, 15};
        int[] arraySecond= {2, 6, 8, 12, 16, 28, 32};

        final int lengthFirst = arrayFirst.length;
        final int lengthSecond = arraySecond.length;

        final int size = lengthFirst + lengthSecond;
        int[] arrayResult = new int[size];

        int indexFirst = 0;
        int indexSecond = 0;
        for(int i = 0; i < size; i++){
            if(indexFirst < lengthFirst && indexSecond < lengthSecond) {
                final int tempFirst = arrayFirst[indexFirst];
                final int tempSecond = arraySecond[indexSecond];

                if (tempFirst > tempSecond) {
                    arrayResult[i] = tempSecond;
                    indexSecond = indexSecond + 1;
                } else {
                    arrayResult[i] = tempFirst;
                    indexFirst = indexFirst + 1;
                }
            }else if (lengthFirst >= i){
                arrayResult[i] = arrayFirst[indexFirst];
                indexFirst = indexFirst + 1;
            }else{
                arrayResult[i] = arraySecond[indexSecond];
                indexSecond = indexSecond + 1;
            }
        }

        System.out.println(Arrays.toString(arrayResult));
    }

}