# blockyBackend
高级web后端项目文档
##

### 项目部署指南
后端框架基本搭建完毕，在后端的github上clone项目到本地：

1、使用IDEA导入项目（记得启动mysql）

2、打开位于backend/src/main/resources/下的application.properties文件

3、修改该文件当中的数据库密码（如果需要可以同时修改用户名和密码）

4、运行sql文件夹下的两个sql文件

5、可以在数据库当中的test数据表当中随意创建一个表项用于测试

6、运行位于backend/src/main/java/blocky/backend下的BackendApplication文件

7、打开浏览器，输入 http://127.0.0.1:18902/demoproject/test/get/+你创建的表项的id

8、如果能够显示数据在网页上，证明部署成功

9、如果想要运行项目，直接run BackendApplication文件即可

##
##本地接口地址
登陆接口地址：127.0.0.1:18902/users/login

注册接口地址：127.0.0.1:18902/users/register