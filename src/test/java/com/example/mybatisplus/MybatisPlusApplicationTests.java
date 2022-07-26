package com.example.mybatisplus;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.entity.FaultTemplate;
import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.mapper.FaultTemplateMapper;
import com.example.mybatisplus.mapper.UserMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Resource
    private FaultTemplateMapper templateMapper;

    @Test
    void getAllUser() {
        List<User> users = userMapper.selectList(null);
        System.out.println("users = " + users);
    }

    @DS("two")
    @Test
    void addTemplate() {
        FaultTemplate faultTemplate = new FaultTemplate();
        faultTemplate.setTemplateCode("test");
        faultTemplate.setTemplateName("嗷嗷");
        faultTemplate.setCmdType("haha");
        templateMapper.insert(faultTemplate);
    }

    @Test
    void name() throws JsonProcessingException {
        Page<User> page = new Page<>();
        page.setCurrent(1L);
        page.setSize(2);
        Page<User> userPage = userMapper.selectPage(page, null);
        ObjectMapper mapper = new ObjectMapper();

        System.out.println("userPage = " + mapper.writeValueAsString(userPage));
    }
}
