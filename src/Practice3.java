import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        checkGreatestCommonDivisor();
    }
    public static int[] push(int [] array, int push) {
        int [] arrayAfterPush = new int[array.length + 1];
//        for (int i = 0; i < array.length; i++) {
//            arrayAfterPush[i] = array[i];
//        }
        System.arraycopy(array,0,arrayAfterPush,0,array.length);
        arrayAfterPush[array.length] = push;
        return arrayAfterPush;
    }
    public static void checkGreatestCommonDivisor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so thu nhat");
        int a = scanner.nextInt();
        System.out.println("nhap so thu hai");
        int b = scanner.nextInt();
        int [] divisorA = {};
        int [] divisorB = {};
        if (a == 0 && b == 0){
            System.out.println("khong co uoc chung");
        } else if ( a == 0 && b != 0){
            System.out.println(("uoc so chung la: " + Math.abs(b)));
        } else if ( a != 0 && b == 0){
            System.out.println("uoc so chung la: " + Math.abs(a));
        } else {
            for (int i = 1; i <= a; i++){
                if ( a % i == 0){
                    divisorA = Practice3.push(divisorA, i);
                }
            }
            for (int j = 1; j <= b; j++){
                if ( b % j == 0){
                    divisorB = Practice3.push(divisorB, j);
                }
            }
            int [] commonDivisor = {};
            for (int i = 0; i < divisorA.length; i++ ){
                for (int j = 0; j < divisorB.length; j++){
                    if (divisorA[i] == divisorB[j]){
                        commonDivisor = Practice3.push(commonDivisor, divisorA[i]);
                    }
                }
            }
            int max = commonDivisor[0];
            for (int x = 1; x < commonDivisor.length; x++){
                if ( max < commonDivisor[x]){
                    max = commonDivisor[x];
                }
            }
            System.out.println("Uoc so chung lon nhat la: " + max);
        }
    }
}
