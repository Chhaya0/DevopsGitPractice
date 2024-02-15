// src/test/java/com/example/AddressBookTest.java
package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressBookTest {

    @Test
    public void testAddressCreation() {
        Address address = new Address();
        address.setName("John Doe");
        address.setEmail("john@example.com");
        address.setPhone("123-456-7890");

        assertEquals("John Doe", address.getName());
        assertEquals("john@example.com", address.getEmail());
        assertEquals("123-456-7890", address.getPhone());
    }
}
