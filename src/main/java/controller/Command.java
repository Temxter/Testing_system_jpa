package controller;

import com.sun.net.httpserver.HttpServer;
import model.Dao.DaoUser;

import javax.ejb.EJB;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command {
    private CommandType commandType;
    private HttpServlet servlet;
    private HttpServletRequest request;
    private HttpServletResponse response;
    //private int priority;


    public Command(CommandType commandType, HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) {
        this.commandType = commandType;
        this.servlet = servlet;
        this.request = request;
        this.response = response;
    }

    public void execute(){
        switch (commandType){
            case Login: login(); break;
            case Student: student(); break;
        }
    }

    private void login(){
        DaoUser daoUser = new DaoUser();

    }
}
