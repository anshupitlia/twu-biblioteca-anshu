package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class GuestTest {

    @Test
    public void shouldGetMainMenu() {
        Session session = mock(Session.class);
        Library library = mock(Library.class);
        Messages messages = mock(Messages.class);
        Users users = mock(Users.class);
        UserInterface userInterface = mock(UserInterface.class);

        Guest guest = new Guest();

        assertEquals(MainMenu.class, guest.getMainMenu(session, library, messages, users, userInterface).getClass());
    }
}
