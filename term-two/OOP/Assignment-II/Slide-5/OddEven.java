class OddEven {
    public static void main(String args[]) {

        // using for-loop.
        for (int i = 0; i < 11; i++) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }

        // using while.
        int i = 1;
        int j = 10;
        while (i <= j) {
            if (i%2==1) {
                System.out.println(i);
            }
            i++;
        }
    }
}
