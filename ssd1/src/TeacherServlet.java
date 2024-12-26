import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TeacherServlet extends HttpServlet {
    public TeacherServlet() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        boolean sex = Boolean.parseBoolean(request.getParameter("sex"));
        String title = request.getParameter("title");
        String department = request.getParameter("department");
        boolean isPartyMember = Boolean.parseBoolean(request.getParameter("isPartyMember"));
        String[] courses = request.getParameterValues("courses");
        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setSex(sex);
        teacher.setTitle(title);
        teacher.setDepartment(department);
        teacher.setPartyMember(isPartyMember);
        teacher.setCourses(courses);

        System.out.println("保存注册老师信息至数据库...");

        request.setAttribute("teacher", teacher);
        request.setAttribute("name", name);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
