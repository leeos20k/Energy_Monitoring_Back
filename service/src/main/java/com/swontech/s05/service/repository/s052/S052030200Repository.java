package com.swontech.s05.service.repository.s052;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class S052030200Repository {
    private final SqlSessionTemplate sqlSessionTemplate;

    public S052030200Repository(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<Map<String, Object>> getRegFixMgn(Map<String, Object> map) {
        return sqlSessionTemplate.selectList("S052030200.GetRegFixMgnVO", map);
    }

    public int UpdateFix010(Map<String, Object> map) {
        return sqlSessionTemplate.insert("S052030200.UpdateFix010", map);
    }

    public int UpdateMachine(Map<String, Object> map) {
        return sqlSessionTemplate.insert("S052030200.UpdateMachine", map);
    }
}
