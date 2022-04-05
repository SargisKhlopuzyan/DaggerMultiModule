package com.fastcredit.dynamicfeature_1.di.helper

import android.app.Activity
import com.fastcredit.core.di.componentProvider.CoreComponentProvider

/**
 * Created by Sargis Khlopuzyan on 4/5/2022.
 */

fun Activity.coreComponent() =
    (applicationContext as? CoreComponentProvider)?.provideCoreComponent()
        ?: throw IllegalStateException("CoreComponentProvider not implemented: $applicationContext")