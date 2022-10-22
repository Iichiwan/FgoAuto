package com.example.fgoauto.controller;

import com.alibaba.fastjson.JSONArray;
import com.example.fgoauto.mybaits.dao.FgoAuto;
import com.example.fgoauto.mybaits.mapper.FgoAutoMapper;
import com.example.fgoauto.service.FgoAutoService;
import com.example.fgoauto.test.MysqlTest;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author 86139
 */
@RestController
@MapperScan("com.example.fgoauto.mybaits")
public class HelloController {

    @Autowired
    FgoAutoMapper fgoAutoMapper;

    @Autowired
    FgoAutoService fgoAutoService;

    @GetMapping(value = "/api/hello")
    public String say() {
        return "iichiwan test";
    }

    @GetMapping(value = "/api/test")
    public String test() {
        MysqlTest.test();
        return "";
    }

    @GetMapping(value = "/api/getFgoAuto")
    public String getFgoAuto(FgoAuto fgoAuto) {
        Long id=fgoAuto.getId();
        List<FgoAuto> a= fgoAutoMapper.queryFgoAuto(fgoAuto);
        System.out.println(a.get(0).getId());
        return a.get(0).getScript();
        //fgoAutoDAO.getScript();
    }

    @GetMapping(value = "/api/addFgoAuto")
    public Integer addFgoAuto(FgoAuto fgoAuto) {
        int id= fgoAutoMapper.insertFgoAuto(fgoAuto);
        return id;
    }

    @GetMapping(value = "/api/getFgoAutoList")
    public JSONArray getFgoAutoList() {
        FgoAuto fgoAuto=new FgoAuto();
        List<FgoAuto> fgoAutoList= fgoAutoMapper.queryFgoAuto(fgoAuto);
        JSONArray result=fgoAutoService.fgoAutoListToJson(fgoAutoList);
        return result;
    }



}
