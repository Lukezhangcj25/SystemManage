package com.clz.demo.web.servlet;

import com.clz.demo.domain.ResidentAccount;
import com.clz.demo.service.ResidentAccountService;
import com.clz.demo.service.impl.ResidentAccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Luke 2020/3/16 10:30
 */
@WebServlet("/residentListServlet")
public class ResidentListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 调用Service完成查询
        ResidentAccountService service = new ResidentAccountServiceImpl();
        List<ResidentAccount> residentAccounts = service.findAll();
        // 2. 将list存入request域
        request.setAttribute("residentAccounts",residentAccounts);
        // 3.转发到list.jsp
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
