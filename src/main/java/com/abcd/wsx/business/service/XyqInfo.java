package com.abcd.wsx.business.service;

import java.util.List;

public interface XyqInfo {

    List<String> findAllServer();

    String queryServerStartTime(String serverName);

    List<Integer> getAbcd(String abcd);
}
