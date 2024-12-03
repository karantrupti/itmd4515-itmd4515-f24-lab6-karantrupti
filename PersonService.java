import jakarta.ejb.Stateless;

@Stateless
public class PersonService extends AbstractService<Person> {
    public PersonService() {
        super(Person.class);
    }
}
