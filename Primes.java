public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean[] primes = new boolean[N + 1];
        //sets all elements with index > 1 to true
        for (int i = 2; i <= N; i++) {
            primes[i] = true;
        }
        //crosses out all multiples of 2
        int counter = 0;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if(primes[i]) {
                for(int j = i * i; j <= N; j += i) {
                    primes[j] = false;
                    counter++;
                }
            }
        }

        int percent = (int) (100 * (N - counter + 2)/ N);

        int index = 0;
        int[] primeNumbers = new int[N - counter];
        for (int i = 0; i <= N; i++) {
            if(primes[i]) {
                primeNumbers[index] = i;
                System.out.println(primeNumbers[index]);
            }
        }

        System.out.println("There are " + (N - counter + 2) + " primes between 2 and " + N + ". (" +
            percent + "% are primes)");
        








    }
}