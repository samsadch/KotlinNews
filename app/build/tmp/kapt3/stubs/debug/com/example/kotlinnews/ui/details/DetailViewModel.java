package com.example.kotlinnews.ui.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/example/kotlinnews/ui/details/DetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "marsProperty", "Lcom/example/kotlinnews/network/Children;", "app", "Landroid/app/Application;", "(Lcom/example/kotlinnews/network/Children;Landroid/app/Application;)V", "_selectedChild", "Landroidx/lifecycle/MutableLiveData;", "displayChildTitle", "Landroidx/lifecycle/LiveData;", "", "getDisplayChildTitle", "()Landroidx/lifecycle/LiveData;", "selectedChild", "getSelectedChild", "onCleared", "", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.kotlinnews.network.Children> _selectedChild = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> displayChildTitle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.kotlinnews.network.Children> getSelectedChild() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getDisplayChildTitle() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kotlinnews.network.Children marsProperty, @org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}