package life;

import java.util.Random;
import java.util.Scanner;

import static life.Sprawdzarka.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //long seed = scanner.nextLong();
        int countAlive = 0;
        //int elo = scanner.nextInt();
        var r = new Random();
        int generation = 1;
        var world = new char[n][n];
        boolean isChanged = false;
        char[][] outputArray = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                world[i][j] = r.nextBoolean() ? 'O' : ' ';
            }
        }
        int count = 0;
        for (int q = 0; q < 100; q++) {
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    if (isNAlive(world, x, y)) {
                        count++;
                    }
                    if (isEAlive(world, x, y)) {
                        count++;
                    }
                    if (isNEAlive(world, x, y)) {
                        count++;
                    }
                    if (isNWAlibe(world, x, y)) {
                        count++;
                    }
                    if (isSAlive(world, x, y)) {
                        count++;
                    }
                    if (isSEAlive(world, x, y)) {
                        count++;
                    }
                    if (isSWAlive(world, x, y)) {
                        count++;
                    }
                    if (isWAlive(world, x, y)) {
                        count++;
                    }

                    if (world[x][y] == 'O') {
                        if (count == 2 || count == 3) {
                            outputArray[x][y] = 'O';
                            countAlive++;
                        } else {
                            outputArray[x][y] = ' ';
                        }
                    } else {
                        if (count == 3) {
                            outputArray[x][y] = 'O';
                            countAlive++;
                        } else {
                            outputArray[x][y] = ' ';
                        }
                    }
                    count = 0;
                }
                isChanged = true;
            }
            if (isChanged) {
                copy(world, outputArray);
            } else {
                copy(outputArray, world);
            }
            System.out.println("Generation #" + generation);
            System.out.println("Alive: " + countAlive);
            copy(outputArray, world);
            for (char[] xd : outputArray) {
                for (char xD : xd) {
                    System.out.print(xD);
                }
                System.out.println();
            }
            generation++;
            countAlive = 0;
        }


    }
}
