package com.sawan.journalApp.service;

import com.sawan.journalApp.entity.User;
import com.sawan.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {
    @Autowired
    private UserRepository userRepository;

    @Disabled
    @Test
    public void testFindByUserName() {

//        assertEquals(4, 2 + 2);
//        assertNotNull(userRepository.findByUserName("sawan"));
//        assertTrue(5>3);
        User user = userRepository.findByUserName("sawan");
        assertTrue(!user.getJournalEntries().isEmpty());

    }

    @ParameterizedTest
//    @ValueSource
    @CsvSource({
            "1,1,2",
            "2,10,12",
            "3,3,6"
    })
    public void test(int a, int b, int expected) {
        assertEquals(expected, a + b);
    }
}
