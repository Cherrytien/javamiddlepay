package com.service;

import com.domain.Deal;
import com.domain.DealExample;
import com.mapper.DealMapper;
import com.req.DealReq;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DealService {

    @Resource
    private DealMapper dealMapper;

    public List<Deal> list(DealReq req) {

        DealExample dealExample = new DealExample();
        DealExample.Criteria criteria = dealExample.createCriteria();
        if(req.getName() == null){
            req.setName("");
        }
        criteria.andNameLike("%" + req.getName() + "%");
        return dealMapper.selectByExample(dealExample);

    }
}
