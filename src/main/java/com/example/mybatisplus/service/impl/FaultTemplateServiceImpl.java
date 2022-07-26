package com.example.mybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.entity.FaultTemplate;
import com.example.mybatisplus.service.FaultTemplateService;
import com.example.mybatisplus.mapper.FaultTemplateMapper;
import org.springframework.stereotype.Service;

/**
* @author linjun
* @description 针对表【fault_template】的数据库操作Service实现
* @createDate 2022-07-27 01:19:28
*/
@Service
@DS("two")
public class FaultTemplateServiceImpl extends ServiceImpl<FaultTemplateMapper, FaultTemplate>
    implements FaultTemplateService{

}




