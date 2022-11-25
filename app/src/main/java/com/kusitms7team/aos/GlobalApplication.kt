package com.kusitms7team.aos

import android.app.Application
import com.kakao.sdk.common.KakaoSdk


public class GlobalApplication : Application() {
    public var applicationGrade : Int = 0
    companion object {
        var instance: GlobalApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
        KakaoSdk.init(this, "4f444e8815868b65a842725e9610b1d0")
    }
}