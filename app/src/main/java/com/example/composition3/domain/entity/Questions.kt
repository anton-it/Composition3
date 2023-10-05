package com.example.composition3.domain.entity


// Класс с вопросом.
//Класс  будет содержать сумму чисел которую нужно получить, видимый номер, и варианты ответов
data class Questions (

    val sum: Int, //значение суммы в кружке
    val visibleNumber: Int, //левое число в квандарте
    val options: List<Int> //варианты ответов
)