package print;

public class AscSeqNumbers {

 // Print 1,2,3,4,5
    public static void main(String[] args) {
         int a = 1;
         int b = 2;
         int c = 3;
         int d = 4;
         int e = 5;

         String str = ", ";
        System.out.println(a + str + b +str + c + str + d + str + e + str);

        for (int i = 1; i <= 100; i++){
            System.out.print(i + str);
        }
        System.out.println();
//        numbers(5,str);
        numbers(5);

    }
    static String str = ", ";

//    public static void numbers (int num, String str) {
//        for(int i = 1; i <= num; i ++){
//            if (i==num){
//                System.out.println(i);
//            }else{
//                System.out.print(i + str);
//            }

        public static void numbers(int num){
            for(int i = 1; i < num; i++){

                System.out.println(i + str);
            }
            System.out.println(num);
        }

        }





