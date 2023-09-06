package top.zjp.javawebstudy;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/demo3")
public class DemoServlet3 extends HttpServlet {

    @Override
    public void init() {
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
