package com.example.fgoauto.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.fgoauto.mybaits.dao.FgoAuto;
import com.example.fgoauto.mybaits.mapper.FgoAutoMapper;
import com.example.fgoauto.service.FgoAutoService;
import com.example.fgoauto.test.MysqlTest;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
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
    }

    @GetMapping(value = "/api/addFgoAuto")
    public Integer addFgoAuto(FgoAuto fgoAuto) {
        if(fgoAuto.getScript()==null){
            fgoAuto.setScript("{\"start\":[\"eatApple\",\"choose\"],\"turn1\":[],\"turn2\":[],\"turn3\":[],\"end\":[]}");
        }
        int id= fgoAutoMapper.insertFgoAuto(fgoAuto);
        return id;
    }

    @PostMapping(value = "/api/editFgoAutoScript")
    public Integer editFgoAutoScript(FgoAuto fgoAuto) {
        int id= fgoAutoMapper.updateFgoAuto(fgoAuto);
        return id;
    }

    @GetMapping(value = "/api/getFgoAutoList")
    public JSONObject getFgoAutoList(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int pageSize) {
        int offset = (page - 1) * pageSize;
        List<FgoAuto> fgoAutoList = fgoAutoMapper.queryFgoAutoPage(offset, pageSize);
        int total = fgoAutoMapper.countFgoAuto();
        JSONArray list = fgoAutoService.fgoAutoListToJson(fgoAutoList);
        JSONObject result = new JSONObject();
        result.put("list", list);
        result.put("total", total);
        result.put("page", page);
        result.put("pageSize", pageSize);
        return result;
    }

    @GetMapping(value = "/api/getVersionInfo")
    public JSONObject getVersionInfo() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        JSONObject result = new JSONObject();

        // 后端：取 jar 文件的最后修改时间
        String backendTime = "unknown";
        try {
            File jar = new File("/usr/FgoAuto-0.0.1-SNAPSHOT.jar");
            if (jar.exists()) {
                LocalDateTime ldt = LocalDateTime.ofInstant(
                        Instant.ofEpochMilli(jar.lastModified()), ZoneId.systemDefault());
                backendTime = ldt.format(fmt);
            }
        } catch (Exception e) {
            backendTime = "error: " + e.getMessage();
        }

        // 前端：取 /usr/build/index.html 的最后修改时间
        String frontendTime = "unknown";
        try {
            File html = new File("/usr/build/index.html");
            if (html.exists()) {
                LocalDateTime ldt = LocalDateTime.ofInstant(
                        Instant.ofEpochMilli(html.lastModified()), ZoneId.systemDefault());
                frontendTime = ldt.format(fmt);
            }
        } catch (Exception e) {
            frontendTime = "error: " + e.getMessage();
        }

        result.put("backendTime", backendTime);
        result.put("frontendTime", frontendTime);
        return result;
    }

}
