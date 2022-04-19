package testDb;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;


@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
    private static final long serialVersionUID=1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       String user = "root";
       String pass = "Chandu@2601";

       String url = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimeZone=UTC";

       String driver = "com.mysql.cj.jdbc.Driver";
        Connection connection;

        try{
           PrintWriter out = response.getWriter();
           Class.forName(driver);
           connection=DriverManager.getConnection(url,user,pass);
           out.println("connecting to db : "+url);



           out.println("Success:!!");

            connection.close();
       }
       catch (Exception exception){
           exception.printStackTrace();
       }
       finally {
            System.out.println("Successfully closed");
       }
    }
}
