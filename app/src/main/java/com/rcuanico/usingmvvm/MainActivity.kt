package com.rcuanico.usingmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.rcuanico.usingmvvm.ui.theme.UsingMVVMTheme

class MainActivity : ComponentActivity() {

//    private val vm by viewModels<ContactsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UsingMVVMTheme {

                val viewModel = viewModel<TryViewModel>()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = viewModel.bgColor
                ) {
                    Button(onClick = {
                        viewModel.changeBgColor()
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
        Greeting("Test MVVM")
    }
}