package com.example.demo.controller;

import com.example.demo.dto.LoginDTO;
import com.example.demo.service.LoginService;
import com.example.demo.util.Result;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 *
 * @author 咲蛍
 * @date 2021/05/17
 */
@RestController
public class LoginController {
    @Resource
     private LoginService loginService;

    @PostMapping(value = "/api/login")
    public Result<T> login(@RequestBody LoginDTO loginDTO){
        return loginService.login(loginDTO);
    }
}
