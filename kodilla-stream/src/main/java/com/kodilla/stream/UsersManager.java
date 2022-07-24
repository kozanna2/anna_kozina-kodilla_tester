package com.kodilla.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        System.out.println("---------------------");
        List<String> olderthan30 = filterUsersOlderThen30();
        System.out.println(olderthan30);
        System.out.println("--------------");
        List<String> nameStartWithG = filterUsersWhosNameStartsWithG();
        System.out.println(filterUsersWhosNameStartsWithG());

    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static List<String> filterUsersOlderThen30() {
        List<String> usernames2 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 30)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames2;
    }

    public static List<String> filterUsersWhosNameStartsWithG() {
        List<String> usernames3 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getUsername().startsWith("G"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames3;

    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
