package app.edmeproject

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.edmeproject.ui.theme.EdmeProjectTheme

@Composable
fun Account() {
    Column {
        Text(text = stringResource(R.string.personal_area),
            modifier = Modifier.padding(all = 8.dp).fillMaxWidth(),
            fontSize = 48.sp,
            textAlign = TextAlign.Center)
        Text(text = "Это ваш профиль, здесь вы можете просто расслабиться на некоторое время ",
            modifier = Modifier.padding(all = 8.dp).fillMaxSize(),
            fontSize = 32.sp,
            textAlign = TextAlign.Center)
    }
}

@Composable
@Preview(name = "LightAccountPreview")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "DarkAccountPreview"
)
fun AccountPreview() {
    EdmeProjectTheme {
        Account()
    }
}
