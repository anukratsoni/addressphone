package travelling.with.code.restful.phonebook.dao;


public class IndexedContact extends Contact {

    private Long id;

    public IndexedContact(long id, String name, String surname, String phone) {
        super(name, surname, phone);
        this.id = id;
    }

    public IndexedContact(long id, Contact contact) {
        super(contact);
        this.id = id;
    }

    public IndexedContact() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
