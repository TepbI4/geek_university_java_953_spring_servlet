package ru.geekbrains.alekseiterentev.servlet;

import ru.geekbrains.alekseiterentev.model.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Bread", 40));
        products.add(new Product(2L, "Milk", 80));
        products.add(new Product(3L, "Cheese", 150));
        products.add(new Product(4L, "Sausage", 250));
        products.add(new Product(5L, "Cookies", 90));
        products.add(new Product(6L, "Tea", 200));
        products.add(new Product(7L, "Yogurt", 45));
        products.add(new Product(8L, "Salmon", 500));
        products.add(new Product(9L, "Sugar", 70));
        products.add(new Product(10L, "Salt", 99));

        resp.getWriter().printf("<html><body>");
        resp.getWriter().printf("<table border=\"1\">");
        resp.getWriter().printf("<tr>");
        resp.getWriter().printf("<td>");
        resp.getWriter().printf("Id");
        resp.getWriter().printf("</td>");
        resp.getWriter().printf("<td>");
        resp.getWriter().printf("Name");
        resp.getWriter().printf("</td>");
        resp.getWriter().printf("<td>");
        resp.getWriter().printf("Price");
        resp.getWriter().printf("</td>");
        resp.getWriter().printf("</tr>");

        for(Product product : products) {
            resp.getWriter().printf("<tr>");
            resp.getWriter().printf("<td>");
            resp.getWriter().printf(String.valueOf(product.getId()));
            resp.getWriter().printf("</td>");
            resp.getWriter().printf("<td>");
            resp.getWriter().printf(product.getName());
            resp.getWriter().printf("</td>");
            resp.getWriter().printf("<td>");
            resp.getWriter().printf(String.valueOf(product.getPrice()));
            resp.getWriter().printf("</td>");
            resp.getWriter().printf("</tr>");
        }

        resp.getWriter().printf("</table>");
        resp.getWriter().printf("</body></html>");
    }
}
