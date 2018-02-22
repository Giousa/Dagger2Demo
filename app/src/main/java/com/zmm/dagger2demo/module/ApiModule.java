package com.zmm.dagger2demo.module;

import com.zmm.dagger2demo.ApiService;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/2/22
 * Time:上午11:11
 */

@Module
public class ApiModule {

    @Provides
    public ApiService provideApiService(){

        return new ApiService();
    }
}
