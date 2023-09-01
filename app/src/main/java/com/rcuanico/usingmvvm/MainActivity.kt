package com.rcuanico.usingmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rcuanico.usingmvvm.ui.theme.UsingMVVMTheme

class MainActivity : ComponentActivity() {

    private val vm by viewModels<ContactsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UsingMVVMTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = vm.bgColor
                ) {
                    Button(onClick = {
                        vm.changeBgColor()
                    }) {
                        Text(text = "Change color")
                    }
                }
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
    UsingMVVMTheme {
        Greeting("Android")
    }
}