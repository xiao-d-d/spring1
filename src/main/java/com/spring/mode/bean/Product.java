package com.spring.mode.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Data
@Component
@Getter
@Setter
@ToString
public class Product {

    private String name;
    private BigDecimal price;
    private User user;
}
