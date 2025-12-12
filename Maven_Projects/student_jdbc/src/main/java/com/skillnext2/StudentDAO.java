package com.skillnext2_db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private Connection getConnection() throws Exception {
    String url = "jdbc:mysql://localhost:3306/skillnext2_db?useSSL=false&allowPublicKeyRetrieval=true";
    String user = "root";
    String password = "venny12";  // use the same password you typed in terminal
    Class.forName("com.mysql.cj.jdbc.Driver");
    return DriverManager.getConnection(url, user, password);
}


    // Insert Student
    public boolean addStudent(Student s) {
        String sql = "INSERT INTO student(name, email, branch) VALUES (?, ?, ?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getBranch());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Get All Students
    public List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM student";

        try (Connection con = getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("branch")
                );
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Update Branch
    public boolean updateBranch(int id, String branch) {
        String sql = "UPDATE student SET branch=? WHERE id=?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, branch);
            ps.setInt(2, id);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Delete Student
    public boolean deleteStudent(int id) {
        String sql = "DELETE FROM student WHERE id=?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
