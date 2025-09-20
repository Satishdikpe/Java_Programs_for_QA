public class PrintfUsage {
    //Interview Question print the table of 9 using printf
    public static void main(String[] args) {
        int table = 9;
        for (int i = 1; i <= 10 ; i++) {
                //%d is used to format integers.
                //%n is used for a newline (platform-independent).
            System.out.printf("%d*i=%d%n",table,table*i);
        }

    }
}
