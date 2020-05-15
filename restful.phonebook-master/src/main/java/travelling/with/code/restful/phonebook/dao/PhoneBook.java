package travelling.with.code.restful.phonebook.dao;

import java.util.Collection;
import java.util.Optional;

/**
 * An interface that should be implemented to interact with the data layer that contains the contacts.
 *
 *
 */
public interface PhoneBook {

    
    public Collection<IndexedContact> findContacts(Optional<String> name, Optional<String> surname, Optional<String> phone);

   
    public Optional<IndexedContact> findContact(Long id);

   
    public IndexedContact addContact(Contact contact);

  
    public IndexedContact addContact(IndexedContact contact);

 
    public void deleteContact(IndexedContact contact);

    
    public void deleteContact(Long id);

}
