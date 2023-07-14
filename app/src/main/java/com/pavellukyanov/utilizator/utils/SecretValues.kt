package com.pavellukyanov.utilizator.utils

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import com.pavellukyanov.utilizator.utils.Const.EMPTY_STRING
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class SecretValues @Inject constructor(
    @ApplicationContext private val context: Context
) {
    fun getValue(key: String): String {
        val ai: ApplicationInfo = context.packageManager
            .getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
        return ai.metaData.getString(key, EMPTY_STRING)
    }
}