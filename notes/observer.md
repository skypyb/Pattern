观察者模式(Observcer)

核心:  
&nbsp;&nbsp;&nbsp;&nbsp;观察者模式主要用于1：N的通知。  
&nbsp;&nbsp;&nbsp;&nbsp;当一个对象(目标对象Subject或Observable)的状态变化时,他需要及时告知一系列对象(观察者对象,Observer) ，令他们做出响应。

通知观察的方式:
* 推  
&nbsp;&nbsp;&nbsp;&nbsp;每次都会把通知以广播的形式发送给所有观察者，所有观察者只能被动接收
* 拉  
&nbsp;&nbsp;&nbsp;&nbsp;观察者只要知道有情况即可，至于什么时候获取内容，获取什么内容，都可以自主决定。 

