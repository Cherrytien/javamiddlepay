package com.controller;

import com.domain.Deal;
import com.req.DealReq;
import com.resp.CommonResp;
import com.service.DealService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DealController {

//    private static final Logger LOG = LoggerFactory.getLogger(DealController.class);


    @Resource
    private DealService dealService;



    /**
     * GET, POST, PUT, DELETE
     *
     * /user?id=1
     * /user/1
     * @return
     */

//    @GetMapping("/deal/list")
//    public List<Deal> list() {
//        return dealService.list();
//    }

//    @GetMapping("/deal/list")
//    public CommonResp list() {
//        CommonResp<List<Deal>> resp = new CommonResp<>();
//        List<Deal> list = dealService.list();
//        resp.setContent(list);
//        return resp;
//    }

    @GetMapping("/deal/list")
    public CommonResp list(DealReq req) {
        CommonResp<List<Deal>> resp = new CommonResp<>();
        List<Deal> list = dealService.list(req);
        resp.setContent(list);
        return resp;
    }


}


