/*
File: TitleServiceImpl.kt
Author: Kelvin LYY
Summary: Implementation of Title Service
Description: Implementation of Title Service
            - get trending titles: fetch trending titles from TMDB and load into the format of TitleResponse

*/

package com.lyy.cachedemo.service

import com.lyy.cachedemo.dto.TitleResponse
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient

@Service
class TitleServiceImpl(
    private val API_KEY: String = System.getenv("api_key")
) : TitleService {
    @Cacheable("trendingTitles")
    override fun getTrendingTitles(): TitleResponse {
        println("Cache reset: sending API request...")
        val webClient = WebClient.create()
        return webClient.get()
            .uri("https://api.themoviedb.org/3/trending/all/day?api_key=$API_KEY")
            .retrieve()
            .bodyToMono(TitleResponse::class.java)
            .block() ?: throw Exception("wrong type")
    }
}