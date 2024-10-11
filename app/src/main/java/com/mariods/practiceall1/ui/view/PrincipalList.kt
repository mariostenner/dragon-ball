package com.mariods.practiceall1.ui.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewModelScope
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.mariods.practiceall1.data.model.DragonModel
import com.mariods.practiceall1.ui.viewmodel.DragonViewModel

//@Preview
@Composable
fun PrincipalList(dragonViewModel: DragonViewModel = DragonViewModel()) {
    var value: String = ""

    val list by dragonViewModel.dragonList.observeAsState(emptyList())

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 40.dp, horizontal = 10.dp),
    ) {
        items(list) { item ->
            ListItem(item, Modifier)
        }
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun ListItem(data: DragonModel, modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .border(
                BorderStroke(2.dp, Color.Black),
                RoundedCornerShape(16.dp)
            )
            .padding(10.dp)
    ) {
        GlideImage(
            model = data.image,
            contentDescription = "Image",
            modifier = modifier
                .fillMaxHeight()
                .padding(horizontal = 10.dp)
                .size(80.dp)
            //.background(Color.Red)
        )
        Column(
            modifier = modifier
                .padding(start = 20.dp)
                .fillMaxWidth()
        ) {
            Text(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue,
                text = data.name
            )
            Text(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(vertical = 2.dp),
                fontSize = 18.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Red, text = data.ki
            )
            Text(
                modifier = modifier
                    .fillMaxWidth(),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black, text = data.race
            )
            Text(
                modifier = modifier
                    .fillMaxWidth(),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black, text = data.gender
            )
            Text(
                modifier = modifier
                    .fillMaxWidth(),
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black, text = data.affiliation
            )
        }

    }
}