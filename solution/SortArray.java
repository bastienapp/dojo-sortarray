class SortArray {
	
	public static int[] sort(int[] array){
		int min, temp, iMin;
		for (int i = 0; i < array.length ; i++) {
			min = array[i];
			iMin = i;
			for (int j = i + 1; j < array.length ; j++) {
				if (min > array[j]) {
					min = array[j];
					iMin = j;
				}
			}

			temp = array[i];
			array[i] = tab[iMin];
			array[iMin] = temp;
		}
		return array;	
	}
}
