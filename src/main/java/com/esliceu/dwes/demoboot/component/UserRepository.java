package com.esliceu.dwes.demoboot.component;

import com.esliceu.dwes.demoboot.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository()
public class UserRepository implements GenericRepository<String,User>{

    private Map<String,User> users = new HashMap<>();


    @Override
    public void addItem(User item) {

        users.put(item.getUserId(),item);

    }

    @Override
    public User getItem(String id) {
        return users.get(id);
    }

    @Override
    public void remove(String id) {

        users.remove(id);

    }

    @Override
    public Set<User> getAll() {
        return new HashSet<>(users.values());
    }
}
