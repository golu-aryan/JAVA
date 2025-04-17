
public class WaveForms {
    public void display(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public boolean isDuplicate(int[] original, int size, int elements) {
        for (int i = 0; i < size; i++) {
            if (original[i] == elements) {
                return true;
            }
        }
        return false;
    }

    public int removeDuplicate(int[] original, int size, int[] unique) {
        int newSize = 0;
        for (int i = 0; i < size; i++) {
            if (!isDuplicate(unique, newSize, original[i])) {
                unique[newSize++] = original[i];
            }
        }
        return newSize;
    }

    public void sortArray(int[] unique, int newSize) {
        for (int i = 0; i < newSize - 1; i++) {
            for (int j = i + 1; j < newSize; j++) {
                if (unique[i] > unique[j]) {
                    int temp = unique[i];
                    unique[i] = unique[j];
                    unique[j] = temp;
                }
            }
        }
    }

    public void waveSort(int[] unique, int newSize) {
        for (int i = 0; i < newSize - 1; i += 2) {
            int temp = unique[i];
            unique[i] = unique[i + 1];
            unique[i + 1] = temp;
        }
    }
}