package com.cleanmvvm.datasource.model

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GitHubRepository(

    @Json(name = "name")
    val name: String? = null,

    @Json(name = "description")
    val description: String? = null,

    @Json(name = "id")
    val id: Int? = null
) : Parcelable
