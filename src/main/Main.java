package main;

import java.sql.SQLException;
import java.util.List;
import model.Histogram;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import persistence.SqlitePeopleLoader;
import model.Person;
import persistence.PeopleLoader;
public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String fileName = "email.txt";
        PeopleLoader loader = new SqlitePeopleLoader();
        List<Person> personList = loader.load();
        
        Histogram<String> mailHistogram = MailHistogramBuilder.build(personList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram", mailHistogram);
        histogramDisplay.execute();
    }
    
}
