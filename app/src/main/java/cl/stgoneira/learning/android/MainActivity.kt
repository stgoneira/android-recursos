package cl.stgoneira.learning.android

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cl.stgoneira.learning.android.ui.theme.MultilenguajeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bienvenida = getString(R.string.saludo)

        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable {
                        val intent = Intent(this@MainActivity, MainActivity2::class.java)
                        startActivity(intent)
                    },
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.mslogo),
                    contentDescription = "Logo Microsoft"
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(bienvenida)
            }
        }
    }
}
