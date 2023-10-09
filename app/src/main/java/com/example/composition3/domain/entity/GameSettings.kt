package com.example.composition3.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameSettings (

    val maxSumValue: Int, //макс возможное значение
    val minCountOfRightAnswers: Int, //минимальное кол во правильных ответов для победы
    val minPercentOfRightAnswers: Int, //минимальный процент правильных ответов
    val gameTimeInSeconds: Int//время игры в секундах
): Parcelable