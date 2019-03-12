package com.baizhi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="test")
public class Test1 {

    private Integer id;
    private String name;
    private Integer sex;
    private Integer age;
}
