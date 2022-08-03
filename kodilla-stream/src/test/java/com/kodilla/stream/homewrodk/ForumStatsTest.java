package com.kodilla.stream.homewrodk;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    @Test
    public void testAveragePostsOfUsersAge40OrOlder() {
        //given
        List<User> users = new ArrayList<>();
        users.add(new User("Eryk Adamski", 50, 12, "Chemists"));
        users.add(new User("Tetiana Wójcik", 40, 1324, "Sales"));
        users.add(new User("Gertruda Andrzejewska", 18, 764, "Manager"));
        users.add(new User("Sandra Jakubowska", 64, 0, "Board"));
        users.add(new User("Martin Bednarek", 44, 6, "Chemists"));
        users.add(new User("Bernard Kucharski", 27, 106, "Security"));
        ForumStats object = new ForumStats();
        //when
        double result = object.checkIfThereIsListForUsersAge400OrOlder(users);
        //then
        assertEquals(335.5, result);
    }

    @Test
    public void testAveragePostsOfUsersUnder400() {
        //given
        List<User> users2 = new ArrayList<>();
        users2.add(new User("Eryk Adamski", 50, 12, "Chemists"));
        users2.add(new User("Tetiana Wójcik", 40, 1324, "Sales"));
        users2.add(new User("Gertruda Andrzejewska", 18, 0, "Manager"));
        users2.add(new User("Sandra Jakubowska", 64, 765, "Board"));
        users2.add(new User("Martin Bednarek", 44, 6, "Chemists"));
        users2.add(new User("Bernard Kucharski", 27, 106, "Security"));
        //when
        ForumStats object = new ForumStats();
        double result = object.checkIfThereIsListForUsersAgeUnder400(users2);
        //then
        assertEquals(53, result);
    }
}
