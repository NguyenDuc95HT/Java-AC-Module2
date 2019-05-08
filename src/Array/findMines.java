package Array;

import java.util.Random;
import java.util.Scanner;

public class findMines {
    private int size;
    private int mine;
    private int indexMine;

    public findMines() {
    }

    public int getSize() {
        return size;
    }

    public int getMine() {
        return mine;
    }

    public int getIndexMine() {
        return indexMine;
    }

    public findMines(int size) {
        this.size = size;
    }

    public int[] makeMine () {
        Random rd = new Random();
        int amount = (int)((size * size) / 6.4);
        int[] arr = new int[amount];
        for (int i = 0; i < amount; i++) {
            arr[i] = 1 + rd.nextInt(size * size - 1);
            for (int j = i - 1; j > 0; j--) {
                do {
                    arr[i] = rd.nextInt(size * size);
                }
                while (arr[i] == arr[j]);
            }
        }
        return arr;
    }

    public int[][] mekeMapMine () {
        int[][] arr = new int[size][size];
        int[] arrMine = makeMine();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                    arr[i][j] = 0;
            }
        }
        for (int index = 0; index < arrMine.length - 1; index++) {
            arr[arrMine[index] / size][arrMine[index] % size] = -1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j] == -1) {
                    continue;
                } else {
                    if(i == 0) {
                        if (j == 0) {
                            if (arr[i][j + 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i + 1][j + 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i + 1][j] == -1) {
                                arr[i][j] += 1;
                            }
                        } else if (j == size - 1) {
                            if (arr[i][j - 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i + 1][j - 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i + 1][j] == -1) {
                                arr[i][j] += 1;
                            }
                        } else {
                            if (arr[i][j + 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i + 1][j] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i + 1][j + 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i][j - 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i + 1][j - 1] == -1) {
                                arr[i][j] += 1;
                            }
                        }
                    } else if(i == size -1) {
                        if (j == size -1) {
                            if (arr[i - 1][j] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i - 1][j - 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i][j - 1] == -1) {
                                arr[i][j] += 1;
                            }
                        } else if (j == 0) {
                            if (arr[i - 1][j] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i - 1][j + 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i][j + 1] == -1) {
                                arr[i][j] += 1;
                            }
                        } else {
                            if (arr[i][j - 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i -1][j + 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i - 1][j - 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i - 1][j] == -1) {
                                arr[i][j] += 1;
                            }

                            if (arr[i][j + 1] == -1) {
                                arr[i][j] += 1;
                            }
                        }
                    } else {
                        if(j == 0) {
                            if (arr[i - 1][j] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i + 1][j] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i][j + 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i + 1][j + 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i - 1][j + 1] == -1 ) {
                                arr[i][j] += 1;
                            }
                        } else if (j == size -1){
                            if (arr[i - 1][j] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i + 1][j] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i][j - 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i + 1][j - 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i - 1][j - 1] == -1 ) {
                                arr[i][j] += 1;
                            }
                        } else {
                            if (arr[i][j - 1] == -1 ) {
                                arr[i][j] += 1;
                            }
                            if (arr[i - 1][j - 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i][j + 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i - 1][j + 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i + 1][j] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i - 1][j] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i + 1][j - 1] == -1) {
                                arr[i][j] += 1;
                            }
                            if (arr[i + 1][j + 1] == -1) {
                                arr[i][j] += 1;
                            }
                        }
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of matrix:~$ ");
        int size = scan.nextInt();
        findMines map = new findMines(size);
        int[][] arr = map.mekeMapMine();
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (ints[j] == -1) {
                    System.out.print(" @ ");
                } else if (ints[j] == 0) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + ints[j] + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
