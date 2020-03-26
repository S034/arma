# Arma3 Windows server Easy RC
欢迎来到Arma3 Windows-server 远程简易管理项目，本项目主要目的是通过提供web API，免去使用第一方或者第三方远程桌面工具的繁琐步骤。
同时也解决了Arma3服务端启动器大多不适应当前版本的问题。
本项目额外支持对extDB3的查询
使用须知：
  1.本项使用SpringBoot+mybatis，数据库建议使用mysql。
  2.本项目仅提供API而未提供用户界面，用户界面将在另一项目中发布，API文档在/doc目录下已给出
  3.sql样例在/src/main/resources/static目录下
  4.在部署前请将Arma3服务端根目录添加至环境变量“Path”中
  5.请将appilcation.yml中的“username”和“password”替换成您安装mysql时设定的用户名和密码
  6.请按照您在数据库e419.params.proflie中的路径创建对应文件夹，并在该文件夹下，创建“Users”文件夹，同样在“Users”文件夹下创建与你
    e419.params.name中的值名称一致的文件夹。如果上述字段中的对应值为空，请立即填写，不要留空。
  7.请立即修改e419.sequity.securityCode中的值，并牢记。
项目仅为测试阶段，存在大量待修改内容，故暂不回答任何问题。
