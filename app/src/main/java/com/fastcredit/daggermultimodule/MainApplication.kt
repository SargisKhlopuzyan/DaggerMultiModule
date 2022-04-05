package com.fastcredit.daggermultimodule

import android.app.Application
import com.fastcredit.core.di.component.CoreComponent
import com.fastcredit.core.di.component.DaggerCoreComponent
import com.fastcredit.core.di.componentProvider.CoreComponentProvider
import com.fastcredit.core.di.module.AppContextModule

/**
 * Created by Sargis Khlopuzyan on 4/5/2022.
 */
class MainApplication : Application(), CoreComponentProvider {

    lateinit var coreComponent: CoreComponent

    override fun onCreate() {
        super.onCreate()

        coreComponent = DaggerCoreComponent
            .builder()
            .contextModule(AppContextModule(this))
            .build()
    }

    override fun provideCoreComponent() = coreComponent

}