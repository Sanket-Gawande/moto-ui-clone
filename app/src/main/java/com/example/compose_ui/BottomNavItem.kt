package com.example.compose_ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
	val title: String,
	val route: String,
	val icon: ImageVector
) {
	object Home : BottomNavItem(
		icon = Icons.Outlined.Home,
		title = "Home",
		route = "home"
	)
	object Profile : BottomNavItem(
		icon = Icons.Outlined.AccountCircle,
		title = "Profile",
		route = "profile"
	)
	object Settings : BottomNavItem(
		icon = Icons.Outlined.Settings,
		title = "Settings",
		route = "setting"
	)
}


