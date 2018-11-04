package com.skypyb.templateMethod;

/**
 * 客户端，即具体使用者
 * 可根据需要使用不同的模板实现
 *
 *
 */
public class Client {
    public static void main(String[] args) {
        RechargeTemplateMethod method = new AlipayTemplate();
        method.process();//支付婊

        System.out.println();

        method = new WeChatTemplate();
        method.process();//weChat

        System.out.println();

        /**
         * 匿名内部类实现
         */
        new RechargeTemplateMethod() {
            @Override
            public void modeOfPayment() {
                System.out.println("用 PY 付钱");
            }

            @Override
            public void luckyDraw() {
                System.out.println("抽到SSR辣！");
            }
        }.process();
    }

    /**
     * 内部类方式实现
     */
    static class WeChatTemplate extends RechargeTemplateMethod {
        @Override
        public void modeOfPayment() {
            System.out.println("用 WeChat 付钱");
        }
    }
}
