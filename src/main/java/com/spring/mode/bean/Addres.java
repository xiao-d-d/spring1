package com.spring.mode.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString //去掉@ToString 将会以哈希方式输出
public class Addres {
    private String detail;
}
