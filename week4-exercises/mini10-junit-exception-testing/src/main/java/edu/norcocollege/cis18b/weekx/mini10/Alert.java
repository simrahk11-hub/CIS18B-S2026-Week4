package edu.norcocollege.cis18b.weekx.mini10;

public class Alert 
{
    private String message;
    private int severity;

    public Alert(String message, int severity) {

        this.message = message;
        this.severity = severity;
    }

    public String getMessage() 
    {
        return message;
    }

    public int getSeverity() 
    {
        return severity;
    }
}