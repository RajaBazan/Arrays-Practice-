package hello.com;

public class Arrays_ps_lec_29 {
    public static void main(String[] args) {
//        Practice Problem#1:
//    float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//    float sum = 0;
//    for (float element:marks) {
//        sum = sum + element;
//    }
//        System.out.println("The value of sum is:");
//        System.out.println(sum);
//    }
//        Practice Problem#2:
//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float num = 45.57f;
//        boolean isInArray = false;
//        for (float element:marks) {
//        if (num == element){
//            isInArray = true;
//            break;
//        }
//        }
//        if (isInArray){
//            System.out.println("the value is present in array:");
//        }
//        else {
//            System.out.println("The value is not present in array:");
//        }
//        Practice Problem#2 again:
//        float [] marks = {45.7f,63.4f,53.02f};
//        float num = 632.4f;
//        boolean isInArray = false;
//        for (float element:marks){
//            if (num==element){
//                isInArray = true;
//                break;
//            }
//            }
//            if (isInArray){
//                System.out.println("the value is in arrays");
//            }
//            else {
//                System.out.println("The value is not present in array");
//            }
//        }
//    }
//
//        Practice Problem#3:
//   float [] marks ={43.3f,42.2f,63.7f,99.01f,100.0f};
//   float sum = 0;
//   for (float element:marks){
//       sum = sum+element;
//   }
//        System.out.println("The avg of marks is" + sum/ marks.length);
//
//    }
//    }
//          Practice Problem#4:
//        int [][] mat1 = {{1, 2, 3},
//                         {4, 5, 6}};
//        int [][] mat2 = {{2, 6, 13},
//                         {3, 7, 1}};
//        int [][] result = {{0, 0, 0},
//                           {0, 0, 0}};
//        for (int i=0; i<mat1.length;i++){
//            for (int j=0; j<mat1[i].length;j++){
//                System.out.format("Setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        for (int i=0; i<mat1.length;i++){
//            for (int j=0; j<mat1[i].length;j++){
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println("");
//        }
//    }}
//       Practice Problem# 5:
//
//    }
//}}
//        int [] arr = {1, 2, 3, 4, 5, 6};
//        int l= arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//        for (int i=0;i<n;i++){
////            Swap a[i] and a[l-1-i] //Formula that use to swap
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//            for (int element: arr){
//                System.out.print(element + " ");
//            }
//
//        }
//    }}
//      Practice Problem#6:
//        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
//        int max = 0;
//        for (int element:arr){
//            if (element>max){
//                max = element;
//            }
//        }
//        System.out.println("The value of max is " + max);
////        Practice Problem#7
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//    }}
//        Practice Problem# 8:
        boolean isSorted = true;
        int [] arr = {1, 2,3, 4, 5, 34, 67};
        for (int i=0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]){
            isSorted = false;
            break;
            }}
            if (isSorted){
                System.out.println("The Array is sorted");

            }
            else {
                System.out.println("The Array is not sorted");
            }
        }

    }
