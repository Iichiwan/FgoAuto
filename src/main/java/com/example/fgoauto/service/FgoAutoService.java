package com.example.fgoauto.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.fgoauto.mybaits.dao.FgoAuto;
import com.mysql.cj.xdevapi.JsonArray;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FgoAutoService {

    public JSONArray fgoAutoListToJson(List<FgoAuto> fgoAutoList){
        JSONArray result=new JSONArray();
        fgoAutoList.stream().filter(p->(p.getScript()!=null&&p.getScript()!="{}")).forEach(result::add);
        return result;
    }

}
