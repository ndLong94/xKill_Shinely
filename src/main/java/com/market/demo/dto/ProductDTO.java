package com.market.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class ProductDTO {
    @NotNull(message = "Owner Id cannot be null")
    private Long ownerId;
    
    @NotNull(message = "Category Id cannot be null")
    private Long categoryId;
    
    @NotNull(message = "Title cannot be null")
    private String title;
    
    private String description;
    
    private String quantity;
    
    private String postDate;
    
    private String expireDate;
    
    private Long villageId;
    
    private  MultipartFile[] fileuploads;
    
    private  byte[] fileDB;
}
