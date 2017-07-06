package com.lumr.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解测试
 *
 * Created by lumr on 2017/7/6.
 */
@Target(ElementType.METHOD)//定义你的注解将应用在什么地方，如方法、域
@Retention(RetentionPolicy.CLASS)//定义该注解在哪个级别可以用，在源代码、类文件中、运行时
public @interface Test {
}
