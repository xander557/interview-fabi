package com.example.interview.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.interview.pojo.DataBase;
import com.example.interview.pojo.User;
import net.sf.jsqlparser.schema.Database;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DataBaseMapper extends BaseMapper<DataBase> {

    @Select("select table_name from information_schema.tables where table_schema = (select database())")
    List<String> getAllTableName();
    @Select("select column_name ,data_type, column_type from information_schema.columns where table_schema = ")
    DataBase getSchemaINfoByTableName(String name);


}
