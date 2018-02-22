package com.zmm.dagger2demo.componet;

import com.zmm.dagger2demo.MainActivity;
import com.zmm.dagger2demo.module.ApiModule;

import dagger.Component;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/2/22
 * Time:上午11:10
 */

@Component(modules = {ApiModule.class})
public interface ApiComponet {

    void inject(MainActivity mainActivity);

}
