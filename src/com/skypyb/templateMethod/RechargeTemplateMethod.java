package com.skypyb.templateMethod;

/**
 * 模板方法模式
 *
 * @author pyb www.skypyb.com www.yibobo.top
 */
public abstract class RechargeTemplateMethod {

    public void entryRechargePage() {
        System.out.println("进入充值界面...");
    }

    public void recharge() {
        System.out.println("氪金！");
    }

    //支付方式，具体的支付方式可能变动。abstract修饰，强制子类重写。
    public abstract void modeOfPayment();

    public void luckyDraw() {
        System.out.println("抽奖，哇又是保底SR");
    }

    /**
     * 模板方法，流程已知。
     * 定义好具体的流程加上 final 修饰，使得子类不可重写
     * 外部调用必须通过本类进行调用
     */
    public final void process(){
        this.entryRechargePage();
        this.recharge();
        this.modeOfPayment();
        this.luckyDraw();
    }

}