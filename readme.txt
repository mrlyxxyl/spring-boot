一、打成jar包运行
    cd 项目跟目录（和pom.xml同级）
    mvn clean package
    ## 或者执行下面的命令
    ## 排除测试代码后进行打包
    mvn clean package  -Dmaven.test.skip=true

    打包完成后jar包会生成到target目录下，命名一般是 项目名+版本号.jar

    启动jar包命令
    java -jar spring-boot-1.0-SNAPSHOT.jar --server.port=8080

    这种方式，只要控制台关闭，服务就不能访问了。下面我们使用在后台运行的方式来启动:
    nohup java -jar spring-boot-1.0-SNAPSHOT.jar --server.port=8080 &

    也可以在启动的时候选择读取不同的配置文件,可以利用启动方式不同来做负载均衡
    nohup java -jar spring-boot-1.0-SNAPSHOT.jar --spring.profiles.active=dev --server.port=8080 &

参考地址：
    https://www.cnblogs.com/ityouknow/p/6834287.html?utm_source=itdadao&utm_medium=referral

二、修改application.properties文件的server.port可以设置服务端口

三、ScheduleService为定时任务