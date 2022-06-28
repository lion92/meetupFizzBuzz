package fizzbuzz;

public class FizzBuzz {
    public String execute(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }

        if (i % 3 == 0) {
            return "Fizz";
        }
        if(i%3!=0 && i%5!=0){
            return ""+i;
        }


        return "Buzz";
    }
}
