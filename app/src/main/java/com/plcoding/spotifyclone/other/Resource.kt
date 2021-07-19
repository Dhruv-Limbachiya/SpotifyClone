package com.plcoding.spotifyclone.other

import com.plcoding.spotifyclone.data.model.Song

/**
 * Created by Dhruv Limbachiya on 15-07-2021.
 */

// A generic class that contains data and status about loading this data.
sealed class Resource<T>(
    data: T? = null,
    message: String? = null
) {
    class Success<T>(data: T?) : Resource<T>(data)
    class Loading<T>(data: T? = null) : Resource<T>(data)
    class Error<T>(data: T?, message: String?) : Resource<T>(data, message)
}

