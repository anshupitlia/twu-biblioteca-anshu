package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class CheckoutBookMenuItemTest {

    @Test
    public void shouldCheckoutABookAndDisplaySuccessfulCheckoutMessageIfSuccessfullyCheckedOut() {
        Library library = mock(Library.class);
        UserInterface userInterface = mock(UserInterface.class);
        Messages messages = mock(Messages.class);
        CheckoutBookMenuItem checkoutBook = new CheckoutBookMenuItem("Checkout A Book",library, userInterface, messages);

        when(messages.getUXMessage("enter_book_name")).thenReturn("Enter the Book Name");
        when(userInterface.getAStringFromUser()).thenReturn("Anna Karenina");
        when(library.checkOutBook("Anna Karenina")).thenReturn(true);
        when(messages.getUXMessage("successful_checkout")).thenReturn("Thank you! Enjoy the book");
        checkoutBook.execute();

        verify(userInterface, times(1)).print("Thank you! Enjoy the book");
    }

    @Test
    public void shouldTryToCheckOutABookAndDisplayUnSuccessfulCheckoutMessageIfNotFound() {
        Library library = mock(Library.class);
        UserInterface userInterface = mock(UserInterface.class);
        Messages messages = mock(Messages.class);
        CheckoutBookMenuItem checkoutBook = new CheckoutBookMenuItem("Checkout A Book",library, userInterface, messages);

        when(messages.getUXMessage("enter_book_name")).thenReturn("Enter the Book Name");
        when(userInterface.getAStringFromUser()).thenReturn("Anna Kerenina");
        when(library.checkOutBook("Anna Kerenina")).thenReturn(false);
        when(messages.getUXMessage("unsuccessful_checkout")).thenReturn("That book is not available. Please select a different book, or fix the spelling error");
        checkoutBook.execute();

        verify(userInterface, times(1)).print("That book is not available. Please select a different book, or fix the spelling error");
    }
}
