package com.sarkar.composition.domain.usecases

import com.sarkar.composition.domain.entity.GameSettings
import com.sarkar.composition.domain.entity.Level
import com.sarkar.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }

}