package com.example.ecommerceDemo.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LikeDTO {


    private Long likeId;
    private BlogDTO blog;
    private UserDTO user;

}
