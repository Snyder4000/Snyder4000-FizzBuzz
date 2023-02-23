
public class Lab {
    /**
     * Return "Fizz" if a number n is divisible by 3, "Buzz" if divisible by 5, and "FizzBuzz" if divisible by both.
     *
     * This is coding problem that will make use of the modulus (%) operator, which can help us calculate if a number
     * is perfectly divisible by another number.
     * The modulus operator returns the remainder after a division (eg 8%3=2).
     *
     * If you try to copy answers from the internet, you will probably get this challenge wrong. The premise is
     * slightly simpler than the classic fizzbuzz problem.
     *
     * @param n the number that will determine the fizzbuzz result.
     * @return if a number is divisible by 3, return 'Fizz'. if a number is divisible by 5, return 'Buzz'. If
     * divisible by both, return 'FizzBuzz'. If none of these are true, return a blank string "".
     */
    public String FizzBuzzGen(int n){
        int exp;
        if(n%3==0 && n%5==0){
            exp = 1;
        }
        else if(n%3==0){
            exp = 2;
        }
        else if(n%5==0){
            exp = 3;
        }
        else{
            exp = 0;
        }
        switch(exp) {
            case 1:
                return "FizzBuzz";
                //break;
            case 2:
                return "Fizz";
                //break;
            case 3:
                return "Buzz";
                //break;
            default:
                return "";
        }
        
    }
}
