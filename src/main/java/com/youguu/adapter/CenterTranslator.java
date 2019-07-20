package com.youguu.adapter;

public class CenterTranslator extends Player{

    private ForeignCenter yangMing = new ForeignCenter(name);

    public CenterTranslator(String name) {
        super(name);
    }

    @Override
    public void attack() {
        yangMing.jingong();
    }

    @Override
    public void defense() {
        yangMing.fangshou();
    }
}
