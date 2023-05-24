package uz.gita.mr_smart.mycompose

import android.graphics.fonts.SystemFonts
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.gita.mr_smart.mycompose.ui.theme.MyComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    Message( ExampleData("O'tgan kunlar", "Bu joyda o'tgan kunlarni eslaymiz :)") )
                }
        }
    }

    @Composable
    fun Message(data: ExampleData){
        Column(Modifier.background(Color(R.color.ui1_background)).fillMaxSize()) {
            Box(Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_more_horiz_24),
                    contentDescription = "More_Button",
                    Modifier.fillMaxWidth().padding(0.dp, 16.dp, 16.dp, 0.dp),
                    Alignment.CenterEnd,
                )
            }
        }
    }

    @Preview(showSystemUi = true)
    @Composable
    fun MessagePreview() {
        Message(data = ExampleData("O'tgan kunlar", "haysldkfjasdfas"))
    }

data class ExampleData(
    val name: String,
    val body: String
)

