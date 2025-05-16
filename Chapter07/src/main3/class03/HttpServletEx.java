package main3.class03;

public class HttpServletEx {
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}
	
	public static void method(HttpServlet httpServlet) {
		httpServlet.service();
	}
}
