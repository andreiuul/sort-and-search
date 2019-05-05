public class Main {

    public static void main(String[] args) {


        int[] vector = new int[]{8, 4, 9, 1, 2, 222};
        int sc = -1;
        int temp;
        int i = 0;

        //sort
        while (sc != 0) {
            sc = 0;
            for (i = 0; i < vector.length - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    temp = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = temp;
                    sc++;
                }
            }
        }

        //search
        int start = 0, end = vector.length - 1, middle = vector.length / 2;

        int n = 5;

        boolean found = false;
        while (start < end) {
            if (vector[middle] == n) {
                System.out.println("ye");
                found = true;
                break;
            } else if (n < vector[middle]) {
                end = middle - 1;
                middle = (end + start) / 2;
            } else {
                start = middle + 1;
                middle = (end + start) / 2;
            }
        }
        if (!found) {
            System.out.println("nah");
        }
    }
}