public class Main {
    public static void main(String[] args) {
Nwd(201202211, 145628);
    }
    public static void Nwd(int a, int b){
        int e = b;
        do {
            System.out.printf("%-15s", a);
            System.out.printf("%-15s", b);
            System.out.printf("%-15s", a / b);
            System.out.println();
            b = a % b;
            a = e;
            e = b;

        }
        while (b > 0);
    }
}

