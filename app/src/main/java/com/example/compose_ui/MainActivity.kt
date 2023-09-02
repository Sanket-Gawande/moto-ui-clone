package com.example.compose_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.compose_ui.ui.theme.ComposeuiTheme
import com.example.compose_ui.ui.theme.Primary

class MainActivity : ComponentActivity() {
	@OptIn(ExperimentalMaterial3Api::class)
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			ComposeuiTheme {
				// A surface container using the 'background' color from the theme
				var navController = rememberNavController()
				val navs = listOf<BottomNavItem>(
					BottomNavItem.Home,
					BottomNavItem.Settings,
					BottomNavItem.Profile,
				)

				Surface(
					modifier = Modifier
						.fillMaxSize()
						.background(MaterialTheme.colorScheme.primary),
					color = MaterialTheme.colorScheme.primary
				) {

					Scaffold(

						topBar = {
							Row(
								modifier = Modifier
									.fillMaxWidth()
									.background(MaterialTheme.colorScheme.primary)
									.padding(20.dp),
								verticalAlignment = Alignment.CenterVertically
							)
							{
								Icon(
									tint = Color.White,
									imageVector = Icons.Sharp.Menu, contentDescription = "Menu",
									modifier = Modifier.clickable {
										println("Open Drawer")
									}
								)
								Image(
									painter = painterResource(id = R.drawable.moto), contentDescription = null,
									modifier = Modifier
										.size(40.dp)
										.weight(1f)
										.clip(shape = CircleShape)

								)
							}
						},
						bottomBar = {
							Row(
								modifier = Modifier
									.fillMaxWidth()
									.background(MaterialTheme.colorScheme.secondary)
									.padding(10.dp, 5.dp),
								horizontalArrangement = Arrangement.SpaceBetween
							) {
								for (nav in navs) {
									Button(
										onClick = {
											navController.navigate(nav.route)
										},
									)
									{
										Icon(
											imageVector = nav.icon,
											contentDescription = nav.title,
											tint = Primary
										)
										Spacer(modifier = Modifier.width(10.dp))
										Text(text = nav.title)
									}
								}
							}

						}
					) { p ->
						Column(
							modifier = Modifier
								.padding(paddingValues = p)
								.background(MaterialTheme.colorScheme.primary)
						) {
							Navigation(navController)
						}

					}

				}
			}
		}
	}
}

