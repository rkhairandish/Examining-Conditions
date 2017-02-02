package examining.conditions;

public class ExaminingConditions {

    public static void main(String[] args) {

        int num1 = 1357;
        int num2 = 2468;
        
        String result;
        
        //Determine whether the first integer is Odd or Even
        result = (num1 % 2 != 0) ? "Odd" : "Even";
        System.out.println(num1 + " is " + result);
        
        //Determine whether the second integer is Odd or Even
        result = (num2 % 2 != 0) ? "Odd" : "Even";
        System.out.println(num2 + " is " + result);
        
    } 
}
