package top.zjp.javawebstudy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/demo2")
public class DemoServlet2 extends HttpServlet {

    @Override
    public void init() {
        System.out.println("Demo init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        返回一个网页
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.print("<h2>123</h2>");
        out.flush();
        out.close();
    }

    private String getCode() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int r = random.nextInt(10);
            sb.append(r);
        }
        return sb.toString();
    }

    @Override
    public void destroy() {
        super.destroy();
    }


}
