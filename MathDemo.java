public class MathDemo {

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    public static float mean(int[] args) {
        return (float) sum(args) / args.length;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8};

        System.out.println(min(3, 7));
        System.out.println(max(3, 7));
        System.out.println(sum(numbers));
        System.out.println(mean(numbers));
        System.out.println(factorial(5));
    }
}