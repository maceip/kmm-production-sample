package com.github.jetbrains.rssreader.composeapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale

@Composable
expect fun RemoteImage(
    imageUrl: String,
    contentDescription: String?,
    modifier: Modifier,
    alignment: Alignment,
    contentScale: ContentScale
)