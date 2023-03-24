public class Test {
    public static void main(String[] args) {
        int [] arrTest = {1,2,3};
//        int [] newArrTest = {};
//        int [] newArrTest = push(arrTest, 4);
//        for (int num : newArrTest){
//            System.out.println(num);
//        }
//        System.out.println("push again");
//        newArrTest = push(newArrTest,5);
//        for (int num : newArrTest){
//            System.out.println(num);
//        }
        arrTest = push(arrTest,5);
        for (int num : arrTest){
                System.out.println(num);
        }
        int [] arrCopy = arrTest;
        for (int num : arrCopy){
            System.out.println(num);
        }
        int [] arrTest2 = {2,3,4,5};
        arrTest = arrTest2;
        for (int num : arrTest){
            System.out.println(num);
        }
    }
    public static int[] push(int [] array, int push) {
        int [] arrayAfterPush = new int[array.length + 1];
        System.arraycopy(array,0,arrayAfterPush,0,array.length);
        arrayAfterPush[array.length] = push;
        return arrayAfterPush;
    }
}

/// override an array (give it another reference)