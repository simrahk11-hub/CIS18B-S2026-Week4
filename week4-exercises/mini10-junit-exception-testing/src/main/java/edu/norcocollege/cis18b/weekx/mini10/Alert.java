package edu.norcocollege.cis18b.weekx.mini10;

public class Alert 
{

    private final String level;
    private final String message;

    public Alert(String level, String message) 
    {
        this.level = level;
        this.message = message;
    }

    public Alert(int id, String message, AlertLevel level) 
    {
        this.level = level.name(); // convert enum to string
        this.message = message;
    }

    public String getLevel() { return level; }
    public String getMessage() { return message; }
}