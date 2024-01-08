package com.example.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);
	}
// 准备一个create sql的语句。 包含 primary key unique key,
	// 二级索引。 比如 username 加一个 索引。
	// post 接口
	// serivce 层。不需要 联表查询 left join
	// 换数据库
	// ecs
}
