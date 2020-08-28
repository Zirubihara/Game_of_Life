package life;

public class Sprawdzarka {
    public static boolean isNWAlibe(char[][] world, int i, int j) {
        if (i != 0) {
            if (j != 0) {
                if (world[i - 1][j - 1] == 'O') {
                    return true;
                }
            } else {
                if (world[i - 1][world[0].length - 1] == 'O') {
                    return true;
                }
            }
        } else {
            if (j != 0) {
                if (world[world.length - 1][j - 1] == 'O') {
                    return true;
                }
            } else {
                if (world[world.length - 1][world[0].length - 1] == 'O') {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean isNEAlive(char[][] world, int i, int j) {
        if (i != 0) {
            if (j != world[0].length - 1) {
                if (world[i - 1][j + 1] == 'O') {
                    return true;
                }
            } else {
                if (world[i - 1][0] == 'O') {
                    return true;
                }
            }
        } else {
            if (j != world[0].length - 1) {
                if (world[world.length - 1][j + 1] == 'O') {
                    return true;
                }
            } else {
                if (world[world.length - 1][0] == 'O')
                    return true;
            }
        }
        return false;
    }

    public static boolean isSWAlive(char[][] world, int i, int j) {
        if (i != world.length - 1) {
            if (j != 0) {
                if (world[i + 1][j - 1] == 'O') {
                    return true;
                }

            } else {
                if (world[i + 1][world[0].length - 1] == 'O') {
                    return true;
                }
            }

        } else {
            if (j != 0) {
                if (world[0][j - 1] == 'O') {
                    return true;
                }
            } else {
                if (world[0][world[0].length - 1] == 'O') {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSEAlive(char[][] world, int i, int j) {
        if (i != world.length - 1) {
            if (j != world[0].length - 1) {
                if (world[i + 1][j + 1] == 'O') {
                    return true;
                }
            } else {
                if (world[i + 1][0] == 'O') {
                    return true;
                }
            }

        } else {
            if (j != world[0].length - 1) {
                if (world[0][j + 1] == 'O') {
                    return true;
                }
            } else {
                if (world[0][0] == 'O') {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isNAlive(char[][] world, int i, int j) {
        if (i != 0) {
            if (world[i - 1][j] == 'O') {
                return true;
            }
        } else {
            if (world[world.length - 1][j] == 'O') {
                return true;
            }
        }
        return false;
    }

    public static boolean isSAlive(char[][] world, int i, int j) {
        if (i != world.length - 1) {
            if (world[i + 1][j] == 'O') {
                return true;
            }
        } else {
            if (world[0][j] == 'O') {
                return true;
            }
        }
        return false;
    }

    public static boolean isWAlive(char[][] world, int i, int j) {
        if (j != 0) {
            if (world[i][j - 1] == 'O') {
                return true;
            }
        } else {
            if (world[i][world[0].length - 1] == 'O') {
                return true;
            }
        }
        return false;
    }

    public static boolean isEAlive(char[][] world, int i, int j) {
        if (j != world[0].length - 1) {
            if (world[i][j + 1] == 'O') {
                return true;
            }
        } else {
            if (world[i][0] == 'O') {
                return true;
            }
        }
        return false;
    }

//    public static boolean isAlive(char[][] world, int i, int i1) {
//        for (int i = 0; i < world.length; i++) {
//            for (int j = 0; j < world[0].length; j++) {
//
//            }
//        }
//        return true;
//    }

    public static void copy(char[][] world, char[][] output) {
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[0].length; j++) {
                world[i][j] = output[i][j];
            }
        }
    }

    public static char[][] n(char[][] world) {
        char[][] poprzednia = new char[world.length][world[0].length];
        for (int i = 0; i < world.length; i++) {
            System.arraycopy(world[i], 0, poprzednia[i], 0, world[i].length);
        }
        return poprzednia;
    }
}
