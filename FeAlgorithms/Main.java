class Main {

    void shortestPath(int Distance, int nPoint, int sp, int dp, int[] sRoute, int sDist) {
        
    }

    public static void main(String[] args) {
        int[][] distance = { { 0, 2, 8, 4, -1, -1, -1 }, { 2, 0, -1, -1, 3, -1, -1 }, { 8, -1, 0, -1, 2, 3, -1 },
                { 4, -1, -1, 0, -1, 8, -1 }, { 4, -1, -1, 0, -1, 8, -1 }, { -1, 3, 2, -1, 0, -1, 9 },
                { -1, -1, 3, 8, -1, 0, 3 }, { -1, -1, -1, -1, 9, 3, 0 } };

        int sp = 0;
        int dp = 6;
        int nPoint = 7;
        int[] sRoute = new int[15];
        int sDist = 0;
    }
}