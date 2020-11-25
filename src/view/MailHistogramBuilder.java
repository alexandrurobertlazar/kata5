package view;

import java.util.List;
import model.Histogram;
import model.Person;

public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Person> personList) {
        Histogram<String> histogram = new Histogram<>();
        for (Person pers : personList) {
            histogram.increment(pers.getEmail().getDomain());
        }
        return histogram;
    }
    
}
