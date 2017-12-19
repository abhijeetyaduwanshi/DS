package arrays;

public class ThreeDimensionalArrayInJava {
    public static void main(String[] args) {
        
        // declaring and initializing 3D array
        int[][][] arr = {{{10, 20, 30}, {40, 50, 60}, {70, 80, 90}},
                {{100, 200, 300}, {400, 500, 600}, {700, 800, 900}},
                {{1000, 2000, 3000}, {4000, 5000, 6000}, {7000, 8000, 9000}}};

        // printing 3D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
