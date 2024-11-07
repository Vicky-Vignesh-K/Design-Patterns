package com.factorydesignpattern;

public class OperatingSystemFactory {

    public OS getInstance(String name){
        if("popular".equals(name))
            return new Android();
        else if ("secure".equals(name))
            return new IOS();
        else
            return new Windows();
    }

}
