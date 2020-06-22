package controller;

import models.Customers;
import services.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServiceServlet",urlPatterns = "/list")
public class CustomerServiceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                break;
            case "edit":
                break;
            case "delete":
                break;
            default:
                listCustomers(request,response);
                break;
        }

    }

    private void listCustomers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerServiceImpl customerService=new CustomerServiceImpl();
        List<Customers>customersList=customerService.findAll();
        request.setAttribute("customers",customersList);

        RequestDispatcher dispatcher=request.getRequestDispatcher("views/list.jsp");
        dispatcher.forward(request,response);

    }
}
