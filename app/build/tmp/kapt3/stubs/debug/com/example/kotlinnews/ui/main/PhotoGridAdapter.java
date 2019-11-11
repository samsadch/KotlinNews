package com.example.kotlinnews.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0012\u0013\u0014B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/kotlinnews/ui/main/PhotoGridAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/kotlinnews/network/Children;", "Lcom/example/kotlinnews/ui/main/PhotoGridAdapter$ViewHolder;", "onClickListener", "Lcom/example/kotlinnews/ui/main/PhotoGridAdapter$OnClickListener;", "(Lcom/example/kotlinnews/ui/main/PhotoGridAdapter$OnClickListener;)V", "getOnClickListener", "()Lcom/example/kotlinnews/ui/main/PhotoGridAdapter$OnClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "OnClickListener", "ViewHolder", "app_debug"})
public final class PhotoGridAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.kotlinnews.network.Children, com.example.kotlinnews.ui.main.PhotoGridAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.kotlinnews.ui.main.PhotoGridAdapter.OnClickListener onClickListener = null;
    public static final com.example.kotlinnews.ui.main.PhotoGridAdapter.DiffCallback DiffCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.kotlinnews.ui.main.PhotoGridAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.kotlinnews.ui.main.PhotoGridAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlinnews.ui.main.PhotoGridAdapter.OnClickListener getOnClickListener() {
        return null;
    }
    
    public PhotoGridAdapter(@org.jetbrains.annotations.NotNull()
    com.example.kotlinnews.ui.main.PhotoGridAdapter.OnClickListener onClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/kotlinnews/ui/main/PhotoGridAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/kotlinnews/databinding/GridViewItemBinding;", "(Lcom/example/kotlinnews/databinding/GridViewItemBinding;)V", "bind", "", "child", "Lcom/example/kotlinnews/network/Children;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.example.kotlinnews.databinding.GridViewItemBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.kotlinnews.network.Children child) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.kotlinnews.databinding.GridViewItemBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/example/kotlinnews/ui/main/PhotoGridAdapter$OnClickListener;", "", "clickListener", "Lkotlin/Function1;", "Lcom/example/kotlinnews/network/Children;", "Lkotlin/ParameterName;", "name", "marsProperty", "", "(Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "onClick", "app_debug"})
    public static final class OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.example.kotlinnews.network.Children, kotlin.Unit> clickListener = null;
        
        public final void onClick(@org.jetbrains.annotations.NotNull()
        com.example.kotlinnews.network.Children marsProperty) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<com.example.kotlinnews.network.Children, kotlin.Unit> getClickListener() {
            return null;
        }
        
        public OnClickListener(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.example.kotlinnews.network.Children, kotlin.Unit> clickListener) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/kotlinnews/ui/main/PhotoGridAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/kotlinnews/network/Children;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.kotlinnews.network.Children> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.kotlinnews.network.Children oldItem, @org.jetbrains.annotations.NotNull()
        com.example.kotlinnews.network.Children newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.kotlinnews.network.Children oldItem, @org.jetbrains.annotations.NotNull()
        com.example.kotlinnews.network.Children newItem) {
            return false;
        }
        
        private DiffCallback() {
            super();
        }
    }
}