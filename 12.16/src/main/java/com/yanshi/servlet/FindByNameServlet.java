package com.yanshi.servlet;

import com.yanshi.mapper.ClassesMapper;
import com.yanshi.pojo.Classes;
import com.yanshi.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FindByNameServlet")
public class FindByNameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 接收课程名
        String name=req.getParameter("name");

        //2. 调用MyBatis完成查询
        //2.1 获取SqlSessionFactory对象

        SqlSessionFactory sqlSessionFactory= SqlSessionFactoryUtils.getSqlSessionFactory();

        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        ClassesMapper classesMapper = sqlSession.getMapper(ClassesMapper.class);
        //2.4 调用方法
        Classes classes = classesMapper.selectByname(name);
        //2.5 释放资源
        sqlSession.close();


        //获取字符输出流，并设置content type
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        //3. 判断user释放为null
        if(classes != null){
            // 写出对应课程
            writer.write(classes.toString());
        }else {
            // 判断没有课程
            writer.write("没有找到该课程！");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}

