/*
File: TitleResponse.kt
Author: Kelvin LYY
Summary: Representation of Title Response object returned from fetching TMDB data

*/

package com.lyy.cachedemo.dto

data class TitleResponse(
    val results: List<TitleDto> = listOf()
)
