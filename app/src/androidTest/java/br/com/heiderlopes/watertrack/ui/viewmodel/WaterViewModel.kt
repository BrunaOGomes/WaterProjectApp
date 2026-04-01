package br.com.heiderlopes.watertrack.ui.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import br.com.heiderlopes.watertrack.ui.state.WaterUiState

class WaterViewModel : ViewModel() {
    var uiState by mutableStateOf(WaterUiState())
    private set
    fun drinkOneCup() {
        if (uiState.cupsDrunk < uiState.goalCups) {
            uiState = uiState.copy(cupsDrunk = uiState.cupsDrunk + 1)
        }
    }
    fun removeOneCup() {
        if (uiState.cupsDrunk > 0) {
            uiState = uiState.copy(cupsDrunk = uiState.cupsDrunk - 1)
        }
    }
    fun reset() {
        uiState = uiState.copy(cupsDrunk = 0)
    }
}