package com.lyy.cachedemo.controller

import com.lyy.cachedemo.controller.TitleControllerImpl.Companion.FETCH_BASE_URL
import com.lyy.cachedemo.dto.TitleResponse
import com.lyy.cachedemo.service.TitleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(value = [FETCH_BASE_URL])
class TitleControllerImpl(
    private val titleService: TitleService
) : TitleController {
    @GetMapping("/trending")
    override fun getTrendingTitles(): TitleResponse {
        return titleService.getTrendingTitles()
    }

    companion object {
        const val FETCH_BASE_URL = "/api/fetch"
    }
}