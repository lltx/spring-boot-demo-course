package com.pig4cloud.spring.ej.config;

import com.jfinal.template.Directive;
import com.jfinal.template.Env;
import com.jfinal.template.io.Writer;
import com.jfinal.template.stat.Scope;

import java.io.IOException;

/**
 * @author lengleng
 * @date 2020/6/29
 */
public class NameDirective extends Directive {
    @Override
    public void exec(Env env, Scope scope, Writer writer) {
        try {
            writer.write("我是自定义指令");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
