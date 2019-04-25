package com.cc.designpatterns.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

import com.cc.designpatterns.decoratorpattern.ConCreateComponent;
import com.cc.designpatterns.flyweightpattern.FlyWeight;

public class FlyWeightFactory {
    private Map<String, FlyWeight> flyWeightMap = new HashMap<String, FlyWeight>();

    public FlyWeight getFlyWeight(String guid) {
        if(null == flyWeightMap.get(guid)) {
            FlyWeight flyWeight = new ConcreateFlyWeight(guid);
            flyWeightMap.put(guid, flyWeight);
        }

        return flyWeightMap.get(guid);
    }
}