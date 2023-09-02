package com.example.compose_ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation(navController: NavHostController) {
	NavHost(navController = navController, startDestination = BottomNavItem.Home.route) {
		composable(
			route = BottomNavItem.Home.route,
		) {
			HomeScreen()
		}

		composable(
			route = BottomNavItem.Settings.route,
		) {
			Setting()
		}

		composable(
			route = BottomNavItem.Profile.route,
		) {
			Profile()
		}
	}
}