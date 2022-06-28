package com.itheima.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo1", loadOnStartup = 1)
public class ServletDemo1 implements Servlet {
    private ServletConfig config;
    /**
     * init : 初始化方法
     * 1.调用时机：默认情况下，Servlet被第一次访问时调用
     * loadOnStartup: 为0或正整数时在创建时调用
     * 2.调用次数：1次
     * @param servletConfig
     * @throws ServletException
     */
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        System.out.println("init");
    }

    /**
     * service:提供服务
     * 1.调用时机：每一次Servlet被访问时调用该方法
     * 2.调用次数：访问的次数
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet Hello World");
    }

    //Returns information about the servlet, such as author, version, and copyright
    public String getServletInfo() {
        return null;
    }

    /**
     * destroy:销毁方法
     * 1.调用时机：内存释放或服务器被关闭时，Servlet对象会被销毁，此时调用该方法
     * 2.调用次数：1次
     */
    public void destroy() {
        System.out.println("destroy");
    }

    //返回一个ServletConfig对象
    public ServletConfig getServletConfig() {
        return config;
    }
}
