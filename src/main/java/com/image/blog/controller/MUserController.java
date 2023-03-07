package com.image.blog.controller;

import com.image.blog.common.Result;
import com.image.blog.entity.MUser;
import com.image.blog.service.IMUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 *  前端控制器
 * @author Xiner
 * @since 2021-07-20
 */
@RestController
@RequestMapping("user")
public class MUserController {

    @Autowired
    IMUserService userService;


    @PostMapping("regist")
    public Result regist(@Validated @RequestBody MUser user){

        return Result.success("注册成功",user);
    }

}
