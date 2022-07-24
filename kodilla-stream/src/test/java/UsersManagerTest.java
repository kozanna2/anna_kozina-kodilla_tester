import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {
    @Test
    public void ifReturnChemistsName1() {
        //given
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        //when
        List<String> chemistGroupUsernames = UsersManager.filterChemistGroupUsernames();
        //then
        assertEquals(2, chemistGroupUsernames.size());
    }

    @Test
    public void ifReturnChemistsName2() {
        //given
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        //when
        List<String> chemistGroupUsernames = UsersManager.filterChemistGroupUsernames();
        //then
        assertEquals(chemistGroupUsernames, UsersManager.filterChemistGroupUsernames());
    }

    @Test
    public void ifReturnUsersOlderThan30_1() {
        //given
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        //when
        List<String> usersOlderThan30 = UsersManager.filterUsersOlderThen30();
        //then
        assertEquals(5, usersOlderThan30.size());
    }

    @Test
    public void ifReturnUsersOlderThan30_2() {
        //given
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        //when
        List<String> usersOlderThan30 = UsersManager.filterUsersOlderThen30();
        //then
        assertEquals(usersOlderThan30, UsersManager.filterUsersOlderThen30());
    }

    @Test
    public void ifReturnNamesStartWithG1() {
        //given
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        //when
        List<String> usersWithNameStartsWithG = UsersManager.filterUsersWhosNameStartsWithG();
        //then
        assertEquals(2, usersWithNameStartsWithG.size());
    }
    @Test
    public void ifReturnNamesStartWithG2() {
        //given
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        //when
        List<String> usersWithNameStartsWithG = UsersManager.filterUsersWhosNameStartsWithG();
        //then
        assertEquals(usersWithNameStartsWithG, UsersManager.filterUsersWhosNameStartsWithG());
    }

}
