package gr.aueb.cf.ch19Collections.genInterface;

import java.util.List;

public interface IGenericDAO <T>{
    boolean save(T t);
    T update(T oldT, T newT);
    T delete(T t);
    T get(Object id);
    List<T> getAll();

}
