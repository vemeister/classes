package class2;

class ControlFlow {

    static void switchBinaryValues(int[] binaryValues) {
        for (int i = 0; i < binaryValues.length; i++) {
            if (binaryValues[i] == 1) binaryValues[i] = 0;
            else binaryValues[i] = 1;
        }

    }

    static int[] getItemsMultpleOfThree() {
        int[] items = new int[8];
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            items[i] = count;
            count += 3;
        }
        return items;
    }

    static int[] doubleItemsLessThanSix(int[] items) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] < 6)  {
                items[i] *= 2;
            }
        }
        return items;
    }

    static int[][] createIdentityMatrix(int rows, int cols) {
        int[][] idendityMatrix = new int [rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) idendityMatrix[i][j] = 1;
                else idendityMatrix[i][j] = 0;
            }
        }
        return idendityMatrix;
    }

    static int[] getMinAndMax(int[] items) {
        int min = items[0];
        int max = items[0];
        for (int i = 1; i < items.length; i++) {
            if (items[i] > max) max = items[i];
            else if (items[i] < min) min = items[i];
        }
        return new int[]{min, max};
    }

}
