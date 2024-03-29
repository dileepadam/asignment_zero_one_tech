package com.damc.asignment_zero_one_tech.data.local

import com.damc.asignment_zero_one_tech.data.local.room.OnDataBaseActions
import com.damc.asignment_zero_one_tech.domain.LocalRepostories
import com.damc.asignment_zero_one_tech.domain.models.Books
import com.damc.asignment_zero_one_tech.domain.models.Users

class LocalRepositoryImpl(val dataBase: OnDataBaseActions) : LocalRepostories {

    override suspend fun insertUser(users: Users) {
        try {
            dataBase.insertUser(users)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    override suspend fun isUsernameInDb(username: String): Int {
        try {
            return dataBase.isUsernameInDb(username)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return 100
    }

    override suspend fun userLogin(username: String, password: String): Users? {
        try {
            return dataBase.userLogin(username, password)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }

    override suspend fun getFavouriteBookCount(user_Id: Int): Int {
        try {
            return dataBase.getFavouriteBookCount(user_Id)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return 0
    }

    override suspend fun insertBook(books: Books) {
        try {
            dataBase.insertBook(books)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}