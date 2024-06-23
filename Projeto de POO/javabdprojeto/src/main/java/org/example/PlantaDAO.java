package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlantaDAO {

    public void criarPlanta(Planta planta) {
        String sql = "INSERT INTO Plantas (nome, tipo, precoVenda) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, planta.getNome());
            stmt.setString(2, planta.getTipo());
            stmt.setDouble(3, planta.getPrecoVenda());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Planta lerPlanta(int id) {
        String sql = "SELECT * FROM Plantas WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Planta(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("tipo"),
                        rs.getDouble("precoVenda")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void atualizarPlanta(Planta planta) {
        String sql = "UPDATE Plantas SET nome = ?, tipo = ?, precoVenda = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, planta.getNome());
            stmt.setString(2, planta.getTipo());
            stmt.setDouble(3, planta.getPrecoVenda());
            stmt.setInt(4, planta.getIdPlantas());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarPlanta(int id) {
        String sql = "DELETE FROM Plantas WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Planta> lerTodasPlantas() {
        List<Planta> plantas = new ArrayList<>();
        String sql = "SELECT * FROM Plantas";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                plantas.add(new Planta(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("tipo"),
                        rs.getDouble("precoVenda")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return plantas;
    }
}
