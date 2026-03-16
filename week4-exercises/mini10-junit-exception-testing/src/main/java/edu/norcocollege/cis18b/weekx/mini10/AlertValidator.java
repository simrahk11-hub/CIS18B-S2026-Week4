package edu.norcocollege.cis18b.weekx.mini10;

public class AlertValidator 
{

    public boolean isValid(Alert alert) 
    {
        if (alert == null) return false;
        return alert.getSeverity() >= 0 && alert.getMessage() != null && !alert.getMessage().isEmpty();
    }

    public String validateMessage(Alert alert) 
    {
        if (alert.getMessage() == null || alert.getMessage().isEmpty()) 
        {
            return "Message cannot be empty";
        }
        return "Valid";
    }
}