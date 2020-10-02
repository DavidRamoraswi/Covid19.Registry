import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Registry {
//    private static Object CSVUtils;

    public static void main(String[] args) throws IOException {
        String csvFilePath = "C:\\Users\\Champion\\Desktop\\Person.csv";
        FileWriter writer = new FileWriter(csvFilePath);
        List<Person> persons = Arrays.asList(

                new Person("Ceasar", "Mashau",36.5,"Yes","No","Yes","No"),
                new Person ("David", "Ramoraswi",45.9,"No","Yes","No","Yes"),
                new Person ("Pertunia","Sebola",32.4,"No","Yes","No","Yes")
        );

        CSVUtils.writeLine(writer,Arrays.asList("Name","Surname","Temperature","Do You Have Hand Sanitizer And Face Masks On Hand?","Has Anyone In Your home Travelled Overseas?","have You Ever been In Contact With Any Person Who Has The Virus?","Do You have Symptoms"));

        for( Person person: persons){
            List<String> list = new ArrayList<>();
            list.add(person.getName());
            list.add(person.getSurname());
            list.add(String.valueOf(person.getTemperature()));
            list.add(person.getQ1());
            list.add(person.getQ2());
            list.add(person.getQ3());
            list.add(person.getQ4());

            CSVUtils.writeLine(writer,list);
        }
        writer.flush();
        writer.close();
    }
}
