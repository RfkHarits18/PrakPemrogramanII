package dao;

import java.util.List;
import model.Member;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MemberDao {

    private final SqlSessionFactory sqlSessionFactory;

    public MemberDao(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public int insert(Member member) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.insert("mapper.MemberMapper.insert", member);
        }
    }

    public int update(Member member) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.update("mapper.MemberMapper.update", member);
        }
    }

    public int delete(int id) { // Mengubah parameter menjadi ID
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.delete("mapper.MemberMapper.delete", id);
        }
    }

    public List<Member> findAll() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.selectList("mapper.MemberMapper.findAll");
        }
    }
}
