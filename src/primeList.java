public class primeList {
    static boolean isPrime(int number) {
        boolean checkPrime = true;
        if (number<2) {
            checkPrime = false;
        } else {
            for (int i = 2; i<=Math.sqrt(number); i++) {
                if (number%i == 0) {
                    checkPrime = false;
                    break;
                }
            }
        }
        return checkPrime;
    }
//    public static void main(String[] args) {
//        int count = 0;
//        int i =2;
//        System.out.println("The list of prime is:");
//        while (count<20) {
//            if (isPrime(i)) {
//                System.out.printf("%3d",i);
//                count++;
//            }
//            i++;
//        }
//    }
    public static void main(String[] args) {
        System.out.println("The list of prime that is lower than 100 is:");
        for (int i=0; i<100; i++) {
            if (isPrime(i)) {
                System.out.printf("%3d",i);
            }
        }
    }
}
