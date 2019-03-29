package com.yun.service.impl;

import com.yun.mapper.RegAndLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegAndLoginServiceImpl {
    //@Autowired是依赖注入，注入mapper层
    @Autowired
    private RegAndLoginMapper regAndLoginMapper;
}
