package com.winds.kotlinkoindagger.network

object Const {

    var BASE_URL = "https://simplifiedcoding.net"

    var APP_VERSION = ""
    var DEVICE_OS = ""
    var DEVICE_Build = ""
    var WALLET_REDIRECT = false
    var BOOKMARK_REDIRECT = false
    var ORDER_REDIRECT = false
    var REFER_REDIRECT = false
    var GENERAL_REDIRECT = false
    var REWARD_REDIRECT = false
    var PROFILE_REDIRECT = false

    /**
     * all keys for shared preferences must be put here
     */
    interface SharedPrefs {
        companion object {
            const val KEY_TIMESTAMP = "key_timestamp"
            const val KEY_DUMMY_OBJECT = "key_dummy_object"
            const val KEY_USER_DATA = "key_user_data"
            const val KEY_MAINLIST_DATA = "key_mainlist_data"
            const val KEY_DEVICE_TOKEN = "key_device_token"
            const val KEY_IS_LOGIN = "isLogin"
        }
    }

    /**
     * all keys for bundle/intent extras must be put here
     */
    interface BundleExtras {
        companion object {
            const val DIALOG_TITLE = "dialog_title"
            const val ASSET_FILE_PATH = "asset_file_path"
        }
    }

    /**
     * all date time formats must be put here
     */
    interface DateTimeFormats {
        companion object {
            const val COMMON_DATE_TIME_FORMAT = "dd-MM-yyyy hh:mm:ss a"
            const val WINDS_COMMON_DATE_TIME_FORMAT = "yyyy-dd-MM hh:mm:ss"
            const val DEMO_FORMAT = "dd-MMM-yyyy hh:mm a"
            const val BIRTH_DATE_FORMAT = "MMM dd, yyyy"
            const val PARTNER_DATE_FORMAT = "dd MMM, yyyy"
            const val PARTNER_DATE_INPUT_FORMAT = "MMM dd,yyyy hh:mm a"
        }
    }

    /**
     * all time delays must be put here
     */
    interface Delays {
        companion object {
            const val MIN_TIME_BETWEEN_CLICKS: Long = 200
            //NEVER DO THIS in actual app, it is just for sample!
            const val ARTIFICIAL_LOADER_DELAY: Long = 2000
            const val NORMAL_LOCATION_UPDATE_INTERVAL: Long = 10000
            const val FASTEST_LOCATION_UPDATE_INTERVAL: Long = 8000
        }
    }
}