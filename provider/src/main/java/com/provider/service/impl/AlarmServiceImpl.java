package com.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.provider.service.AlarmService;

/**
 * Created by lisk on 2018/6/21.
 */
@Service(interfaceName="alarmService",version = "1.0.0")
public class AlarmServiceImpl implements AlarmService {
    @Override
    public String getAlarm(String str) {
        return JSON.toJSONString(str);
    }
}
