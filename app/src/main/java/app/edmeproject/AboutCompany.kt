package app.edmeproject

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.edmeproject.ui.theme.EdmeProjectTheme

const val ABOUT_COMPANY = "EDME"

@Composable
fun AboutCompany() {
    LazyColumn {
        item {
            Text(text = stringResource(R.string.about_edme),
                modifier = Modifier.padding(all = 8.dp),
                fontSize = 48.sp,
                textAlign = TextAlign.Center)
        }
        item {
            Text(text = ABOUT_COMPANY,
                modifier = Modifier.padding(all = 8.dp),
                fontSize = 24.sp,
                textAlign = TextAlign.Start)
        }
    }
}

@Composable
@Preview(name = "LightAboutCompanyPreview")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "DarkAboutCompanyPreview"
)
fun AboutCompanyPreview() {
    EdmeProjectTheme {
        AboutCompany()
    }
}