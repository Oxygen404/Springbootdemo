package com.oxygen.hander;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @purpose: 自动填充时间
 */
@Slf4j
@Component //把处理器添加到IOC容器中
public class MyMataObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        //设置每次插入的时候更新 创建时间和更新时间 也就是初始化时间
        this.setFieldValByName("createtime",new Date(),metaObject);
        this.setFieldValByName("updatetime",new Date(),metaObject);

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
}
