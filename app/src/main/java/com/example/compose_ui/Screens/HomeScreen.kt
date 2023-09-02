package com.example.compose_ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_ui.ui.theme.Accent
import com.example.compose_ui.ui.theme.Primary

@Composable
fun HomeScreen() {

	Column(
		modifier = Modifier
			.padding(10.dp)
			.fillMaxSize()
	) {
		Row(
			modifier = Modifier
				.clip(RoundedCornerShape(25.dp))
				.background(Accent)
				.padding(20.dp)


		) {
			Image(
				modifier = Modifier
					.clip(RoundedCornerShape(20.dp))
					.width(80.dp)
					.height(80.dp),
				painter = painterResource(id = R.drawable.shield), contentDescription = null
			)
			Spacer(modifier = Modifier.width(10.dp))
			Column {
				Text(
					style = TextStyle(
						fontSize = 14.sp,
						color = Color.LightGray
					),
					text = "Sanket Gawande"
				)
				Text(
					style = TextStyle(
						fontSize = 24.sp,
						fontWeight = FontWeight.Bold,
						color = Color.White
					),
					text = "Control Policy"
				)
				Text(
					style = TextStyle(
						fontSize = 17.sp,
						color = Primary
					),
					text = "This is some long text to add some extra content in the card."
				)
			}
		}

		Column(
			modifier = Modifier
				.padding(0.dp, 30.dp)
		) {
			for (s in Status) {
				Row(
					modifier =
					Modifier
						.fillMaxWidth()
						.clip(RoundedCornerShape(15.dp))
						.background(MaterialTheme.colorScheme.secondary)
						.padding(20.dp, 25.dp),
					verticalAlignment = Alignment.CenterVertically
				) {
					Icon(
						imageVector = s.icon,
						contentDescription = null,
						tint = Primary
					)
					Spacer(modifier = Modifier.width(8.dp))
					Text(
						style = TextStyle(
							fontSize = 20.sp,
							color = Color.White,
							fontWeight = FontWeight.Medium
						),
						text = s.title
					)
				}
				Spacer(modifier = Modifier.height(15.dp))
			}

		}

		Row(
			modifier = Modifier
				.fillMaxWidth()
		) {
			Column(
				modifier = Modifier
					.weight(0.5f)
					.clip(RoundedCornerShape(25.dp))
					.background(MaterialTheme.colorScheme.secondary)
					.padding(10.dp, 20.dp),
				verticalArrangement = Arrangement.Center,
				horizontalAlignment = Alignment.CenterHorizontally

			) {
				Icon(
					imageVector = Icons.Outlined.CheckCircle,
					contentDescription = null,
					tint = Primary,
				)
				Text(
					text = "Security Check",
					style = TextStyle(
						color = Color.White,
						fontSize = 12.sp
					)
				)
			}
			Spacer(modifier = Modifier.width(20.dp))
			Column(
				modifier = Modifier
					.weight(0.5f)
					.clip(RoundedCornerShape(25.dp))
					.background(MaterialTheme.colorScheme.secondary)
					.padding(10.dp, 20.dp),
				verticalArrangement = Arrangement.Center,
				horizontalAlignment = Alignment.CenterHorizontally

			) {
				Icon(
					imageVector = Icons.Outlined.Settings,
					contentDescription = null,
					tint = Primary,
				)
				Text(
					text = "Dashboard Privacy",
					style = TextStyle(
						color = Color.White,
						fontSize = 12.sp
					)
				)
			}
		}
	}
}


data class StatusType(
	val title: String,
	val icon: ImageVector
)

val Status = listOf<StatusType>(
	StatusType(
		icon = Icons.Default.Lock,
		title = "Security"
	),
	StatusType(
		icon = Icons.Default.Phone,
		title = "Network"
	),
	StatusType(
		icon = Icons.Default.Build,
		title = "Robust"
	),
	StatusType(
		icon = Icons.Default.DateRange,
		title = "Reliable"
	),
)
