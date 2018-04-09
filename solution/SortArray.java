class SortArray {

    public static int[] sort(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = i; j < arrayToSort.length; j++) {
                int x = arrayToSort[i];
                int y = arrayToSort[j];
                if (y < x) {
                    // échanger les deux valeurs
                    arrayToSort[j] = x;
                    arrayToSort[i] = y;
                }
            }
        }
        return arrayToSort;
    }
}
