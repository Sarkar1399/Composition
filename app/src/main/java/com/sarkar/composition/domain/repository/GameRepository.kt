package com.sarkar.composition.domain.repository

import com.sarkar.composition.domain.entity.GameSettings
import com.sarkar.composition.domain.entity.Level
import com.sarkar.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings

}