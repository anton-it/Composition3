package com.example.composition3.domain.entity

import java.io.Serializable

data class GameResult (
    val winner: Boolean, //победили или нет
    val countOfRightAnswers: Int, //кол-во правильных ответов
    val countOfQuestions: Int, //кол-во вопросов на которое ответил юзер
    val gameSettings: GameSettings //настройки игры из них мы получим какое минимальное кол-во правильных ответов должно быть
): Serializable