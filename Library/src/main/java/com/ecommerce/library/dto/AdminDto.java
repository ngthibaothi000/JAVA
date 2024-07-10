package com.ecommerce.library.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDto {
    @Size(min = 3, max = 10, message = "Tên phải từ 3 - 10 kí tự")
    private String firstName;
    @Size(min = 3, max = 10, message = "Họ phải từ 3 - 10 kí tự")
    private String lastName;
    private String username;
    @Size(min = 5, max = 10, message = "Mật khẩu từ 5 - 10 kí tự")
    private String password;
    private String repeatPassword;
}
