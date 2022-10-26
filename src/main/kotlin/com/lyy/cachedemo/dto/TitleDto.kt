/*
File: TitleDto.kt
Author: Kelvin LYY
Summary: Representation of Title object in TitleResponse

*/

package com.lyy.cachedemo.dto

data class TitleDto(
    val title_name: String = "",
    val overview: String = "",
    val poster_path: String = "",
    val vote_count: Long = 0,
    val vote_average: Double = 0.0,
)
