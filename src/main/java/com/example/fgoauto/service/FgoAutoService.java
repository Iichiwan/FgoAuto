package com.example.fgoauto.service;

import com.alibaba.fastjson.JSONArray;
import com.example.fgoauto.mybaits.dao.FgoAuto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FgoAutoService {

    public JSONArray fgoAutoListToJson(List<FgoAuto> fgoAutoList){
        JSONArray result=new JSONArray();
        fgoAutoList.stream().filter(p->(p.getScript()!=null)).forEach(result::add);
        return result;
    }

}
