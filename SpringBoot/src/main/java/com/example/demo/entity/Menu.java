package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;

@TableName("menu")
@Data
public class Menu {

    @TableId (type = IdType.AUTO)
    private Long id;
    private String name;
    private String component;
    private String path;
    private String icon;
    private Long pid;
    private Integer sort;
    private String title;
}
