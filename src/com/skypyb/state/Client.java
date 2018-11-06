package com.skypyb.state;


public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        //将状态设置到环境中，然后就可以不管了。
        //之后状态随意切换，至于切换了状态会发生啥？关我这个调用者屁事
        context.setState(context.freeState);//一开始我设置为空闲状态

        //下面是状态的切换,注释标明了其切换状态是否成功
        context.booked();//试图转换为预定      true
        context.free();//试图转换为空闲        true
        context.checkedin();//试图转换为入住   false
        context.booked();//试图转换为预定      true
        context.checkedin();//试图转换为入住   true
        context.free();//试图转换为空闲        true
    }

}
