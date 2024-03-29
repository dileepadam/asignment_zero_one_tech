package com.damc.asignment_zero_one_tech.domain.models

import androidx.annotation.ColorInt
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class Users(
    @ColumnInfo(name = "username")
    var username: String,
    @ColumnInfo(name = "password")
    var password: String,
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    var userId: Int = 0
}
