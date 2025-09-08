public class Array {
    public static void main(String[] args) {

        //Array have fixed size.
        int arr[]={1,2,3,4,5};
        System.out.println(arr[3]);
        //out: 4
        int arr2[]=new int[4];
        arr2[0]=9;
        arr2[1]=2;
        arr2[2]=6;
        arr2[3]=5;
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        int arr1[][] = { {1,2,3}, {4,5,6} };
        System.out.println(arr1[0][1]);
        // out: 2
    }
}

