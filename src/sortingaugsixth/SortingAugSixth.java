package sortingaugsixth;

public class SortingAugSixth {

    public static void main(String[] args) {
        int[] a = {44,55,6,67,94,100,14};
        bubbleSort(a);
        bubbleSortOptimized(a);
        bubbleSortOptimized2(a);
        insertSort(a);
        selectionSort(a);
        
    }
    
    
    public static int[] bubbleSort(int[] a) {
        int steps = 0;
        for(int j = 0; j < a.length - 1; j++){ //you will always have the largest item be at the end.
            //comparison for each first coded
            for(int i = 0; i < a.length - 1; i++) { //n - 2 as final comparison will we be n + 2 (n- 1)
                if(a[i] > a[i+1]) { //swap them aroudn
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
                steps++;
            }
        }
        System.out.println("Steps: " + steps);
        return a;
    }
    
    public static int[] bubbleSortOptimized(int[] a) {
        int steps = 0;
        for(int j = 0; j < a.length - 1; j++){ //you will always have the largest item be at the end.
            //comparison for each first coded
            for(int i = 0; i < a.length - 1 - j; i++) { //n - 2 as final comparison will we be n + 2 (n- 1)
                    if(a[i] > a[i+1]) { //swap them aroudn
                        int temp = a[i];
                        a[i] = a[i+1];
                        a[i+1] = temp;
                    }
                    steps++;
            }
        }
        System.out.println("Steps: " + steps);
        return a;
    }
    
    public static int[] bubbleSortOptimized2(int[] a) {
        int steps = 0;
        for(int j = 0; j < a.length - 1; j++){ //you will always have the largest item be at the end.
            //comparison for each first coded
            boolean swapped = false;
            for(int i = 0; i < a.length - 1 - j; i++) { //n - 2 as final comparison will we be n + 2 (n- 1)
                if(a[i] > a[i+1]) { //swap them aroudn
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    swapped = true;
                }
                steps++;
            }
            if(!swapped) {
                //nothing swapped, so no need to continue sorting.
                System.out.println("Steps: " + steps);
                return a;
            } 
        }
        System.out.println("Steps: " + steps);
        return a;
    }
    
    public static int[] insertSort(int[] a) {
        /* advance the position through the entire array */
        /*   (could do j < n-1 because single element is also min element) */
        int steps = 0;
        for (int j = 0; j < a.length - 1; j++) {
            /* find the min element in the unsorted a[j .. n-1] */
            /* assume the min is the first element */
            int iMin = j;

            /* test against elements after j to find the smallest */
            for (int i = j + 1; i < a.length; i++) {
                /* if this element is less, then it is the new minimum */
                if (a[i] < a[iMin]) {
                    /* found new minimum; remember its index */
                    iMin = i;
                }
                steps++;
            }

            if (iMin != j) {
                int temp = a[j];
                a[j] = a[iMin];
                a[iMin] = temp;
            }
        }
        System.out.println("Steps: " + steps);
        return a;
    }
    
    public static int[] selectionSort(int[] a){
        int steps = 0;
        for (int i = 0; i < a.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < a.length; j++){
                if (a[j] < a[index]) 
                    index = j;
                steps++;
            }
            int smallerNumber = a[index];  
            a[index] = a[i];
            a[i] = smallerNumber;
        }
        System.out.println("Steps: " + steps);
        return a;
    }
}
