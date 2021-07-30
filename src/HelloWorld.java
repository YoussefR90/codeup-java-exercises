
public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello World!");
        System.out.println(" It's a crazy World!");

        byte myFavoriteNumber = 11;
        System.out.println(myFavoriteNumber);

        String myString = "I am a string!";
        System.out.println(myString);

        char myChar =  'y';
        System.out.println(myChar);

        long myNumber = 21;
        System.out.println(myNumber);

        myNumber = 121;
        System.out.println(myNumber);

        myNumber = 147;
        System.out.println(myNumber);

        long three = 8000;
        short three2 = (short) three;
        System.out.println(three2);

        int x = 4;
        x += 5;
        System.out.println(x);

        int n = 4;
        int y = 6;
        y *= n;
        System.out.println(y);

        int w = 10;
        int z = 2;
        w /= z;
        z -= w;
        System.out.println(z);

        byte num = 127;
        num += num;
        num *= 3;
        System.out.println(num);

        System.out.println();

        int[][] primes = new int[3][3];
        primes[2][2] = 1;

        System.out.println(primes[1][2]);
    }}