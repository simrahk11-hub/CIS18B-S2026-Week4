package edu.norcocollege.cis18b.weekx.mini10;

public class AlwaysFailRepository implements AlertRepository 
{
    public void store(Alert alert) throws AlertStorageException 
    {
        throw new AlertStorageException("Failing on purpose");
    }
}