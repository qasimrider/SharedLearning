package com.learning.sharedlearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.learning.sharedlearning.ui.theme.SharedLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SharedLearningTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }

                AlertDialog(
                    containerColor = MaterialTheme.colorScheme.background,
                    text = {
                        Text(
                            text = "This is done",
                            modifier = Modifier
                                .background(MaterialTheme.colorScheme.background)
                                .fillMaxWidth()
                        )
                    },
                    onDismissRequest = { /*TODO*/ },
                    confirmButton = { /*TODO*/ })
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SharedLearningTheme {
        Greeting("Android")
    }
}