package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class MessageFactoryTest {
    private Messages messages;

    @Before
    public void setUp() {
        HashMap<String, String> setUpMessages = new HashMap<>();
        setUpMessages.put("welcome_message", "Welcome! Biblioteca at your service");
        setUpMessages.put("list_books", "List Books");
        setUpMessages.put("select_a_valid_option", "Select a valid option!");
        setUpMessages.put("quit_option", "Quit");
        setUpMessages.put("checkout_book", "Checkout A Book");
        setUpMessages.put("return_book", "Return A Book");
        setUpMessages.put("successful_checkout", "Thank you! Enjoy the book");
        setUpMessages.put("unsuccessful_checkout", "That book is not available. Please select a different book, or fix the spelling error");
        setUpMessages.put("enter_book_name", "Enter the book name");
        setUpMessages.put("successful_return", "Thank you for returning the book.");
        setUpMessages.put("unsuccessful_return", "That is not a valid book to return.");
        messages = new Messages(setUpMessages);
    }

    @Test
    public void shouldCreateMessagesAndHaveTheSameMessageForWelcome() {
        MessageFactory messageFactory = new MessageFactory();

        assertEquals(messageFactory.establishMessages().getUXMessage("welcome_message"), messages.getUXMessage("welcome_message"));
    }

    @Test
    public void shouldCreateMessagesAndHaveTheSameMessageForListingBooks() {
        MessageFactory messageFactory = new MessageFactory();

        assertEquals(messageFactory.establishMessages().getUXMessage("list_books"), messages.getUXMessage("list_books"));
    }

    @Test
    public void shouldCreateMessagesAndHaveTheSameMessageForAskingAUserToSelectAValidOption() {
        MessageFactory messageFactory = new MessageFactory();

        assertEquals(messageFactory.establishMessages().getUXMessage("select_a_valid_option"), messages.getUXMessage("select_a_valid_option"));
    }

    @Test
    public void shouldCreateMessagesAndHaveTheSameMessageForQuittingOption() {
        MessageFactory messageFactory = new MessageFactory();

        assertEquals(messageFactory.establishMessages().getUXMessage("quit_option"), messages.getUXMessage("quit_option"));
    }

    @Test
    public void shouldCreateMessagesAndHaveTheSameMessageForCheckoutABookOption() {
        MessageFactory messageFactory = new MessageFactory();

        assertEquals(messageFactory.establishMessages().getUXMessage("checkout_book"), messages.getUXMessage("checkout_book"));
    }

    @Test
    public void shouldCreateMessagesAndHaveTheSameMessageForReturningABookOption() {
        MessageFactory messageFactory = new MessageFactory();

        assertEquals(messageFactory.establishMessages().getUXMessage("return_book"), messages.getUXMessage("return_book"));
    }

    @Test
    public void shouldCreateMessagesAndHaveTheSameMessageForSuccessfulCheckout() {
        MessageFactory messageFactory = new MessageFactory();

        assertEquals(messageFactory.establishMessages().getUXMessage("successful_checkout"), messages.getUXMessage("successful_checkout"));
    }

    @Test
    public void shouldCreateMessagesAndHaveTheSameMessageForUnsuccessfulCheckout() {
        MessageFactory messageFactory = new MessageFactory();

        assertEquals(messageFactory.establishMessages().getUXMessage("unsuccessful_checkout"), messages.getUXMessage("unsuccessful_checkout"));
    }

    @Test
    public void shouldCreateMessagesAndHaveTheSameMessageForAskingTheUserToEnterTheBookName() {
        MessageFactory messageFactory = new MessageFactory();

        assertEquals(messageFactory.establishMessages().getUXMessage("enter_book_name"), messages.getUXMessage("enter_book_name"));
    }

    @Test
    public void shouldCreateMessagesAndHaveTheSameMessageForSuccessfulReturn() {
        MessageFactory messageFactory = new MessageFactory();

        assertEquals(messageFactory.establishMessages().getUXMessage("successful_return"), messages.getUXMessage("successful_return"));
    }

    @Test
    public void shouldCreateMessagesAndHaveTheSameMessageForUnsuccessfulReturn() {
        MessageFactory messageFactory = new MessageFactory();

        assertEquals(messageFactory.establishMessages().getUXMessage("unsuccessful_return"), messages.getUXMessage("unsuccessful_return"));
    }
}
