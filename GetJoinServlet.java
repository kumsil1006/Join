

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetJoinServlet
 */
@WebServlet("/GetJoinServlet")
public class GetJoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetJoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String id = request.getParameter("id");
		//String password = request.getParameter("password");
		//String CheckPass = request.getParameter("CheckPass");
		String address = request.getParameter("address");
		String phoneNum = request.getParameter("phoneNum");
		String email = request.getParameter("email");
		String[] hobby = request.getParameterValues("hobby");
		response.setContentType("text/html;charset = utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>get Servlet</title>");
		out.println("	</head>");
		out.println("		<body>");
		out.println("			<h2>�ۼ��Ͻ� ������ �Ʒ��� �����ϴ�.</h2>");
		out.println("			�̸� : " + name + "<br/><hr/>");
		out.println("			���� : " + sex + "<br/><hr/>");
		out.println("			���̵� : " + id + "<br/><hr/>");
		out.println("			�ּ� : " + address + "<br/><hr/>");
		out.println("			��ȭ��ȣ : " + phoneNum + "<br/><hr/>");
		out.println("			�̸����ּ� : " + email + "<br/><hr/>");
		
		if(hobby == null){
			out.println("[������ ��̰� �����ϴ�.]");
			
		}else{
			out.println("<table border=\"1\">");
			
			for(int i = 0;i<hobby.length;i++){
				out.println("	<tr>");
				out.println("		<td>");
				out.println(			hobby[i]);
				out.println("		</td>");
				
			}
		}
	}

}
