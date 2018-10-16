package chapter16;

import java.io.IOException;
import java.io.Writer;
import java.sql.Date;

public class Main_16_7 {

	public class HelloServlet extends HttpServlet {
		protected void doGet(HttpServletRequest reg,
				HttpServletResponse res) throws IOException {
			Date d = new Date();
			Writer w = res.getWriter();
			w.write("<html><body>");
			w.write("Today is " + d.toString());
			w.write("</body></html>");
		}
	}

}
