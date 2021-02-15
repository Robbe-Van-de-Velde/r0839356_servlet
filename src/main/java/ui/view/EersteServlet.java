package ui.view;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/DynamischePagina")
public class EersteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"nl\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Indexpagina</title>\n" +
                "</head>");
        out.println("<body>");
        out.println("<a id=\"home\" href=\"index.html\">Terug naar de startpagina</a>");
        out.println("<p id=\"dynamisch\">Willekeurig getal : " + Math.random() + "</p>");
        out.println("<p> De datum en tijd op dit moment is : " + LocalDateTime.now().format( DateTimeFormatter.ofPattern("YYYY" +
                "-MM-dd, HH:mm")));
        out.println("<body>");
        out.println("<html>");
    }
}
