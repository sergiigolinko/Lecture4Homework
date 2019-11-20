public class ArraysHomework {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        compareArrays(array1, array2);
        int[] array3 = {1, 1, 2, 2, 2};
        mostCommonElement(array3);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        bilinearSearch(array, 0);


    }

    public static void compareArrays(int[] array1, int[] array2) {
        boolean a = false;

        for (int i = 0; i < array2.length; i++) {

            if (array2[i] == array1[i]) {
                a = true;
            }
            if (array2[i] != array1[i]) {
                a = false;
                break;
            }
        }
        System.out.println(a);
    }

    public static void mostCommonElement(int[] array3) {
        int numberElementMeeting = 1;
        int elementIndex = 0;
        for (int i = 0; i < array3.length; i++) {
            int sameValueElement = 0;
            for (int j = 0; j < array3.length; j++) {
                if (array3[i] == array3[j]) {
                    sameValueElement++;
                }
            }
            if (sameValueElement > numberElementMeeting) {
                numberElementMeeting = sameValueElement;
                elementIndex = i;
            }
        }
        System.out.println(array3[elementIndex]);
    }

    public static void bilinearSearch(int[] array, int requiredNumber) {
        int firstIndex = 0;
        int lastIndex = 9;
        boolean x = false;
        while (firstIndex <= lastIndex) {
            int middleIndex = firstIndex + (lastIndex - firstIndex) / 2;
            if (requiredNumber < array[middleIndex]) {
                lastIndex = middleIndex - 1;
            } else if (requiredNumber > array[middleIndex]) {
                firstIndex = middleIndex + 1;
            } else {
                x = true;
                break;
            }
        }
        if (x == true) {
            System.out.println("There is element in array");
        } else System.out.println("There is not element in array");
    }
}
