package edu.norcocollege.cis18b.weekx.mini10;

import java.util.List;

public class AlwaysFailRepository implements AlertRepository 
{

    @Override
    public void save(Alert alert)
    throws AlertStorageException 
    {

        throw new AlertStorageException(
        "Storage failed");

    }

    @Override
    public List<Alert> findAll() 
    {
        return List.of();
    }

}