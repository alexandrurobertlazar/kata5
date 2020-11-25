/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.SQLException;
import java.util.List;
import model.Person;

/**
 *
 * @author Alexandru
 */
public interface PeopleLoader {
    public List<Person> load() throws SQLException, ClassNotFoundException;
}
