package dej.jaime.cerda_jaime_p1.layaud

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Columnas() {

    Column(  horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 8.dp)
            .background(color = androidx.compose.ui.graphics.Color.Red)
            .fillMaxSize()
    )   {

        Text(text = "computacion movil ",
        )
        Text(text = "practica 1 ",
        )
        Text(text = "Jaime cerda",
        )
    }


}