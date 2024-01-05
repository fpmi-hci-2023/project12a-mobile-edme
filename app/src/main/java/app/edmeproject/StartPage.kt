package app.edmeproject

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.edmeproject.ui.theme.EdmeProjectTheme

@Composable
fun InitialInformation() {
    Column(modifier = Modifier
        .padding(all = 8.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Welcome to Edme!",
            modifier = Modifier.padding(all = 8.dp),
            fontSize = 48.sp,
            textAlign = TextAlign.Center)
        Text(text = "Начнем взаимодействие с приложением.",
            modifier = Modifier.padding(all = 8.dp),
            fontSize = 28.sp,
            textAlign = TextAlign.Center)
        Text(text = "Для того чтобы начать проведите рукой слева направо.",
            modifier = Modifier.padding(all = 8.dp),
            fontSize = 28.sp,
            textAlign = TextAlign.Center)
        Icon(modifier = Modifier
            .padding(all = 8.dp)
            .defaultMinSize(64.dp, 64.dp),
            imageVector = Icons.Default.ArrowForward,
            contentDescription = stringResource(id = R.string.swipe_hint_image)
        )
    }
}

@Composable
@Preview(name = "LightInitialInformationPreview")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "DarkInitialInformationPreview"
)
fun InitialInformationPreview() {
    EdmeProjectTheme {
        InitialInformation()
    }
}