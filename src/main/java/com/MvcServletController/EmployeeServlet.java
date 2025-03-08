package com.MvcServletController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MvcServletService.EmployeeService;

@WebServlet("/employees")
public class EmployeeServlet extends HttpServlet 
{

    private static final long serialVersionUID = 1L;

    private EmployeeService employeeService;

    public void init() 
    {
       employeeService = new EmployeeService();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	// response.getWriter().append("Served at : ").append(request.getContextPath());
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        processRequest(request, response);
    }
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.setAttribute("employee", employeeService.getEmployee());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/MvcFile.jsp");
        dispatcher.forward(request, response);
    }

}