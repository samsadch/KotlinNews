package com.example.kotlinnews.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007\u001a\u001a\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001a\u0010\f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u00a8\u0006\u0012"}, d2 = {"bindImage", "", "imgView", "Landroid/widget/ImageView;", "imgUrl", "", "bindRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "Lcom/example/kotlinnews/network/Children;", "bindStatus", "statusImageView", "status", "Lcom/example/kotlinnews/ui/main/ApiStatus;", "progressBar", "Landroid/widget/ProgressBar;", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"listData"})
    public static final void bindRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kotlinnews.network.Children> data) {
    }
    
    /**
     * * Uses the Glide library to load an image by URL into an [ImageView]
     */
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void bindImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imgView, @org.jetbrains.annotations.Nullable()
    java.lang.String imgUrl) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"responseApiStatus"})
    public static final void bindStatus(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView statusImageView, @org.jetbrains.annotations.Nullable()
    com.example.kotlinnews.ui.main.ApiStatus status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"responseProgress"})
    public static final void bindStatus(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar progressBar, @org.jetbrains.annotations.Nullable()
    com.example.kotlinnews.ui.main.ApiStatus status) {
    }
}