package pairmatching.validation

import pairmatching.model.Service

class Validation {
    fun validateServiceOption(input: String) {
        require(input in Service.options()) {throw IllegalArgumentException("[ERROR] 기능 선택은 1, 2, 3, Q 중에서 선택해 주세요.")}
    }

    fun validateCurriculumInput(input: String) {
        val inputs = input.split(", ")
        require(inputs.size == 3) {throw IllegalArgumentException("과정, 레벨, 미션 모두 선택해 주세요.")}
        require()
    }
}