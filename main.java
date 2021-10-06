package Task2;

import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        repeat("Хай",2);
        System.out.println("Task 2");
        int [] numbers= new int[] {2,3,4,5};
        System.out.println(differentMaxMin(numbers));
        System.out.println("Task 3");
        System.out.println(isAvgWhole(numbers));
        int[] number = new int[]{1, 2, 3};
        number=(cumulativeSum(number));
        System.out.println("Task 4");
        for (int i=0; i<number.length; i++)
            System.out.println(number[i]);
        System.out.println("Task 5");
        System.out.println(getDecimaPlaces("10.20000"));
        System.out.println("Task 6");
        System.out.println(Fibonacci(12));
        System.out.println("Task 7");
        System.out.println(isValid("55555"));
        System.out.println("Task 8");
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println("Task 9");
        System.out.println(isPrefix("automation","-auto"));
        System.out.println(isSuffix("arachnophobia","phobia-"));
        System.out.println("Task 10");
        System.out.println(boxSeq(4));
    }

    public static void repeat(String s, int n) {
        char[] myCharArray = s.toCharArray();
        for (int i = 0; i < myCharArray.length; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(myCharArray[i]);
        }
        System.out.println();
    }
    public static int differentMaxMin(int[] numbers){
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
            if (max < number) {
                max = number;
            }
        }
        return max-min;
}
    public static boolean isAvgWhole(int[] numbers){
        int Avg=0;
        for(int i=0;i<numbers.length; i++){
            Avg+=numbers[i];
        }
        return Avg % numbers.length == 0;
    }
    public static int[] cumulativeSum(int[] numbers){
        int sum = 0;
        for (int i=0;i<numbers.length;i++){
            sum += numbers[i];
            numbers[i]=sum;
        }
        return numbers;
    }
    public static int getDecimaPlaces(String s){
        char[] ch=s.substring(s.indexOf(".")).toCharArray();
        return ch.length-1;
    }
    public static int Fibonacci(int n){
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int [] fib=new int[n];
        fib[0]=1;
        fib[1]=2;
        for (int i=2;i<n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n-1];
    }
    public static boolean isValid(String s){
        return (s.length() == 5) && s.matches("[\\d]+");
    }
    public static boolean isStrangePair(String s1,String s2){
        return s1.toLowerCase().charAt(0) == s2.toLowerCase().charAt(s2.length()-1) && s2.toLowerCase().charAt(0) == s1.toLowerCase().charAt(s1.length()-1);
    }
    public static boolean isPrefix(String word,String prefix){
        return Stream.of(prefix.replace("-","")).anyMatch(word ::startsWith);
    }
    public static boolean isSuffix(String word,String suffix){
        return Stream.of(suffix.replace("-","")).anyMatch(word ::endsWith);
    }
    public static int boxSeq(int step){
        int Fields=0;
        for(int i=1; i<=step;i++){
            if (i %2 !=0)
                Fields+=3;
            else
                Fields-=1;
        }
        return Fields;
    }
}

