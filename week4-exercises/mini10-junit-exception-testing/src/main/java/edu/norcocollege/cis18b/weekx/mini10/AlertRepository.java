package edu.norcocollege.cis18b.weekx.mini10;

public interface AlertRepository 
{
    void store(Alert alert) throws AlertStorageException;
}