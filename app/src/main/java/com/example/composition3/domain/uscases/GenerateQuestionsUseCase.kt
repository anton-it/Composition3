package com.example.composition3.domain.uscases

import com.example.composition3.domain.entity.Questions
import com.example.composition3.domain.repositoriy.GameRepository

class GenerateQuestionsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(maxSumValue: Int): Questions? {

        return repository.generateQuestions(maxSumValue, 6)

    }

    private companion object {

        //кол-во вариантов ответов
        private const val COUNT_OF_OPTIONS = 6

    }
}