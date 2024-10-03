public class EvenNumDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int result = findNumbers(arr);
        System.out.println(result);
    }

    static int findNumbers(int[] nums){
        int c = 0;
        for(int num : nums){
            if(isEven(num)){
                c++;
            }
        }
        return c;
    }

    static boolean isEven(int num){
        int numDigits = countDigit(num);
        if(numDigits%2==0){
            return true;
        }
        else{
            return false;
        }

        //return numDigits%2==0;
    }

    static int countDigit(int num){
        // if(num<0){
        //     num = num * -1;
        // }
        // if(num==0){
        //     return 1;
        // }

        int c = 0;
        while(num>0){
            c++;
            num = num/10;
        }
        return c;
    }


    // Optimization Code
    // static int countDigit2(int num){
    //     if(num<0){
    //         num = num * -1;
    //     }
    //     return (int)(Math.log10(num)) + 1;
    // }
}
