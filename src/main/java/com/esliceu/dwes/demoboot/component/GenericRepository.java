package com.esliceu.dwes.demoboot.component;

import java.util.Set;

public interface GenericRepository<T,U> {

    void addItem(U item);

    U getItem(T id);

    void remove(T id);

    Set<U> getAll();



}
