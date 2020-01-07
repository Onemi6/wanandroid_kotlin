package com.yechaoa.wanandroid_kotlin.app

import android.app.Application
import com.yechaoa.yutilskt.ActivityUtilKt
import com.yechaoa.yutilskt.LogUtilKt
import com.yechaoa.yutilskt.YUtilsKt

/**
 * Created by yechao on 2020/1/7/007.
 * Describe :
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        YUtilsKt.initialize(this)
        LogUtilKt.setIsLog(true)
        registerActivityLifecycleCallbacks(ActivityUtilKt.activityLifecycleCallbacks)
    }

}
