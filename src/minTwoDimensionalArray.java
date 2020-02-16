public class minTwoDimensionalArray {
    public static void main(String[] args) {

        int arr[][]={{66,54,23},{31,29,79},{9,11,83}};

        int min=arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (min>arr[i][j]){
                    min=arr[i][j];

                }
            }
        }
        System.out.println("min="+min);

    }
}
