package com.kodilla.stream.homewrodk;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static double checkIfThereIsListForUsersAge400OrOlder(List<User> userList) {
        if(userList==null){
           return averagePostsOfUsersAge40OrOlder(UsersRepository.getUsersList());
        }else{
           return averagePostsOfUsersAge40OrOlder(userList);
        }
    }
    private static double averagePostsOfUsersAge40OrOlder(List<User> userList) {
        double avgPosts40OrOlder = userList
                .stream()
                .filter(n -> n.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avgPosts40OrOlder;
    }
    public static double checkIfThereIsListForUsersAgeUnder400(List<User> userList) {
        if(userList==null){
            return averagePostsOfUsersUnder400(UsersRepository.getUsersList());
        }else{
            return averagePostsOfUsersUnder400(userList);
        }
    }
    public static double averagePostsOfUsersUnder400(List<User> userList) {
        double avgPostsUnder40 = userList
                .stream()
                .filter(n -> n.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avgPostsUnder40;
    }

}
