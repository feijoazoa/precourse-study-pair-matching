package pairmatching.view

import camp.nextstep.edu.missionutils.Console
import pairmatching.validation.Validation

class InputView {
    private val validation = Validation()

    fun getService(): String {
        val userInput = Console.readLine()
        validation.validateServiceOption(userInput)
        return userInput
    }

    fun getCurriculum(): List<String> {
        val userInput = Console.readLine()
        validation.validateCurriculumInput(userInput)
        return userInput.split(", ")
    }
}

/*
fun getService(): String {
        try {
            val userInput = Console.readLine()
            validation.validateServiceOption(userInput)
            return UserInput
        } catch (e: IllegalArgumentException) {
            throw e
        }
    }
 */