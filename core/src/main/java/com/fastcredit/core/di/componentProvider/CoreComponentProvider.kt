package com.fastcredit.core.di.componentProvider

import com.fastcredit.core.di.component.CoreComponent

/**
 * Created by Sargis Khlopuzyan on 4/5/2022.
 */
interface CoreComponentProvider {
    fun provideCoreComponent(): CoreComponent
}