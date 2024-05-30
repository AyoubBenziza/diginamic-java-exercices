package fr.diginamic.props.dao.jdbc;

import fr.diginamic.props.dao.GenericDao;
import fr.diginamic.props.entities.Fournisseur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FournisseurDaoJdbc implements GenericDao<Fournisseur> {

    @Override
    public void insert(Connection connection, Fournisseur fournisseur) {
        try {
            String sql = "INSERT INTO FOURNISSEUR (NOM) VALUES (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set the value for the placeholder
            preparedStatement.setString(1, fournisseur.getNom());

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Rows affected: " + rowsAffected);

            preparedStatement.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void update(Connection connection, String ancienNom, String nouveauNom) {
        try {
            String sql = "UPDATE FOURNISSEUR SET NOM = ? WHERE NOM = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set the values for the placeholders
            preparedStatement.setString(1, nouveauNom);
            preparedStatement.setString(2, ancienNom);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Rows affected: " + rowsAffected);

            preparedStatement.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void delete(Connection connection, Fournisseur fournisseur) {
        try {
            String sql = "DELETE FROM FOURNISSEUR WHERE NOM = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set the value for the placeholder
            preparedStatement.setString(1, fournisseur.getNom());

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Rows affected: " + rowsAffected);

            preparedStatement.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    @Override
    public List<Fournisseur> extraire(Connection connection) {
        List<Fournisseur> fournisseurs = new ArrayList<>();

        try {
            String sql = "SELECT * FROM FOURNISSEUR";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Fournisseur fournisseur = new Fournisseur(resultSet.getInt("ID"), resultSet.getString("NOM"));
                fournisseurs.add(fournisseur);
            }

            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return fournisseurs;
    }

    @Override
    public Fournisseur extraireParNom(Connection connection, String nom) {
        Fournisseur fournisseur = null;

        try {
            String sql = "SELECT * FROM FOURNISSEUR WHERE NOM = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set the value for the placeholder
            preparedStatement.setString(1, nom);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                fournisseur = new Fournisseur(resultSet.getInt("ID"), resultSet.getString("NOM"));
            }

            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return fournisseur;
    }
}
