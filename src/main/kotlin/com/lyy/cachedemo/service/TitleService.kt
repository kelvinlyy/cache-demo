package com.lyy.cachedemo.service

import com.lyy.cachedemo.dto.TitleResponse

interface TitleService {
    fun getTrendingTitles(): TitleResponse
}