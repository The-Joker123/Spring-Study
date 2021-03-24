# Spring-Study

#### 介绍
解决企业应用开发的复杂性

#### 常用依赖

      
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>




#### 注解说明

1. @Autowired:自动装配通过类型，名字
如果@Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value"xxx")
2.  @Nullable:字段标记了这个注解，说明这个字段可以为Null。
3.  @Resoure:自动装配通过名字，类型。

4.@Component:组件，放在类上，说明这个类被Spring管理了，就是bean。

