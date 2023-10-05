package com.example.composition3.domain.entity

data class GameSettings (

    val maxSumValue: Int, //макс возможное значение
    val minCountOfRightAnswers: Int, //минимальное кол во правильных ответов для победы
    val minPercentRightAnswers: Int, //минимальный процент правильных ответов
    val gemaTimeInSeconds: Int//время игры в секундах
)