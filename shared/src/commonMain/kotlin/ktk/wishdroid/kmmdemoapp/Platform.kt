package ktk.wishdroid.kmmdemoapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform