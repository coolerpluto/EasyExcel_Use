package com.fan.controller;

import com.alibaba.excel.EasyExcel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RequestMapping("/read")
@RestController
public class ReadController {

//    web读取单表头文件，前端传文件，MultipartFile接收
    @RequestMapping("/simpleRead")
    public String simpleRead(MultipartFile file){
        EasyExcel.read(file.getInputStream(),)
        return "";
    }
}
