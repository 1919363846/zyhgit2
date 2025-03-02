package com.itzyh.mapper;
import com.itzyh.pojo.Classes;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
public interface ClassesMapper {

        @Select("select * from table_text where agentID = #{agentID} ")
        Classes selectByagentID(@Param("agentID") String agentID);//id查找

        @Insert("insert into table_text values(null,#{agentID},#{agentName},#{agentAddress},#{phone})")
        void add(Classes classes);//添加新数据
    }



