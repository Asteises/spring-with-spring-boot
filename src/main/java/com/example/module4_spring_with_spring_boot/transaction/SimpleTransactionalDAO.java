package com.example.module4_spring_with_spring_boot.transaction;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaTransactionManager;

import javax.persistence.EntityManagerFactory;
import java.sql.Connection;
import java.sql.SQLException;

public class SimpleTransactionalDAO {

//    public void doInTransaction(){
//
//        Connection connection = dataSource.getConnection();
//
//        connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
//
//        try (connection) {
//            connection.setAutoCommit(false);
//
//            // выполнение SQL-запросов для перевода средств
//            // со счёта Софии на счёт Тимофея
//
//            connection.commit();
//        } catch (SQLException e) {
//            connection.rollback();
//        }
//    }
}
