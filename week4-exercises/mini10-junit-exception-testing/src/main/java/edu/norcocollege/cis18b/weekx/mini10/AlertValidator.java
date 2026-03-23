package edu.norcocollege.cis18b.weekx.mini10;

public class AlertValidator 
{

    public void validate(Alert alert) 
    {
        if (alert.getLevel() == null) 
        {
            throw new IllegalArgumentException("Level required");
        }
        if (alert.getMessage() == null || alert.getMessage().isBlank()) 
        {
            throw new IllegalArgumentException("Message required");
        }
    }
}