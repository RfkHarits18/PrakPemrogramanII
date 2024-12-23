package mapper;

import java.util.List;
import models.YourTable;

public interface YourTableMapper {
    List<YourTable> getAll();
    void insert(YourTable yourTable);
    void update(YourTable yourTable);
    void delete(int id);
    YourTable getById(int id);
}

