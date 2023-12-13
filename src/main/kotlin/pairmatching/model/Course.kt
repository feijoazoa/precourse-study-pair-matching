package pairmatching.model

enum class Course(private val value: String) {
    FRONTEND("프론트엔드"),
    BACKEND("백엔드");


    companion object {
        private const val COURSE = "과정"
        private const val SECTION = " | "

        fun names() = listOf(FRONTEND.value, BACKEND.value)
        fun getCourseNames(): StringBuilder {
            val stringBuilder = StringBuilder()
            stringBuilder.append(COURSE)
            stringBuilder.append(BACKEND.value)
            stringBuilder.append(SECTION)
            stringBuilder.append(FRONTEND)
            return stringBuilder
        }
    }
}