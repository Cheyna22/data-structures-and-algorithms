public class ArrayShift{

    public static String insertShiftArray(int num){
        int[] shiftedArray = new int[5]; // create new array


        for(int i = num; i < shiftedArray.length; i++) {
             = shiftedArray[i];
            shiftedArray[i] = shiftedArray[];

        }

        return insertShiftArray(5);
    }


    public static void main(){

    }
}

/** My thoughts for solving this problem
 * Create an array
 * loop thru array, stop at middle
 * shift indexes to right
 * insert value in open index
 * return array with new value at middle index
 **/
