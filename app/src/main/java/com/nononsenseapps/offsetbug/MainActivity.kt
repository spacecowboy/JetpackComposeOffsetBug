package com.nononsenseapps.offsetbug

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nononsenseapps.offsetbug.ui.theme.OffsetBugTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OffsetBugTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text("OffsetBug")
                            },
                            actions = {
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(Icons.Default.MoreVert, contentDescription = "Action")
                                }
                            },
                            navigationIcon = {
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(Icons.Default.Menu, contentDescription = "Menu")
                                }
                            }
                        )
                    },
                    modifier = Modifier
                ) { paddingValues ->
//                    Box(
//                        contentAlignment = Alignment.Center,
//                        modififer = Modifier
//                            .padding(paddingValues)
//                            .fillMaxSize(),
//                    ) {
                    Text(
                        text = loremIpsum,
                        modifier = Modifier
                            .padding(paddingValues)
                            .padding(horizontal = 8.dp)
                    )
//                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    OffsetBugTheme {
        Greeting("Android")
    }
}

const val loremIpsum = """
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla rhoncus justo elit, eget posuere dolor varius ut. Nunc posuere felis quis purus consectetur, vitae venenatis eros maximus. Praesent bibendum egestas viverra. Nullam aliquam at libero quis cursus. In hac habitasse platea dictumst. Cras iaculis a mauris eu dictum. Quisque pulvinar metus in eros ultrices aliquam. Vivamus ex erat, facilisis eu tincidunt mollis, placerat at massa. Maecenas tristique sapien sit amet nibh efficitur imperdiet. Fusce non justo vitae magna ullamcorper rhoncus in ac eros. Mauris nulla diam, efficitur ultricies libero interdum, elementum dapibus elit. Nam sit amet elit quam. Sed eu tincidunt lacus. Etiam ut sagittis erat.

Duis id libero gravida, malesuada mi vel, gravida lorem. Donec ipsum sapien, convallis eu eleifend a, tincidunt ac diam. Nullam sagittis finibus tristique. Nullam sollicitudin, velit tristique aliquet aliquet, diam nisl semper diam, in dictum ex lacus nec quam. Nam tempor venenatis ipsum ut scelerisque. Praesent sit amet sollicitudin nunc. Duis sagittis, odio a lacinia interdum, nibh leo sagittis odio, a tincidunt ex velit ac arcu. Nullam accumsan dictum pellentesque. Cras ullamcorper ipsum a maximus aliquam. Maecenas pretium magna diam, quis rutrum libero euismod ut.

Vestibulum non auctor ipsum. Aliquam suscipit, libero ut interdum fermentum, ante eros imperdiet felis, eu dignissim enim nulla et lorem. Nulla et nisi scelerisque, fermentum diam sed, convallis ante. Curabitur id felis eros. In tempus, leo quis semper hendrerit, velit quam laoreet eros, vel pretium risus eros in nibh. Duis auctor, tortor ut pulvinar efficitur, ipsum nulla iaculis massa, nec egestas velit erat nec justo. Morbi tellus erat, pretium eget tortor quis, consectetur vestibulum nisl. Mauris non purus pellentesque, consectetur nulla vitae, semper sapien. Aenean imperdiet, urna ut malesuada varius, justo lectus consequat nisi, vel sollicitudin leo nulla at nulla. Sed a egestas diam. Vivamus consectetur dui ac commodo vulputate. Vestibulum ut mattis turpis. Sed vitae libero non nulla consequat laoreet ac at magna. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.
"""