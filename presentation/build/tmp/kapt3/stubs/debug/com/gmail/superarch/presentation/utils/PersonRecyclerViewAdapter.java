package com.gmail.superarch.presentation.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/gmail/superarch/presentation/utils/PersonRecyclerViewAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/gmail/superarch/presentation/utils/PersonRecyclerViewAdapter$ViewHolder;", "()V", "items", "", "Lcom/gmail/name/domain/entity/Person;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "listener", "Lcom/gmail/superarch/presentation/utils/ClickListener;", "getListener", "()Lcom/gmail/superarch/presentation/utils/ClickListener;", "setListener", "(Lcom/gmail/superarch/presentation/utils/ClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "presentation_debug"})
public final class PersonRecyclerViewAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.gmail.superarch.presentation.utils.PersonRecyclerViewAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.gmail.superarch.presentation.utils.ClickListener listener;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.gmail.name.domain.entity.Person> items;
    
    @org.jetbrains.annotations.Nullable()
    public final com.gmail.superarch.presentation.utils.ClickListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.gmail.superarch.presentation.utils.ClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.gmail.name.domain.entity.Person> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.gmail.name.domain.entity.Person> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.gmail.superarch.presentation.utils.PersonRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.gmail.superarch.presentation.utils.PersonRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    public PersonRecyclerViewAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/gmail/superarch/presentation/utils/PersonRecyclerViewAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/gmail/superarch/presentation/utils/PersonRecyclerViewAdapter;Landroid/view/View;)V", "bind", "", "item", "Lcom/gmail/name/domain/entity/Person;", "presentation_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.gmail.name.domain.entity.Person item) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}