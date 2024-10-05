package io.alexander.doitnow.data

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager


object LoginState{
    const val PREF_USER_NAME: String = "username"

    fun getSharedPreferences(ctx: Context?): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(ctx)
    }

    fun setUserName(ctx: Context?, userName: String?) {
        val editor = getSharedPreferences(ctx).edit()
        editor.putString(PREF_USER_NAME, userName)
        editor.commit()
    }

    fun getUserName(ctx: Context?): String? {
        return getSharedPreferences(ctx).getString(PREF_USER_NAME, "")
    }
}