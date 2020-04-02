package controller;

import model.Dao.DaoStudent;
import model.Dao.DaoUser;
import model.HighLevel.Student;
import model.HighLevel.User;
import model.HighLevel.UserType;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/auth")
public class AuthorizationServerlet extends HttpServlet {

    @EJB
    private DaoUser daoUser;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String isLogin = req.getParameter("type"); // "login" or "register"
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        String destinationPage = null;

        if (isLogin.equals("login")) {
            User user = daoUser.authorizationUser(login, password);
            if (user == null) {
                String message = "Invalidate login/password!";
                req.setAttribute("message", message);
                return;
            }
            if (UserType.Student.equals(user.getUserType()))
                destinationPage = "student.jsp";
        }
        req.getRequestDispatcher(destinationPage);

    }
}
