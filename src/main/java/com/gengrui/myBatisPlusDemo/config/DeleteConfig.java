package com.gengrui.myBatisPlusDemo.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @ClassName: DeleteConfig
 * @Author: GengRui
 * @Date: 2019/8/19 10:58
 */
@Configuration
public class DeleteConfig {
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }
}
