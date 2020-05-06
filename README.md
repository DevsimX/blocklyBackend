# blockyBackend
高级web后端项目文档
##

### 项目部署指南
后端框架基本搭建完毕，在后端的github上clone项目到本地：

1、使用IDEA导入项目（记得启动mysql）

2、打开位于backend/src/main/resources/下的application.properties文件

3、修改该文件当中的数据库密码（如果需要可以同时修改用户名和密码）

4、运行sql文件夹下的两个sql文件

5、运行位于backend/src/main/java/blocky/backend下的BackendApplication文件即可运行该项目

6、暂时没有测试接口，如果想测试可以在专业测试api的软件中进行测试，测试接口地址可以用下面的本地接口地址，接口规则见接口文档

##
##本地接口地址
登陆接口地址：127.0.0.1:18902/users/login

注册接口地址：127.0.0.1:18902/users/register