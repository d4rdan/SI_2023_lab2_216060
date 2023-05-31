package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SILab2Test {

    //test1
    @Test
    void everyBranchTest1() {
        List<User> allUsers = new ArrayList<>();
        User user = null;
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user, allUsers));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    }

    //test2
    @Test
    void everyBranchTest2() {
        List<User> allUsers = new ArrayList<>();
        User user = new User (null, "D999 53", "dardan.selmani@gmail.com");
        User user1 = new User ("Dardannnn", "124561", "dardan.selmani@gmail.com");
        User user2 = new User ("Ronaldo", "11111", "dardan.selmani@gmail.com");
        User user3 = new User ("Messi13", "222222", "messi11@yahoo.com");

        allUsers.add(user1);
        allUsers.add(user2);
        allUsers.add(user3);
        assertFalse(SILab2.function(user, allUsers));
    }

    //test3
    @Test
    void everyBranchTest3() {
        List<User> allUsers = new ArrayList<>();
        User user = new User ("modric", "MOdric", "LukaMOdric");
        assertFalse (SILab2.function(user, allUsers));
    }

    //test4
    @Test
    void everyBranchTest4() {
        List<User> allUsers = new ArrayList<>();
        User user = new User ("Dardan", "dardan ssss", "dardan.selmani@gmail.com");
        assertFalse (SILab2.function(user, allUsers));
    }
    //test5
    @Test
    void everyBranchTest5() {
        List<User> allUsers = new ArrayList<>();
        User user = new User ("Dardan", "dardanssss", "dardan.selmani@gmail.com");
        assertFalse (SILab2.function(user, allUsers));
    }

}
