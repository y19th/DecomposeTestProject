package com.y19th.decomposetestproject

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.arkivanov.decompose.retainedComponent
import com.y19th.decomposetestproject.root.ui.RootScreen
import com.y19th.dextension.compose.ProvideContent
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.parameter.parametersOf

class MainActivity : ComponentActivity(), KoinComponent {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        getKoin().apply {
            declare<Context>(this@MainActivity)
        }

        val root = retainedComponent {
            get<RootScreen> { parametersOf(it) }
        }

        setContent {
            ProvideContent(root)
        }
    }
}