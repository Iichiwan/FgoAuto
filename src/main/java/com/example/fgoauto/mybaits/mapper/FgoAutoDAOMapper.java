package com.example.fgoauto.mybaits.mapper;

import com.example.fgoauto.mybaits.dao.FgoAutoDAO;
import com.example.fgoauto.mybaits.dao.FgoAutoDAOWithBLOBs;

public interface FgoAutoDAOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FgoAutoDAOWithBLOBs record);

    int insertSelective(FgoAutoDAOWithBLOBs record);

    FgoAutoDAOWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FgoAutoDAOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FgoAutoDAOWithBLOBs record);

    int updateByPrimaryKey(FgoAutoDAO record);
}