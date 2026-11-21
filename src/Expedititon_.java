public class Expedition_ {
    public char[][] map;

    public int row;
    public int column;

    public int energy;
    public int maxEnergy;

    public int collectedRelics;
    public int requiredRelics;

    public int moves;
    public String gameStatus;

    public Expedition_() {
        map = new char[0][0];

        row = -1;
        column = -1;

        energy = 0;
        maxEnergy = 0;

        collectedRelics = 0;
        requiredRelics = 0;

        moves = 0;
        gameStatus = "ACTIVE";
    }

    public boolean startNewGame(int rows, int cols) {
        return false;
    }

    public char[][] getMap() {
        char[][] copy = new char[map.length][];

        for (int i = 0; i < map.length; i++) {
            copy[i] = new char[map[i].length];

            for (int j = 0; j < map[j].length; j++) {
                copy[i][j] = map[i][j];
            }
        }

        return copy;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public int getEnergy() {
        return energy;
    }
    public int getCollectedRelics() {
        return collectedRelics;
    }

    public int getRequiredRelics() {
        return requiredRelics;
    }

    public int getMoves() {
        return moves;
    }

    public String getStatus() {
        return gameStatus;
    }

    public int getScore() {
        return 100 * collectedRelics + 5 * energy;
    }

    public String move(String direction) {
        if (!(gameStatus == "ACTIVE")) {
            return "NOT_ACTIVE";
        }


        return "INVALID_COMMAND";
    }


    public String execute(String command) {

        return "INVALID_COMMAND";
    }


}
