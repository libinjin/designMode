package com.youguu.decorator;

public abstract class Decorate extends Component{

    protected Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void opreation() {

        if(component != null){
            component.opreation();
        }
    }
}
