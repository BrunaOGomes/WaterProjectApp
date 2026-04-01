package br.com.heiderlopes.watertrack

data class WaterUiState(
    val cupsDrunk : Int = 0,
    val goalCups: Int = 8,
    val mlPerCup : Int = 200
) {

    val progress : Float
        get() = (cupsDrunk.toFloat() / goalCups.toFloat()).coerceIn(0f,1f)

    val isGoalReached: Boolean
        get() = cupsDrunk >= goalCups

    val remainingCups: Int
        get() = (goalCups - cupsDrunk)

    val totalMl: Int
        get() = cupsDrunk * mlPerCup


}