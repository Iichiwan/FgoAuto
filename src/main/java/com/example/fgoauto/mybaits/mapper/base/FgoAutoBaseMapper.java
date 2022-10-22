package com.example.fgoauto.mybaits.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.fgoauto.mybaits.dao.FgoAuto;
/**
*  @author author
*/
public interface FgoAutoBaseMapper {

    int insertFgoAuto(FgoAuto object);

    int updateFgoAuto(FgoAuto object);

    int update(FgoAuto.UpdateBuilder object);

    List<FgoAuto> queryFgoAuto(FgoAuto object);

    FgoAuto queryFgoAutoLimit1(FgoAuto object);

}