package mb.amazul.webservice;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CorsFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		 HttpServletRequest request = (HttpServletRequest) req;
	        HttpServletResponse response = (HttpServletResponse) resp;

	        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));

	        response.setHeader("Access-Control-Allow-Credentials", "true");

	        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));

	        response.setHeader("Content-Type", "application/json;charset=UTF-8");
	        
	        //response.setCharacterEncoding("UTF-8");

	        if ("OPTIONS".equals(request.getMethod())) {
	        response.setHeader("Access-Control-Allow-Methods", "POST, GET, DELETE, PUT, OPTIONS");
	            response.setHeader("Access-Control-Allow-Headers", "Authorization, Content-Type, Accept");
	            response.setHeader("Access-Control-Max-Age", "3600");
	            response.setHeader("Content-Type", "application/json;charset=UTF-8");
	            response.setStatus(HttpServletResponse.SC_OK);
	            //response.setCharacterEncoding("UTF-8");
	        } else {
	            chain.doFilter(req, resp);
	        }
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
