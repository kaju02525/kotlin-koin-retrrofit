package com.winds.kotlinkoindagger.network

object ApiConfig {
    //Response cache size for OkHTTP - 10 MB
    const val MAX_HTTP_CACHE_SIZE = 10 * 1024 * 1024.toLong()
    const val POSTS_API = "/demos"

    /**
     * all api specific response codes given from server side
     */
    interface ResponseCodes {
        companion object {
            const val SUCCESS = 200
            const val CONFLICT = 400
            const val AUTH_TOKEN_ERROR = 401
            const val FORBIDDEN = 403
            const val NOT_FOUND = 404
            const val VALIDATION = 422
            const val TOO_MANY_REQUEST = 429
            const val INTERNAL_SERVER = 500
        }
    }

    /**
     * network timeouts - in seconds
     */
    interface Timeouts {
        companion object {
            const val CONNECT = 30L
            const val READ = 60L
            const val WRITE = 60L
        }
    }
}