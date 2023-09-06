package top.zjp.javawebstudy;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/demo3")
public class DemoServlet3 extends HttpServlet {

    @Override
    public void init(ServletConfig config) {
        System.out.println("Demo init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //返回一段json
        resp.setContentType("application/json;charset=utf-8");
        PrintWriter out = resp.getWriter();
        String jsonString = """
                "name":"zjp"
                "age":19
                """;
        out.print(jsonString);
        out.flush();
        out.close();
    }

    @Override
    public void destroy() {
        super.destroy();
    }


}
