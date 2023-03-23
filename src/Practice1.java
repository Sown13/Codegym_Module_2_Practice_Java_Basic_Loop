public class Practice1 {
    public static void main(String[] args) {
        System.out.println("In ra tat ca cac so nguyen to nho hon 100");
        for (int i = 0; i < 100 ; i++){
            if (checkPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean checkPrime(int num){
        if (num < 2){
            return false;
        } else {
            for (float i = 2; i < Math.sqrt(num); i++){
                if (num % i == 0){
                    return false;
                }
            } return true;
        }
    }
}