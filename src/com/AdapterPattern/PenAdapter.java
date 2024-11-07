package com.AdapterPattern;

public class PenAdapter implements IPen{

    private HeroPen heroPen = new HeroPen();
    @Override
    public void write(String content) {
        heroPen.write(content);
    }
}
