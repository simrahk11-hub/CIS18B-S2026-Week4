package edu.norcocollege.cis18b.weekx.mini10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlertValidatorTest 
{

    private final AlertValidator validator = new AlertValidator();

    @Test
    public void shouldRejectNullLevel() 
    {
        Alert alert = new Alert(null, "This is a message");

        assertThrows(IllegalArgumentException.class, () -> {
            validator.validate(alert);
        });
    }

    @Test
    public void shouldRejectBlankMessage() 
    {
        Alert alert = new Alert("HIGH", "   "); // blank message

        assertThrows(IllegalArgumentException.class, () -> {
            validator.validate(alert);
        });
    }

    @Test
    public void shouldAcceptValidAlert() 
    {
        Alert alert = new Alert("HIGH", "This is a valid message");

        assertDoesNotThrow(() -> {
            validator.validate(alert);
        });
    }
}