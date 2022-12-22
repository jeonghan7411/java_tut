package tut_14_project.repository;

import tut_14_project.db.MysqlDBConnection;
import tut_14_project.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDaoImpl implements StudentDao {
    Connection conn = null;
    PreparedStatement pstmt = null; //? 매칭

    @Override
    public boolean addStudent(Student std) {
        boolean flag = false;
        try{
            conn = MysqlDBConnection.createDBConnection(); //연결 객체 가져오기
            String sql = "INSERT INTO stds VALUES(NULL, ?, ?, ?, ?);";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, std.getStdName());
            pstmt.setString(2, std.getStdGrade());
            pstmt.setString(3, std.getStdMajor());
            pstmt.setInt(4, std.getStdScore());
            pstmt.executeUpdate(); //excuteUpdate 값을 저장 또는 변경
            flag = true;

        }catch (Exception e) {
            e.printStackTrace();
        }

        return flag;
    }
}
