package com.skypyb.templateMethod;

/**
 * 模板方法中该节点的实现比较复杂的话可以这样，定义一个专门的类来继承
 * @author pyb www.skypyb.com www.yibobo.top
 */
public class AlipayTemplate extends RechargeTemplateMethod {
    @Override
    public void modeOfPayment() {
        System.out.println("用支付婊付钱");
    }
}
