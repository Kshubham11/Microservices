package com.dailycodebuffer.ProductService.model;


import lombok.*;

//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductRequest {
    private String name;
    private long price;
    private long quantity;
}
