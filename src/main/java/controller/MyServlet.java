package controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Injectee;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    @Inject Injectee i;
    public MyServlet() {
        super();
    }
    protected void doGet(HttpServletRequest rq, HttpServletResponse rp)
                                 throws ServletException, IOException {
        System.out.println("In doGet()");
        System.out.println("Injectee says: "+i.sayHi());
    }
}