package com.claire.unsplash.ui.explore

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.FilterVintage
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.claire.unsplash.R
import com.claire.unsplash.ui.theme.white
import com.google.accompanist.insets.ui.TopAppBar

@Composable
fun MyAppbar() {

    // We use TopAppBar from accompanist-insets-ui which allows us to provide
    // content padding matching the system bars insets.
    TopAppBar(
        modifier = Modifier.statusBarsPadding(),
        title = {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(id = R.string.app_name),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = white
            )
        },
        backgroundColor = Color.Transparent,
        navigationIcon = {
            Icon(
                Icons.TwoTone.FilterVintage,
                contentDescription = null,
                modifier = Modifier.padding(start = 16.dp)
            )
        },
        elevation = 0.dp
    )
}

@Preview("default")
@Preview("dark theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun MyAppbarPreview() {
    MyAppbar()
}