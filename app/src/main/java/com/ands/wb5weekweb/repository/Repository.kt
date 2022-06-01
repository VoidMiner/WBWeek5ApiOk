package com.ands.wb5weekweb.repository

import com.ands.wb5weekweb.model.tinder.Cat
import com.ands.wb5weekweb.model.heroes.SuperHeroesResponse
import com.ands.wb5weekweb.model.tinder.LikedCats
import com.ands.wb5weekweb.model.tinder.VoteRequest
import com.ands.wb5weekweb.model.tinder.VoteResponse
import retrofit2.Response


interface Repository {

    suspend fun getSuperHeroes(): Response<List<SuperHeroesResponse>>

    suspend fun createVote(voteRequest: VoteRequest): Response<VoteResponse>

    suspend fun getCat(): Response<List<Cat>>

    suspend fun getLiked(subId: String): Response<List<LikedCats>>

    suspend fun getCatKtor(): List<Cat>

    suspend fun getLikedKtor(subId: String): List<LikedCats>

}