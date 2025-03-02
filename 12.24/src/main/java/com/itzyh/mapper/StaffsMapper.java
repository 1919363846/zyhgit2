package com.itzyh.mapper;
import com.itzyh.pojo.Staffs;
import org.apache.ibatis.annotations.Insert;
public interface StaffsMapper {
    @Insert("insert into staff_infor values (null,#{JobID},#{Name},#{sex},#{birthday},#{department},#{role},#{password})")
    void insert(Staffs staffs);



}
