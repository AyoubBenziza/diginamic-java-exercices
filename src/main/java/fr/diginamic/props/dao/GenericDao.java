package fr.diginamic.props.dao;

import java.sql.Connection;
import java.util.List;

public interface GenericDao<T> {

    void insert(Connection connection, T object);

    void update(Connection connection, String ancienNom, String nouveauNom);

    void delete(Connection connection, T object);

    List<T> extraire(Connection connection);

    T extraireParNom(Connection connection, String nom);
}
