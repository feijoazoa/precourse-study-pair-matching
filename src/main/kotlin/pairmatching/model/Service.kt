package pairmatching.model

enum class Service(private val choice: String, private val option: String) {
    FIRST("1","페어 매칭"),
    SECOND("2", "페어 조회"),
    THIRD("3","페어 초기화"),
    QUIT("Q", "종료"); // after the last enum entry or } to close enum class body

    fun getChoice() = this.choice

    companion object {
        fun options() = listOf(FIRST.choice, SECOND.choice, THIRD.choice, QUIT.choice)

        fun getOptions(): StringBuilder {
            val stringBuilder = StringBuilder()
            for(service in Service.values()) {
                stringBuilder.append(service.choice)
                stringBuilder.append(". ")
                stringBuilder.append(service.option)
                stringBuilder.append("\n")
            }
            return stringBuilder
        }
    }
}