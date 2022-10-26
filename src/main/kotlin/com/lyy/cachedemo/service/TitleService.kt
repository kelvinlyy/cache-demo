/*
File: TitleService.kt
Author: Kelvin LYY
Summary: Interface of Title Service
Description: Interface of Title Service
            - get trending titles

*/

package com.lyy.cachedemo.service

import com.lyy.cachedemo.dto.TitleResponse

interface TitleService {
    fun getTrendingTitles(): TitleResponse
}