package com.abcd.wsx.business.service.impl;

import com.abcd.wsx.business.service.XyqInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class XyqInfoImpl implements XyqInfo {
    @Override
    public List<String> findAllServer() {
        List<String> serverList = new ArrayList<>();
        serverList.add("映月湖");
        serverList.add("烟雨楼");
        serverList.add("大雁塔");
        serverList.add("牡丹亭");
        serverList.add("蓬莱岛");
        serverList.add("山海关");
        serverList.add("黄鹤楼");
        return serverList;
    }

    @Override
    public String queryServerStartTime(String serverName) {
        String time = "";
        switch (serverName){
            case "映月湖" :
                time = "2003-12-19";
                break;
            case "烟雨楼" :
                time = "2003-12-21";
                break;

            case "大雁塔" :
                time = "2003-12-20";
                break;

            case "牡丹亭" :
                time = "2003-12-22";
                break;
        }
        return time;
    }

    @Override
    public List<Integer> getAbcd(String abcd) {
        List<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(abcd));
        return list;
    }
}
