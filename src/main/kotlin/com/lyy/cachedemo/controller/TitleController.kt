package com.lyy.cachedemo.controller

import com.lyy.cachedemo.dto.TitleResponse

interface TitleController {
    fun getTrendingTitles(): TitleResponse
}