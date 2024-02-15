// src/main/java/com/example/AddressBookServlet.java
package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AddressBookServlet", urlPatterns = {"/addresses"})
public class AddressBookServlet extends HttpServlet {

    private List<Address> addressList = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setAttribute("addresses", addressList);
        try {
			request.getRequestDispatcher("/WEB-INF/templates/address/list.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Address address = new Address();
        address.setName(request.getParameter("name"));
        address.setEmail(request.getParameter("email"));
        address.setPhone(request.getParameter("phone"));
        addressList.add(address);

        response.sendRedirect(request.getContextPath() + "/addresses");
    }
}
