package com.example.composition3.domain.repositoriy

import com.example.composition3.domain.entity.GameSettings
import com.example.composition3.domain.entity.Level
import com.example.composition3.domain.entity.Questions
import java.util.PrimitiveIterator

interface GameRepository {

    fun generateQuestions(
        // максимальное значение которое нужно сгенерировать
        maxSumValue: Int,
        //кол-ыо вариантов ответов сколько их нужно генирировать
        countOfOptions: Int

    ): Questions

    fun getGameSettings(level: Level): GameSettings
}