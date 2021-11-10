文件结构

```
├─.idea                                   idea的文件夹，不用管
│  └─libraries                            
├─src           						
│  ├─main                                 main目录为主要编写代码的区域
│  │  ├─java                              用于存放代码
│  │  │  └─com
│  │  │      └─example
│  │  │          └─demo
│  │  │              ├─controller         controller层
│  │  │              ├─mapper             mapper层（也叫dao层）
│  │  │              └─service            service层
│  │  └─resources                         用于存放资源文件、配置文件等
│  │      ├─mapper                        存放mapper映射文件
│  │      ├─static
│  │      └─templates
│  └─test                                 测试专用文件夹，不用管
│      └─java          
│          └─com
│              └─example
│                  └─demo
└─target                                  项目编译后生成的target文件夹，不用管
    ├─classes
    │  ├─com
    │  │  └─example
    │  │      └─demo
    │  │          ├─controller
    │  │          ├─mapper
    │  │          └─service
    │  └─mapper
    ├─generated-sources
    │  └─annotations
    ├─generated-test-sources
    │  └─test-annotations
    └─test-classes
        └─com
            └─example
                └─demo

```


建表语句

```mysql
CREATE TABLE `account` (
                           `id` int NOT NULL AUTO_INCREMENT,
                           `username` varchar(255) DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```

