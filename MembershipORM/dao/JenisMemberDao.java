package dao;

import java.util.List;
import model.JenisMember;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class JenisMemberDao {

    private final SqlSessionFactory sqlSessionFactory;

    public JenisMemberDao(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public int insert(JenisMember jenisMember) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.insert("mapper.JenisMemberMapper.insert", jenisMember);
        }
    }

    public int update(JenisMember jenisMember) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.update("mapper.JenisMemberMapper.update", jenisMember);
        }
    }

    public int delete(int id) { // Mengubah parameter menjadi ID
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.delete("mapper.JenisMemberMapper.delete", id);
        }
    }

    public List<JenisMember> findAll() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.selectList("mapper.JenisMemberMapper.findAll");
        }
    }
}
