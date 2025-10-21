package com.armandodev.util.jpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class ConnectionFactory {
    
    private static EntityManagerFactory factory;
    private static EntityManager manager = null;
    private static EntityTransaction transaction;
    private static Connection conexao;
		
    public static EntityManager getConnection() {
          
        if (factory == null || !factory.isOpen()) {

            Map<String, Object> dadosConexao = new HashMap<>();
            dadosConexao.put("javax.persistence.jdbc.url", "jdbc:sqlserver://"
                    + "localhost"
                    + "\\sqlexpress:"
                    + "1433"
                    + ";databaseName=system"
                    + ";ApplicationName=SYSTEM");
            dadosConexao.put("javax.persistence.jdbc.user", "sa");
            dadosConexao.put("javax.persistence.jdbc.password", "javadeveloper");

            System.out.println(">>> ABRINDO CONEXAO FACTORY <<<");
            factory = Persistence.createEntityManagerFactory("hibernate", dadosConexao);
            
        }
        
        if (manager == null || !manager.isOpen()) {
            System.out.println(">>> ABRINDO CONEXAO MANAGER <<<");
            manager = factory.createEntityManager();
        }
        
        manager.clear();
        transaction = manager.getTransaction();
        
        return manager;
    }

    public static void closeManager() {
        if(manager != null){
            manager.close();  
            manager = null;
        }
    }

    public static void closeFactory() {
        if(factory != null){
            factory.close();
            factory = null;
            manager = null;
        }
    }

    public static void begin() {
        
        transaction = manager.getTransaction();
        if(!transaction.isActive()) {
            transaction.begin();
        }
        
    }

    public static void commit() throws PersistenceException {
        transaction = manager.getTransaction();
        if (transaction.isActive()) {
            transaction.commit();
        }
    }

    public static void rollback() {
        if(transaction.isActive()) {                        
            transaction.rollback();
        }
    }
    
    public static Connection getConnectionJDBC2() throws SQLException, ClassNotFoundException {
        
        String USUARIO = "sa";
        String SENHA = "javadeveloper";
        String URL = "";
        
        try {

            USUARIO = "sa";
            SENHA = "javadeveloper";
            URL = "jdbc:sqlserver://"
                    + "localhost"
                    + "\\sqlexpress:"
                    + "1433"
                    + ";databaseName="
                    + "system"
                    + ";ApplicationName=SYSTEM";

        } catch (Exception e) {
            e.printStackTrace();
        }

        String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Class.forName(DRIVER);
        conexao = DriverManager.getConnection(URL, USUARIO, SENHA);

        return conexao;

    }
    
    public static void fechaObjetosBanco(Connection con, ResultSet rs, PreparedStatement pstmt) throws SQLException {
        
        try {

            if (rs != null) {
                rs.close();
            }

            if (pstmt != null) {
                pstmt.close();
            }

            if (con != null) {
                con.close();
            }

        } catch (Exception e) {
            // logar excecao
        }
        
    }

    public static void fechaObjetosBanco(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
                	
}
