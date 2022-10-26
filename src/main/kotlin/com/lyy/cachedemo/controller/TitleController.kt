/*
File: TitleController.kt
Author: Kelvin LYY
Summary: Interface of Title Controller
Description: Interface of Title Controller
            - get trending titles

*/

package com.lyy.cachedemo.controller

import com.lyy.cachedemo.dto.TitleResponse

interface TitleController {
    fun getTrendingTitles(): TitleResponse
}