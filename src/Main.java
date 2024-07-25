//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void oddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit){
     /*   if(newBit == 0){
            return clearIthBit(n, i);
        }else {
            return setIthBit(n, i);
        }

      */
       n = clearIthBit(n, i);
       int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearLIBit(int n, int i){
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearBitinRange(int n, int i, int j){
        int a =((~0) << (j+1));
        int b = (1<<i) -1;
        int bitMask = a | b;
        return  n & bitMask;
    }

    public static boolean isPower(int n){
        return (n & (n-1)) == 0;
    }

    public static int countSetBit(int n){
        int count = 0;
        while (n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;

        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
        }

    public static void main(String[] args) {
        System.out.println(fastExpo(5, 3));
        System.out.println(countSetBit(15));
        System.out.println(isPower(8));
        System.out.println(clearBitinRange(10,2,4));
        System.out.println(clearLIBit(15, 2));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearIthBit(10, 1));
        System.out.println(setIthBit(10,2));
        System.out.println(getIthBit(10,2));
        oddEven(4);
        System.out.println(5&6);
        System.out.println(5|6);
        System.out.println(5^6);
        System.out.println(~5);
        System.out.println(~0);
        System.out.println(5<<2);
        System.out.println(5>>2);
    }
}