class Prime {
    // Task 2: main method
    // your code here


    // isNumPrime helper method
    // Returns true for prime number, false otherwise
    static boolean isNumPrime(int num) {
        boolean isPrime = true;
        
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}