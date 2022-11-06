import java.sql.*;

import javax.management.RuntimeErrorException;

public class JavaConectionMySql {
    protected Connection conexaoMySQL = null;
    
    protected String localDB = "localhost";
    protected String link = "jdbc:mysql://"+localDB+":3306/cadastro";

    protected String usuario = "root";
    protected String senha = "It@l0_43690";

    protected Connection conect(){
        try {
            conexaoMySQL = DriverManager.getConnection(link , usuario , senha);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException Error) {
            throw new RuntimeException("Ocorreu um problema SQL. " , Error);
        }

        return conexaoMySQL;
    }

    protected void insertData(String nome, String sobreNome, int idade) throws Exception{
        try {
            PreparedStatement insert = conexaoMySQL.prepareStatement("INSERT INTO persons (FirstName , LastName , Age) VALUES ('" + nome + "' , '" + sobreNome + "' , " + idade + " )");
            insert.executeUpdate();
            System.out.println(insert);
        } catch (Exception Error) {
            System.out.println("Erro ao realizar Query INSERT. ERRO: " + Error);
        }
    }

    protected void closeConection(){
        try {
            if(conexaoMySQL != null){
                conexaoMySQL.close();
                System.out.println("Conexão encerrada!");
            }
        } catch (SQLException Error) {
            throw new RuntimeException("Ocorreu um problema ao encerrar a conexão com o banco. " , Error);
        }
    }

    public PreparedStatement preparedStatement(String string) {
        return null;
    }
}
