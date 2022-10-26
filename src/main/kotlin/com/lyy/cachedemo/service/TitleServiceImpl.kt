package com.lyy.cachedemo.service

import com.lyy.cachedemo.dto.TitleResponse
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import java.lang.Exception

@Service
class TitleServiceImpl: TitleService {
    @Cacheable("trendingTitles")
    override fun getTrendingTitles(): TitleResponse {
        println("Cache reset: sending API request...")
        val webClient = WebClient.create()
        return webClient.get()
            .uri("https://api.themoviedb.org/3/trending/all/day?api_key=0e0aea27dc34eea8a9721445cebfed52")
            .retrieve()
            .bodyToMono(TitleResponse::class.java)
            .block() ?: throw Exception("wrong type")
    }
}