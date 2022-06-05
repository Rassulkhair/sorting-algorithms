import java.util.Arrays;

public class Main {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;


        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;

        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(array));

        if (low < j) {
            quickSort(array, low, j);
        }
        if (high > i) {
            quickSort(array, i, high);
        }
    }


    public static void main(String[] args) {

        int[] mas = new int[]{32, 46, 9, 53, 43, 23, 1, 754, 76, 99};
        int low = 0;
        int high = mas.length - 1;

        System.out.println("Исходный массив " + " " + Arrays.toString(mas));

        quickSort(mas, low, high);


    }
}


//Selection Sort:

//for (int i = 0; i < arr.length - 1; i++)
//        {
//            int index = i;
//            for (int j = i + 1; j < arr.length; j++){
//                if (arr[j] < arr[index]){
//                    index = j;//searching for lowest index
//                }
//            }
//            int smallerNumber = arr[index];
//            arr[index] = arr[i];
//            arr[i] = smallerNumber;
//        }


//Bubble Sort:
//while (!isSorted){
//            isSorted=true;
//
//            for (int i= 0; i< arr.length-1; i++){
//                if (arr[i]>arr[i+1]){
//                    isSorted=false;
//
//                    bruh= arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=bruh;
//                }
//            }
//        }


// сортировка вставками
//int j;
//	// Обходим список
//	for (int i = 1; i < arr.length; i++) {
//		int temp = arr[i];
//		for (j = i; j >0 && temp<arr[j-1]; j--) {
//			arr[j] = arr[j-1];
//		}
//		arr[j] = temp;
//        System.out.println(Arrays.toString(arr));