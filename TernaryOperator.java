/* 
Ternary operator
condition ? "executes this if 'True'" : "else this 'false'"
*/

public class TernaryOperator {
    public static void main(String[] args) {
        int streakDays = 5;
        String status = (streakDays >= 30) ? "consistent" : "Irregular";
        System.out.println(status);
    }
}
