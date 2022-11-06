import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception{

        JavaConectionMySql conectionOne = new JavaConectionMySql();

        conectionOne.conect();

       conectionOne.insertData("Pedro" , "Paulo" , 54);

        conectionOne.closeConection();
    }   
    
    /*public static Connection getConection() throws Exception{
        try {

            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/cadastro";
            String user = "root";
            String password = "It@l0_43690";
            Class.forName(driver);

            Connection conection = DriverManager.getConnection(url, user, password);

            System.out.println("Conexão estabelecida com sucesso!");
            return conection;

        } catch (Exception Error) {
            System.out.println("Erro ao conectar com o banco. ERRO: " + Error);
        }

        return null;
    }*/
}
