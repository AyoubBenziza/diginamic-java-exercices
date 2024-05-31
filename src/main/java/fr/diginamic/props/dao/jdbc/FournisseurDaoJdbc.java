package fr.diginamic.props.dao.jdbc;

import fr.diginamic.props.dao.GenericDao;
import fr.diginamic.props.entities.Fournisseur;
import fr.diginamic.props.services.DatabaseService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FournisseurDaoJdbc implements GenericDao<Fournisseur> {
    private static final ResourceBundle config = ResourceBundle.getBundle("application");

    private Connection connection;

    public FournisseurDaoJdbc() {
        try {
            Class.forName(config.getString("db.driver"));
            connection = DatabaseService.getConnectionPool().getConnection();
            System.out.println("Connexion à la base de données établie !");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    @Override
    public void insert(Fournisseur fournisseur) {
        try {
            String sql = "INSERT INTO FOURNISSEUR (NOM) VALUES (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set the value for the placeholder
            preparedStatement.setString(1, fournisseur.nom());

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Rows affected: " + rowsAffected);

            preparedStatement.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void update(Fournisseur fournisseur, String ancienNom) {
        try {
            String sql = "UPDATE FOURNISSEUR SET NOM = ? WHERE NOM = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set the values for the placeholders
            preparedStatement.setString(1, fournisseur.nom());
            preparedStatement.setString(2, ancienNom);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Rows affected: " + rowsAffected);

            preparedStatement.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void delete(Fournisseur fournisseur) {
        try {
            String sql = "DELETE FROM FOURNISSEUR WHERE NOM = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set the value for the placeholder
            preparedStatement.setString(1, fournisseur.nom());

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Rows affected: " + rowsAffected);

            preparedStatement.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    @Override
    public List<Fournisseur> extraire() {
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
    public Fournisseur extraireParNom(String nom) {
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
