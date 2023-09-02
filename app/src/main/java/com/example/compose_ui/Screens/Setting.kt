package com.example.compose_ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Setting() {

	Column(
		modifier = Modifier
			.padding(10.dp)
			.fillMaxSize()
	) {
		Text(text = "Setting Screen")
		Text(text = "Setting Screen")
		Text(text = "Setting Screen")
		Text(text = "Setting Screen")
		Text(text = "Setting Screen")
		Text(text = "Setting Screen")

	}
}