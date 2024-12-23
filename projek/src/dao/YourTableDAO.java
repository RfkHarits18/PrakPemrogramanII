package dao;

import java.util.List;
import models.YourTable;
import org.apache.ibatis.session.SqlSession;
import utils.MyBatisConfig;

public class YourTableDAO {
    public List<YourTable> getAll() {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession()) {
            return session.getMapper(mapper.YourTableMapper.class).getAll();
        }
    }

    public void insert(YourTable yourTable) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession()) {
            session.getMapper(mapper.YourTableMapper.class).insert(yourTable);
            session.commit();
        }
    }

    public void update(YourTable yourTable) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession()) {
            session.getMapper(mapper.YourTableMapper.class).update(yourTable);
            session.commit();
        }
    }

    public void delete(int id) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession()) {
            session.getMapper(mapper.YourTableMapper.class).delete(id);
            session.commit();
        }
    }

    public YourTable getById(int id) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession()) {
            return session.getMapper(mapper.YourTableMapper.class).getById(id);
        }
    }
}


