public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean[] primes = new boolean[N + 1];
        //sets all elements with index > 1 to true
        for (int i = 2; i <= N; i++) {
            primes[i] = true;
        }
        //crosses out all multiples of 2
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if(primes[i]) {
                for(int j = i * i; j <= N; j += i) {
                    primes[j] = false;
                }
            }
        }
        int primeCounter = 0;
        for (int i = 2; i <= N; i++) {
            if (primes[i]) {
                primeCounter++;
            }
        }
        //percentage calculator
        int percent = (int) (100 * (primeCounter)/ N);

        //print leading line
        System.out.println("Prime numbers up to " + N + ":");

        int index = 0;
        int[] primeNumbers = new int[primeCounter];
        for (int i = 0; i <= N; i++) {
            if(primes[i]) {
                primeNumbers[index] = i;
                System.out.println(primeNumbers[index]);
                index++;
            }
        }

        System.out.println("There are " + primeCounter + " primes between 2 and " + N + " (" +
            percent + "% are primes)");
        
    }
}