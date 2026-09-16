# Socket_HOME

Java 网络编程（Socket）练习项目，Maven 多模块结构，包含 TCP 客户端与服务端实现。

## 项目简介

本项目（Maven 坐标 `网络编程`）用于学习和演示 Java Socket 网络编程，通过客户端-服务端模式实现基本的 TCP 通信，包含消息模型定义与 JSON 数据交换。

## 技术栈

| 类别 | 技术 |
|------|------|
| 语言 | Java 11 |
| 构建 | Maven（多模块 pom） |
| 工具 | Fastjson 1.2.47 |

## 目录结构

```
Socket_HOME/
├── pom.xml                    # 父 POM（packaging: pom）
├── 网络编程服务端/              # 子模块：Socket 服务端
├── src/main/java/com/
│   ├── 客户端/                 # Socket 客户端
│   └── Model/                 # 通信数据模型
└── .gitignore
```

## 快速启动

```bash
git clone https://github.com/hubaolong3632/Socket_HOME.git
cd Socket_HOME

# 编译
mvn clean compile

# 先启动服务端，再启动客户端
```

## 模块说明

| 模块 | 说明 |
|------|------|
| `网络编程服务端/` | TCP Server 端，监听端口并处理客户端连接 |
| `客户端/` | TCP Client 端，连接服务端并发送/接收消息 |
| `Model/` | 通信协议数据模型（JSON 序列化） |

## 前置条件

- JDK 11+
- Maven 3.x
