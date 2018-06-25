package com.custom.com.custom.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.provider.service.AlarmService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lisk on 2018/6/22.
 */
@RestController
@RequestMapping("/alarm")
public class AlarmControllor {
    @Reference(version = "1.0.0")
    AlarmService alarmService;

    @RequestMapping(value = "/getAlarm/{id}", method = RequestMethod.GET)
//    @ResponseBody
    public Map<String,Object> getAlarm(@PathVariable int id){
//        TypeReference 接口对应返回类型
        String sid= String.valueOf(id);
        String a = JSON.parseObject(alarmService.getAlarm(sid) ,new TypeReference<String>(){});
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("Alarmkey",a);
        return map;
    }
}
