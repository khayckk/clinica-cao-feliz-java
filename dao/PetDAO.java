import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Pet;
import factory.ConnectionFactory;

public class PetDAO {

    // 1. CREATE (Inserir novo Pet no banco)
    public void cadastrar(Pet pet) {
        // O '?' funciona como um espaço reservado para evitar SQL Injection
        String sql = "INSERT INTO pets (nome, especie, idade) VALUES (?, ?, ?)";

        // Abre a conexão e prepara o comando (fecha tudo sozinho ao final do bloco)
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // TODO 1: Substitua os '?' pelos dados do objeto 'pet' usando stmt.setString() e stmt.setInt()
            // Dica: A contagem dos '?' começa sempre no número 1!
            stmt.setString(1, pet.getNome());
            // stmt.setString(2, ...);
            // stmt.setInt(3, ...);

            // executeUpdate() é usado para comandos que ALTERAM o banco (INSERT, UPDATE, DELETE)
            stmt.executeUpdate();
            System.out.println("Pet cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar pet: " + e.getMessage());
        }
    }

    // 2. READ (Listar todos os Pets do banco)
    public List<Pet> listarTodos() {
        String sql = "SELECT * FROM pets";
        List<Pet> listaPets = new ArrayList<>();

        // executeQuery() é usado APENAS para SELECT (ele retorna uma tabela de resultados)
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            // rs.next() pula para a próxima linha da tabela até acabar os registros
            while (rs.next()) {
                Pet pet = new Pet();
                
                // TODO 2: Preencha o objeto 'pet' pegando os dados das colunas do banco (rs.getInt, rs.getString)
                pet.setId(rs.getInt("id"));
                // pet.setNome(rs.getString("..."));
                // pet.setEspecie(...);
                // pet.setIdade(...);

                listaPets.add(pet);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar pets: " + e.getMessage());
        }

        return listaPets;
    }

    // 3. UPDATE (Atualizar dados de um Pet existente)
    public void atualizar(Pet pet) {
        // CUIDADO: Nunca esqueça o WHERE id = ? no UPDATE!
        String sql = "UPDATE pets SET nome = ?, especie = ?, idade = ? WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // TODO 3: Preencha os 4 parâmetros (os 3 primeiros são os novos dados, o 4º é o ID do WHERE)
            // stmt.setString(1, ...);
            // ...
            // stmt.setInt(4, pet.getId());

            stmt.executeUpdate();
            System.out.println("Pet atualizado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar pet: " + e.getMessage());
        }
    }

    // 4. DELETE (Remover um Pet pelo ID)
    public void excluir(int id) {
        String sql = "DELETE FROM pets WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // TODO 4: Passe o 'id' recebido no método para o único '?' da query
            // stmt.setInt(1, ...);

            stmt.executeUpdate();
            System.out.println("Pet excluído com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao excluir pet: " + e.getMessage());
        }
    }
}
