package edu.norcocollege.cis18b.weekx.mini10;

public class AlertApp 
{
    public static void main(String[] args) 
    {
        Alert alert = new Alert("HIGH", "Warning message");

        AlertValidator validator = new AlertValidator();

        try 
        {
            validator.validate(alert);
            System.out.println("Alert is valid");
        } 
        catch(Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}