package com.controller;

import com.config.WxPayConfig;
import com.domain.Test;
import com.domain.vo.R;
import com.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

//    @Value("${test.hello:TEST}")
//    private String testHello;

    @Resource
    private TestService testService;

//    @Resource
//    private RedisTemplate redisTemplate;

    /**
     * GET, POST, PUT, DELETE
     *
     * /user?id=1
     * /user/1
     * @return
     */
    // @PostMapping
    // @PutMapping
    // @DeleteMapping
    // @RequestMapping(value = "/user/1", method = RequestMethod.GET)
    // @RequestMapping(value = "/user/1", method = RequestMethod.DELETE)
//    @GetMapping("/hello")
//    public String hello() {
//        return "Hello World!" + testHello;
//    }

//    @PostMapping("/hello/post")
//    public String helloPost(String name) {
//        return "Hello World! Post，" + name;
//    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }

//    @RequestMapping("/redis/set/{key}/{value}")
//    public String set(@PathVariable Long key, @PathVariable String value) {
//        redisTemplate.opsForValue().set(key, value, 3600, TimeUnit.SECONDS);
//        LOG.info("key: {}, value: {}", key, value);
//        return "success";
//    }

//    @RequestMapping("/redis/get/{key}")
//    public Object get(@PathVariable Long key) {
//        Object object = redisTemplate.opsForValue().get(key);
//        LOG.info("key: {}, value: {}", key, object);
//        return object;
//    }
    @Resource
    private WxPayConfig wxPayConfig;

    @GetMapping
    public R getWxPayConfig(){

        String mchId = wxPayConfig.getMchId();
        return R.ok().data("mchId", mchId);
    }


}


