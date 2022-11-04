package RecursionPractice.CodingBatHomework;

public class CodingBatHomework {
    public static void main(String[] args) {
        System.out.println(displayString("#", 3));
        System.out.println(getMultiChar('y',4));
        System.out.println(getPowerOfTen(7));
        System.out.println(factorial(6));
        System.out.println(numberOfGloves(6));
        System.out.println(getNumberOfZerosRecursion(1203040405));

    }

    public static String displayString(String str, int n){
        if(n == 0){
            return "";
        }else{
            return str + displayString(str, n - 1);
        }
    }

    public static String getMultiChar(char ch, int n){
        if(n < 0){
            return "";
        }else{
            return ch + getMultiChar(ch, n - 1);
        }
    }

    public static long getPowerOfTen(int n){
        if(n == 0){
            return 1;
        }else{
            return 10 * getPowerOfTen(n - 1);
        }
    }

    public static int factorial(int n) {
        if(n == 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    public static int numberOfGloves(int peopleOfPlanetU101InARoom){
        if(peopleOfPlanetU101InARoom == 0){
            return 0;
        }else{
            return 3 + numberOfGloves(peopleOfPlanetU101InARoom - 1);
        }
    }

    public static int getNumberOfZerosRecursion(int n){
        if(n == 0){
            return 1;
        }else if(n < 3){
            return 0;
        }else if(n % 10 == 0){
            return 1 + getNumberOfZerosRecursion(n/10);
        }
        return getNumberOfZerosRecursion(n/10);
    }

    public static int numberOfGlovesw(int peopleOfPlanetU101InARoom){
        int timer = 3;
        while(true){
            return peopleOfPlanetU101InARoom * 3;
        }
    }


}
