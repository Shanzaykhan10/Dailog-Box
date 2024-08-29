package com.project.dailogbox

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun AlertBox() {
    var isDialog by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { isDialog = true }) {
            Text(text = "Click Here")
        }
        if (isDialog === true) {
            AlertDialog(onDismissRequest = { /*TODO*/ },
                title = { Text(text = "Confirmation!") },
                text = { Text(text = "Are you sure you want to continue?") },
                modifier = Modifier.fillMaxWidth(),
                confirmButton = {
                    Button(onClick = { isDialog = false }) {
                        Text(text = "Confirm")
                    }
                    Button(onClick = { isDialog = false }) {
                        Text(text = "Cancel")
                    }
                }
            )
        }
    }
}




