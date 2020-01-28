package com.johnny.hello.spring.boot.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.johnny.hello.spring.boot.mapper.TbTestMapper;
import com.johnny.hello.spring.boot.service.TbTestService;
@Service
public class TbTestServiceImpl implements TbTestService{

    @Resource
    private TbTestMapper tbTestMapper;

}
