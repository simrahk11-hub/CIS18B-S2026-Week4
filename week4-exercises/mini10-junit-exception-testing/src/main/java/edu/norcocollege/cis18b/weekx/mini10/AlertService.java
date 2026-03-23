
package edu.norcocollege.cis18b.weekx.mini10;

public class AlertService 
{
    private AlertRepository repository;

    public AlertService(AlertRepository repo) { this.repository = repo; }

    public void processAlert(Alert alert) throws AlertStorageException 
    {
        repository.store(alert);
    }

    public AlertRepository getRepository() { return repository; }
}