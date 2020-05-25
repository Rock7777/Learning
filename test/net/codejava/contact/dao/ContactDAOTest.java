package net.codejava.contact.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import net.codejava.contact.model.Contact;

public class ContactDAOTest {
    private DriverManagerDataSource dataSource;
    private ContactDAO dao;
    
    @Before
    public void setUpBefore(){
    	dataSource =  new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb?autoReconnect=true&useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("Mysql@123");
		
		dao = new ContactDAOImpl(dataSource);
    }
    
    
	@Test
	public void testSave() {
		
		
		Contact contact = new Contact("Rock","rf@apple.com","Chittor","2209797");
		int result = dao.save(contact);
		
		assertTrue("Worked",result > 0);
	}

	@Test
	public void testUpdate() {
		Contact contact = new Contact(3,"Rock","rf@applechange.com","Chittornew","2209567");
		int result = dao.update(contact);
		assertTrue("Worked",result > 0);
	}

	@Test
	public void testGet() {
		Integer id = 2;
		Contact contact=dao.get(id);
		
		assertNotNull(contact);
	}

	@Test
	public void testDelete() {
	   Integer id =1 ;
	   int  val=dao.delete(id);
		
		assertTrue(val > 0);
	}

	@Test
	public void testList() {
		List<Contact> listContacts = dao.list();
		for(Contact ca:listContacts)
			System.out.println(ca);
		
		assertTrue(!listContacts.isEmpty());
	}

}
