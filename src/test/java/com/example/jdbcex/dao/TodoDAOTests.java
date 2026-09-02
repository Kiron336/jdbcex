package com.example.jdbcex.dao;

import lombok.Cleanup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.jdbcex.dao.ConnectionUtil;
import com.example.jdbcex.dao.TodoDAO;
import com.example.jdbcex.domain.TodoVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.List;

public class TodoDAOTests {

    private TodoDAO todoDAO = new TodoDAO();

    public TodoDAOTests() {
    }

    @BeforeEach
    public void ready(){
    }

    @Test
    public void testTime() throws Exception{

        System.out.println(todoDAO.getTime() );

    }
}
