import repository.PersonRepository;

/**
 * Created with IntelliJ IDEA.
 * User: adilfulara
 * Date: 2/1/14
 * Time: 2:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class App {

    public static void main(String[] args) {
        PersonRepository repository = new InMemoryRepository();
        System.out.println(repository.getAllPersons());
    }
}
