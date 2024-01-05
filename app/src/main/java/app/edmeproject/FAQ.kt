package app.edmeproject

import android.content.res.Configuration
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.edmeproject.ui.theme.EdmeProjectTheme


const val FAQ_COMPANY = "Здесь написать текст нашего faq"

@Composable
fun FAQ() {
    LazyColumn {
        item {
            Text(text = stringResource(R.string.faq),
                modifier = Modifier.padding(all = 8.dp),
                fontSize = 48.sp,
                textAlign = TextAlign.Center)
        }
        item {
            Text(text = FAQ_COMPANY,
                modifier = Modifier.padding(all = 8.dp),
                fontSize = 24.sp,
                textAlign = TextAlign.Start)
        }
    }
}

@Composable
@Preview(name = "LightFAQPreview")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "DarkFAQPreview"
)
fun FAQPreview() {
    EdmeProjectTheme {
        FAQ()
    }
}
