public class type_promotion {
    public static void main(String args[]) {
        // ******this is first type promotion in java
        // char a = 'a';
        // char b = 'b';
        // char c = a-b;//-->type_conversion
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(a);
        // System.out.println(b-a);
        // short a= 5;
        // byte b =25;
        // char c = 'c';
        // byte bt = (byte) (a+b+c);
        // System.out.println(bt);

        // ******now this is second type promotion in java
        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double ans = a + b + c + d;
        // System.out.print(ans);

        byte b = 5;
        int a = b*5;  
        // byte a=(byte) (b*5);
        System.out.println(a);
    }

}
