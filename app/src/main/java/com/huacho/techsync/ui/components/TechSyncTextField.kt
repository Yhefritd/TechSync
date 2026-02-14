package com.huacho.techsync.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.huacho.techsync.ui.theme.NeutralGray
import com.huacho.techsync.ui.theme.SoftGray

@Composable
fun TechSyncOutlineTextField(
    value: String,
    onValueChange: (String) -> Unit,
    labelText: String,
    leadingIconResId: Int? = null,
    leadingContDescr: String? = null,
    trailingIconResId: Int? = null,
    trailingContDescr: String? = null
) {

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = labelText) },
        shape = RoundedCornerShape(35),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = SoftGray,
            unfocusedBorderColor = SoftGray,
            focusedLabelColor = NeutralGray,
            cursorColor = SoftGray
        ),
        modifier = Modifier.fillMaxWidth(),
        leadingIcon = if (leadingIconResId != null) {
            {
                TechSyncIcon(
                    iconResId = leadingIconResId,
                    contentDescription = leadingContDescr
                )
            }
        } else {
            null
        },
        trailingIcon = if (trailingIconResId != null) {
            {
                TechSyncIcon(
                    iconResId = trailingIconResId,
                    contentDescription = trailingContDescr,
                    offset = (-8).dp
                )
            }
        } else {
            null
        }
    )
}