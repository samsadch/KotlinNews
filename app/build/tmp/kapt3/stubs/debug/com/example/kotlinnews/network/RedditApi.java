package com.example.kotlinnews.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/example/kotlinnews/network/RedditApi;", "", "getData", "Lkotlinx/coroutines/Deferred;", "Lcom/example/kotlinnews/network/ModelResponse;", "app_debug"})
public abstract interface RedditApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "r/kotlin/.json")
    public abstract kotlinx.coroutines.Deferred<com.example.kotlinnews.network.ModelResponse> getData();
}