package com.example.kotlinnews.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005J\u0006\u0010\u0019\u001a\u00020\u0017J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/kotlinnews/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_navigateToSelectedProperty", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/kotlinnews/network/Children;", "_responses", "", "_status", "Lcom/example/kotlinnews/ui/main/ApiStatus;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "navigateToSelectedProperty", "Landroidx/lifecycle/LiveData;", "getNavigateToSelectedProperty", "()Landroidx/lifecycle/LiveData;", "responses", "getResponses", "status", "getStatus", "viewModelJob", "Lkotlinx/coroutines/Job;", "displayPropertyDetails", "", "marsProperty", "displayPropertyDetailsComplete", "getData", "onCleared", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private kotlinx.coroutines.Job viewModelJob;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private final androidx.lifecycle.MutableLiveData<com.example.kotlinnews.ui.main.ApiStatus> _status = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.kotlinnews.network.Children>> _responses = null;
    private final androidx.lifecycle.MutableLiveData<com.example.kotlinnews.network.Children> _navigateToSelectedProperty = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.kotlinnews.ui.main.ApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.kotlinnews.network.Children>> getResponses() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.kotlinnews.network.Children> getNavigateToSelectedProperty() {
        return null;
    }
    
    private final void getData() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void displayPropertyDetails(@org.jetbrains.annotations.NotNull()
    com.example.kotlinnews.network.Children marsProperty) {
    }
    
    public final void displayPropertyDetailsComplete() {
    }
    
    public MainViewModel() {
        super();
    }
}