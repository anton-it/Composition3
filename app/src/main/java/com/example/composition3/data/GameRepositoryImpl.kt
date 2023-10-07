package com.example.composition3.data

import com.example.composition3.domain.entity.GameSettings
import com.example.composition3.domain.entity.Level
import com.example.composition3.domain.entity.Questions
import com.example.composition3.domain.repositoriy.GameRepository
import java.lang.Integer.max
import java.lang.Math.min
import kotlin.random.Random

object GameRepositoryImpl: GameRepository {

    const val MIN_SUM_VALUE = 2
    const val MIN_ANSWER_VALUE = 1
    override fun generateQuestions(maxSumValue: Int, countOfOptions: Int): Questions {
        // генерим значение суммы в кружке
        val sum = Random.nextInt(MIN_SUM_VALUE, maxSumValue + 1)
        // генерим видимый вариант ответа в левом квадрате
        val visibleNumber = Random.nextInt(MIN_ANSWER_VALUE, sum)
        // создает коллекцию HashSet для вариантов ответов. HashSet для того чтобы небыло повторяющихся значений
        val options = HashSet<Int>()
        //получаем правильный ответ
        val rightAnswer = sum - visibleNumber
        // кладем праввильный ответ в коллекцию options
        options.add(rightAnswer)
        // до тех пор пока кол-во вариантов не равно данному колличеству countOfOptions продолжаем генерировать варианты ответов
        // определяем диапазон в котором будем генерировать
        val from = max(rightAnswer - countOfOptions, MIN_ANSWER_VALUE)
        val to = min(maxSumValue, rightAnswer + countOfOptions)
        // далее нужно генирировать ответы пока размер коллекции options не будет равер числу countOfOptions
        while (options.size > countOfOptions) {
            options.add(Random.nextInt(from, to))
        }
        return  Questions(sum, visibleNumber, options.toList())
    }

    override fun getGameSettings(level: Level): GameSettings {
        return when (level) {
            Level.TEST -> {
                GameSettings(
                    10,
                    3,
                    50,
                    8
                )
            }
            Level.EASY -> {
                GameSettings(
                    10,
                    10,
                    70,
                    60
                )
            }
            Level.NORMAL -> {
                GameSettings(
                    20,
                    20,
                    80,
                    40
                )
            }
            Level.HARD -> {
                GameSettings(
                    30,
                    30,
                    90,
                    40
                )
            }
        }
    }
}