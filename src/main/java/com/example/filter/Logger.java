package com.example.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

// filter này cần được khai báo trong web.xml
@WebFilter(urlPatterns = {"/session1"})
public class Logger implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Logging in Logger, hahahaha");

        // xử lý request nếu cần thiết ở trước nó
        filterChain.doFilter(servletRequest, servletResponse); // cho phép filter này đi đến các filter tiếp theo (nếu có) hoặc đi đến server
        // xử lý response nếu cần thiết ở sau nó
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
