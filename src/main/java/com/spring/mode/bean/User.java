package com.spring.mode.bean;

import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@Setter
@Getter
@NoArgsConstructor
@ToString
public class User {
    private String username;
    private String password;
    private Addres addres;
    private List<Integer> list;
    private Map<String,String> map;

    public void init(){
       this.username="zz"; //会覆盖掉xml中的username
        System.out.println("init初始化");
    }
    public void destroy(){
        System.out.println("对象被收回");
    }

}

