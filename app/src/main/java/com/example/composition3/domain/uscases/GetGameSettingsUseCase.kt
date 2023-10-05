package com.example.composition3.domain.uscases

import com.example.composition3.domain.entity.GameSettings
import com.example.composition3.domain.entity.Level
import com.example.composition3.domain.repositoriy.GameRepository
import java.util.PrimitiveIterator

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}