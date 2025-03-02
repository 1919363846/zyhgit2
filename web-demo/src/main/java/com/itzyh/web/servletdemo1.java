package com.itzyh.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * 演示Servlet执行流程和生命周期
 */
@WebServlet(urlPatterns="/demo1",loadOnStartup = 1)
public class servletdemo1 implements Servlet {

    /*
    * 初始化方法
    * 1.调用时机：默认情况下，当Servlet第一次被访问时
    * 通过属性配置可修改调用时机：loadOnStartup（有俩种取值，0或正整数：服务器启动时调用init，-1为默认情况）
    * 2.调用次数：1次
    * @param config(注：@param为文档注释的标识，当出现@param config时，一般指下文要对config这个参数进行描述)
    * @throws  ServletException
    * */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init servlet");
    }

    /**
     * 调用时机：每一次Servlet被访问时
     * 调用次数：多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet hello world~");
    }

    /**
     * 调用时机：内存被释放或者服务器关闭时，Servlet对象会被销毁
     * 调用次数：一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }





    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return "";
    }


}
