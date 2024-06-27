package io.github.mxkgf.entity.vo.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public class EmailRegisterVO {
    @Email
    private String email;

    @Length(min = 6, max = 6)
    private String code;

    @Length(min =1, max = 16)
    private String username;

    @Length(min = 6)
    private String password;

    public @Email String getEmail() {
        return email;
    }

    public void setEmail(@Email String email) {
        this.email = email;
    }

    public @Length(min = 6, max = 6) String getCode() {
        return code;
    }

    public void setCode(@Length(min = 6, max = 6) String code) {
        this.code = code;
    }

    public @Length(min = 1, max = 16) String getUsername() {
        return username;
    }

    public void setUsername(@Length(min = 1, max = 16)  String username) {
        this.username = username;
    }

    public @Length(min = 6) String getPassword() {
        return password;
    }

    public void setPassword(@Length(min = 6) String password) {
        this.password = password;
    }
}
