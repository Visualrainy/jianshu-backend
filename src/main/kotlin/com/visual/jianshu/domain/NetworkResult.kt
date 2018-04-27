package com.visual.jianshu.domain

sealed class NetworkResult
data class Success(val result: String): NetworkResult()
data class Failure(val error: String): NetworkResult()