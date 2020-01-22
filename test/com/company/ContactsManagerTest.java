package com.company;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

    public class ContactsManagerTest {
        ContactsManager SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new ContactsManager();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addContact() {
        Contact friendJames = new Contact();
        friendJames.name = "James";
        friendJames.phoneNumber = "0012223333";
        SUT.addContact(friendJames);
        int friends = SUT.getFriendsCount();
        assertEquals(friends, 1);

    }

    @Test
    public void checkName() {
        Contact friend = new Contact();
        friend.name = "Henk";
        String henk = friend.getName();
        assertEquals(henk, "Henk");
    }

    @Test
    public void checkPhone() {
        Contact friend = new Contact();
        friend.phoneNumber = "0612345678";
        String phoneNumber = friend.getPhoneNumber();
        assertEquals(phoneNumber, "0612345678");
    }

    @Test
    public void searchContact() {
    }
}
