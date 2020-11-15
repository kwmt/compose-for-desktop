import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource

@Composable
fun SampleImage() {

    Image(
        asset = imageResource("images/sample.png"),
        modifier = Modifier.fillMaxSize()
    )
}