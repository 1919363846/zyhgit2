package com.yanshi.mapper;

import com.yanshi.pojo.Classes;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ClassesMapper {
    @Select("select * from tb_class where name = #{name} ")
    Classes selectByname(@Param("name") String name);//课程名查找

    @Select("select * from tb_class where id = #{id} ")
    Classes selectByid(@Param("id") String id);//id查找

    @Insert("insert into tb_class values(null,#{id},#{name},#{num},#{teacher},#{pos})")
    void add(Classes classes);//添加新数据
}

