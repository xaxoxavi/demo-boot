package com.esliceu.dwes.demoboot.component;

import com.esliceu.dwes.demoboot.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository()
public class ListUserRepository implements GenericRepository<String,User> {

    private List<User> userList;

    @Override
    public void addItem(User item) {

        userList.add(item);

    }

    @Override
    public User getItem(String id) {
        return  userList.stream().filter(user ->  user
                .getUserId()
                .equals(id))
                .findFirst().get();
    }

    @Override
    public void remove(String id) {

        userList.removeIf(user -> user.getUserId().equals(id));
    }

    @Override
    public Set<User> getAll() {
        return new HashSet<>(userList);
    }
}
