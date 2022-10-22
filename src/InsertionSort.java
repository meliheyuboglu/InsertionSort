public class InsertionSort {
    public void insertionsort(int[] array){
        int n = array.length;
        for(int i = 1 ; i < n ; i++){
            int curr_element = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > curr_element ){
                array[j+1] = array[j];
                j--;
            }
            // after the last loop we should concider that j one more time reduced
            array[j+1] = curr_element;
        }
    }
    }
