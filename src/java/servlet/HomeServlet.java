/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import data.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 715583
 */
public class HomeServlet extends HttpServlet {

   @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
//         request.setAttribute("display", "Logged out!");
//         getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
           HttpSession session = request.getSession();
           User user = (User)session.getAttribute("userlogin");
           String url = "/WEB-INF/home.jsp";
           if(user != null)
           {
               request.setAttribute("user", user);
               getServletContext().getRequestDispatcher(url).forward(request, response);
               return;
           }
           else
           {
               url= "/WEB-INF/login.jsp";
               
             //  request.setAttribute("rememberme", "checked");
              // getServletContext().getRequestDispatcher(url).forward(request, response);
              response.sendRedirect("login");
               return;
           }
           
     }
 
     @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
         doGet(request,response);
     }
}
