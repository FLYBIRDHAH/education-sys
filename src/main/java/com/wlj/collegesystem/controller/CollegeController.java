package com.wlj.collegesystem.controller;

import com.wlj.collegesystem.bean.College;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CollegeController {
    /**
     * 以下是输出异常方法
     * @param college
     * @param result
     * @return
     * @Validate 表示需要对参数进行校验
     * BindingResult 表示在校验出错时保存的出错信息
     * result.hasErrors() 有异常时返回true
     */
    @GetMapping("/college")
    public List<String> addCollege(@Validated College college, BindingResult result){
        List<String> errors = new ArrayList<>();
        if(result.hasErrors()){
            List<ObjectError> allErrors = result.getAllErrors();
            for(ObjectError error : allErrors){
                errors.add(error.getDefaultMessage());
            }
        }
        return errors;
    }
}
