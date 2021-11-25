package com.company.generics;

import java.util.Collection;

public interface Consumer <T, P>{
    void push(T c, P obj);

}
