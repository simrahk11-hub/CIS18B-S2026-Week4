package edu.norcocollege.cis18b.weekx.mini10;

import java.util.ArrayList;
import java.util.List;

public class InMemoryAlertRepository implements AlertRepository 
{
    private List<Alert> alerts = new ArrayList<>();
    public void store(Alert alert) { alerts.add(alert); }
    public int countAlerts() { return alerts.size(); }
}