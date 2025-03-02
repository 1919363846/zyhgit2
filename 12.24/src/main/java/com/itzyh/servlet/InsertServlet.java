package com.itzyh.servlet;
//增加
import com.itzyh.mapper.StaffsMapper;
import com.itzyh.pojo.Staffs;
import com.itzyh.util.SqlSessionFactoryUtils;

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
        String JobID = req.getParameter("JobID");
        String Name = req.getParameter("Name");
        String sex = req.getParameter("sex");
        String birthday = req.getParameter("birthday");
        String department = req.getParameter("department");
        String role = req.getParameter("role");
        String password = req.getParameter("password");

        Staffs staffs = new Staffs();
        staffs.setJobID(JobID);
        staffs.setName(Name);
        staffs.setSex(sex);
        staffs.setBirthday(birthday);
        staffs.setDepartment(department);
        staffs.setRole(role);
        staffs.setPassword(password);

        //调用Mapper
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        //获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取Mapper
        StaffsMapper staffsMapper = sqlSession.getMapper(StaffsMapper.class);
        staffsMapper.insert(staffs);
        sqlSession.commit();
        sqlSession.close();


    }
}


/*
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
}*/