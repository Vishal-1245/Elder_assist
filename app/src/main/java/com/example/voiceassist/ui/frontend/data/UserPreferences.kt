package com.example.voiceassist.ui.frontend.data

import android.content.Context
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore by preferencesDataStore("voice_assist")

class UserPreferences(private val context: Context) {

    companion object {

        val NAME = stringPreferencesKey("name")

        val AGE = stringPreferencesKey("age")

        val EMERGENCY = stringPreferencesKey("emergency")

        val LANGUAGE = stringPreferencesKey("language")

        val FIRST_TIME = booleanPreferencesKey("first_time")

    }

    suspend fun saveUser(

        name:String,

        age:String,

        emergency:String,

        language:String

    ){

        context.dataStore.edit{

            it[NAME]=name

            it[AGE]=age

            it[EMERGENCY]=emergency

            it[LANGUAGE]=language

            it[FIRST_TIME]=false

        }

    }

    val userName: Flow<String> =
        context.dataStore.data.map {
            it[NAME] ?: ""
        }

    val userAge: Flow<String> =
        context.dataStore.data.map {
            it[AGE] ?: ""
        }

    val userEmergency: Flow<String> =
        context.dataStore.data.map {
            it[EMERGENCY] ?: ""
        }

    val userLanguage: Flow<String> =
        context.dataStore.data.map {
            it[LANGUAGE] ?: ""
        }

    val isFirstTime: Flow<Boolean> =
        context.dataStore.data.map {
            it[FIRST_TIME] ?: true
        }

}