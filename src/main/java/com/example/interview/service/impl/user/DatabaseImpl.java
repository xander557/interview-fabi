package com.example.interview.service.impl.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.interview.mapper.DataBaseMapper;
import com.example.interview.mapper.UserMapper;
import com.example.interview.pojo.DataBase;
import com.example.interview.pojo.User;
import com.example.interview.service.user.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DatabaseImpl  {
    @Autowired
    private DataBaseMapper mapper;


    // return all table names
    public List<String>  get() {
        List<String> allTableName = mapper.getAllTableName();
        return allTableName;

    }

    // return all table names
//    public List<String>  get(String tableName) {
//        List<String> allTableName = mapper.getSchemaINfoByTableName(tableName);
//        return allTableName;
//
//    }
//    }

//
//    @CronJob
//    private keepUpdate(){
//        // use method in mapper
            // use the returned table names to
            // getSchemaINfoByTableName
//    }
}

