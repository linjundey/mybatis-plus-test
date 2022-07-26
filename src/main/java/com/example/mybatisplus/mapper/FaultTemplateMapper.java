package com.example.mybatisplus.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.mybatisplus.entity.FaultTemplate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author linjun
* @description 针对表【fault_template】的数据库操作Mapper
* @createDate 2022-07-27 01:19:28
* @Entity com.example.mybatisplus.entity.FaultTemplate
*/
@DS("two")
public interface FaultTemplateMapper extends BaseMapper<FaultTemplate> {

}




