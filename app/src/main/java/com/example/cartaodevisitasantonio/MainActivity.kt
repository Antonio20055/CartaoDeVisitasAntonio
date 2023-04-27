package com.example.cartaodevisitasantonio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodevisitasantonio.ui.theme.CartaoDeVisitasAntonioTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeVisitasAntonioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(242,58,64,95)
                ) {
                    PlanoDefundo()
                }
            }
        }
    }
}
@Preview
@Composable
fun PlanoDefundo (){

    Image(
        painter = painterResource(id = R.drawable.img_5),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
    Cabecalho()
    Rodape()
}

@Composable
fun Rodape() {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.padding(start = 50.dp)
    ) {
        Contato( 
            painter = painterResource(id = R.drawable.img_2),
            text = "(11) 12354-1234"
        )
        Contato(
            painter = painterResource(id =R.drawable.img_4 ),
            text = "finanças"
        )
        Contato(
            painter = painterResource(id = R.drawable.img_3),
            text = "bolsa de valores subindo"
        )
    }
}

@Composable
fun Contato(painter:Painter, text:String) {
    Row(
        modifier = Modifier.padding(top = 10.dp)
    ) {
        Image(
            painter =painter,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        Text(
            text =text,
            modifier = Modifier.padding(start = 10.dp)
        )
    }
}

@Composable
fun Cabecalho() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter =  painterResource(id =R.drawable.img),
            contentDescription = null,
            contentScale = ContentScale. Crop,
            modifier = Modifier
                .size(180.dp)
                .clip(CircleShape)

        )
        Text(
            text ="Antonio Lucas",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Text(
            text ="Empresario",
            fontSize = 20.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold

        )

    }
}
