package edu.norcocollege.cis18b.weekx.mini10;

public class AlertApp 
{
    public static void main(String[] args) 
    {
        Alert alert = new Alert("Test Alert", 5);
        AlertValidator validator = new AlertValidator();

        System.out.println("Alert valid? " + validator.isValid(alert));
        System.out.println("Validation message: " + validator.validateMessage(alert));
    }
}