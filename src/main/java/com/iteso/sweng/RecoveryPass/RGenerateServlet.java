package com.iteso.sweng.RecoveryPass;

/**
 * Created by Alejandro on 15/10/2014.
 */


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RGenerateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        RequestDispatcher rd=request.getRequestDispatcher("RecoveryPass/recovery.jsp");
        rd.forward(request,response);

    }
}
