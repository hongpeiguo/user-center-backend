# 阶段 1: 构建阶段（如果使用 Maven/Gradle 构建）
# 同样，这里假设你已经在本地打好了 Jar 包。
# 生产环境中更推荐使用 multi-stage build 来减小最终镜像体积。

# 阶段 2: 运行阶段
FROM maven:3.5-jdk-8-alpine as builder

# 在容器内创建一个目录
WORKDIR /app

COPY pom.xml .
COPY src ./src
# 将本地的 Jar 包复制到容器内
COPY target/user-center-0.0.1-SNAPSHOT.jar app.jar

#RUN mvn package -DskipTests
# 暴露后端服务运行的端口
EXPOSE 8080

# 容器启动时运行的命令
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=prod"]