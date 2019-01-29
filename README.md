# bokesuper
多模块开发搭建

### 2019.01.13 周日 18:24
  
  父项目
    管理所以子项目 jar
  
  添加子项目
    -->右击父项目-->Module-->...quickstart
    
  各个项目之间调用
    1.各模块打包成 jar，放入仓库
    2.本模块的pom，放其他模块jar 坐标
    
       
### 2019.01.29 周二 21:19 
    eclipse svn 下拉项目  -- 问题：
       A、 没有看到完整的目录结构， 如 jdk、maven的jar
       	   -- 1.首先把eclipse的上刚刚下拉的项目删除（不要删除本地的）
       	   -- 2.重新导入项目(本地) import --> maven --> Existing Maven Projects ...
	   -- 3.编译时失败-依赖包找不到 右击项目 Propeties --> Deployment Assembly --> add --> Java Buid Path Entries
       B、 使用zookeeper在本地用tomcat运行项目时的问题
       	   -- 1.dubbo.registry.address=zookeeper://127.0.0.1:2181 可以本地的，也可以在服务器搭一个
       	   -- 2.dubbo.registry.file1=‘’ 日志的路径需要配完整的路径，不然会报很多的错误
       C、 Nginx 配置问题
       	   -- 1.location /view {
                  alias  /Users/weilj/Desktop/bmapp/platform/view/src/main/webapp;
                  index  index.html index.htm;
                }
       	   为了避免每次都要拷贝 alias 指定到web项目所在的位置 -- 然失效 因为 nginx 所安装的位置没有权限访问桌面文件
	    
	     1.nginx.conf文件最开始一行加上 user root owner;
	     2.给予它管理员权限
	     	--# 注意1.2.6是nginx版本，每个人的都不一样，记得修改。
               sudo chown root:wheel /usr/local/Cellar/nginx/1.2.6/bin/nginx
               sudo chmod u+s /usr/local/Cellar/nginx/1.2.6/bin/nginx

