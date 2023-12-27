package com.example.consumerestapi.ui.theme.home.screen

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.consumerestapi.navigation.DestinasiNavigasi
import com.example.consumerestapi.ui.theme.home.viewmodel.HomeViewModel
import com.example.consumerestapi.ui.theme.theme.PenyediaViewModel

object DestinasiHome : DestinasiNavigasi {
    override val route = "home"
    override val titleRes = "Kontak"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navigateToItemEntry: () -> Unit,
    modifier: Modifier = Modifier,
    onDetailClick: (Int) -> Unit = {},
    viewModel: HomeViewModel = viewModel(factory = PenyediaViewModel.Factory)
){}