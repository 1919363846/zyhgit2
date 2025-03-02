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

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String username = req.getParameter("username");
//        String password=req.getParameter("password");
        String  id=req.getParameter("id");
        String name=req.getParameter("name");
        Integer num= Integer.valueOf(req.getParameter( "num"));
        String teacher=req.getParameter("teacher");
        String pos=req.getParameter("pos");

        Classes classes=new Classes();
//        user.setUsername(username);
//        user.setPassword(password);
        classes.setId(id);
        classes.setName(name);
        classes.setNum(num);
        classes.setTeacher(teacher);
        classes.setPos(pos);
        //调用Mapper
        SqlSessionFactory sqlSessionFactory= SqlSessionFactoryUtils.getSqlSessionFactory();

        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        ClassesMapper classesMapper = sqlSession.getMapper(ClassesMapper.class);
        //2.4 调用方法
        Classes classes1=classesMapper.selectByid(id);
        //这里是用FindByid查重
        if(classes1==null){
            //不存在，就加数据
            classesMapper.add(classes);
            //提交事务
            sqlSession.commit();
            //2.5 释放资源
            sqlSession.close();
        }else{
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("课程已存在！");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}

