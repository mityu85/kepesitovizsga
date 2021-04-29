package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JurassicPark {

    MariaDbDataSource dataSource;

    public JurassicPark(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select breed from dinosaur where expected < actual")
                ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("breed");
                names.add(name);
            }
            return names;
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect", e);
        }
    }
}
