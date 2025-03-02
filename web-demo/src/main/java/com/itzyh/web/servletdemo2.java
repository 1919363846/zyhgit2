package com.itzyh.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * 演示Servlet方法和体系结构
 */
@WebServlet(urlPatterns="/demo2",loadOnStartup = 1)
public class servletdemo2 implements Servlet {
//第一步：(第二步在init方法中)
    private ServletConfig config;
    @Override
    public ServletConfig getServletConfig() {
        return config;//默认为null，扩大config范围后可返回config
    }
/*如果直接return config，config为局部变量，所以会报错，为了解决这个问题，现给出一种重要的技巧：
  将config的访问范围扩大，俩步*/


    @Override
    public String getServletInfo() {
        return "";
    }



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
        //第二步：
        this.config = config;
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


}
