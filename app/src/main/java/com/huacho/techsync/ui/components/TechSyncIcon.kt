package com.huacho.techsync.ui.components

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun TechSyncIcon(
    iconResId: Int,
    contentDescription: String? = null,
    size: Dp = 24.dp,
    offset: Dp = 8.dp
) {
    Icon(
        painter = painterResource(id = iconResId),
        contentDescription = contentDescription,
        modifier = Modifier
            .size(size)
            .offset(offset)
    )
}