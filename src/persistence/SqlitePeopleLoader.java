package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Person;

public class SqlitePeopleLoader implements PeopleLoader {

    public SqlitePeopleLoader() {
    }
    
    @Override
    public List<Person> load() throws SQLException, ClassNotFoundException {
        List<Person> list = new ArrayList<Person>();
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:data/people.db");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM people");
        while (resultSet.next()){
            String email = resultSet.getString("email");
            String name = resultSet.getString("first_name") + ", " + resultSet.getString("last_name");
            String address = resultSet.getString("address");
            list.add(new Person(name, address, email));
        }
        return list;
    }
}
