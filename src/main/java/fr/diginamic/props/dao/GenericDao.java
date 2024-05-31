package fr.diginamic.props.dao;

import java.sql.Connection;
import java.util.List;

public interface GenericDao<T> {

    Connection getConnection();

    void insert(T object);

    void update(T object, String ancienNom);

    void delete(T object);

    List<T> extraire();

    T extraireParNom(String nom);
}
