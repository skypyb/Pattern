工厂模式
---


实现了创建和调用者的分离

核心本质：
-	实例化对象，用工厂方法代替new操作
-	将选择实现类、创建对象统一管理和控制。从而将调用者跟我们的实现类解耦

工厂模式（factory）大概分为三种：
-	简单工厂模式
	用来生产同一等级结构中的任意产品（对于增加新的产品，需要修改已有代码）
-	工厂方法模式
	用来生产同一等级结构中的固定产品（支持增加任意产品）
-	抽象工厂模式
	用来生产不用产品族的全部产品（对于增加新的产品无能为力;支持增加产品族）
<br>
<br>
<br>

简单工厂
-	简单工厂也叫静态工厂模式，就是工厂类一般是使用静态方法，通过接收的参数不同来返回不同的对象实例
-	缺点是对于增加新产品无能为力，不修改代码就不能扩展，必须修改已有的代码。


工厂方法模式
-	为了避免简单工厂模式的缺点、不完全满足OCP
-	工厂方法模式和简单工厂模式最大的不同在于，简单工程模式只有一个工厂类（对于一个项目或一个独立模块而言），而工厂方法模式有一组实现了相同接口的工厂类
