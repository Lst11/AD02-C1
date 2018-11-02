package com.gmail.superarch.presentation.screen.person.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/gmail/superarch/presentation/screen/person/details/PersonDetailsViewModel;", "Lcom/gmail/superarch/presentation/base/BaseViewModel;", "Lcom/gmail/superarch/presentation/screen/person/PersonRouter;", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "imageUrl", "Landroid/databinding/ObservableField;", "getImageUrl", "()Landroid/databinding/ObservableField;", "setImageUrl", "(Landroid/databinding/ObservableField;)V", "isProgressEnabled", "Landroid/databinding/ObservableBoolean;", "()Landroid/databinding/ObservableBoolean;", "name", "getName", "setName", "studentId", "surname", "getSurname", "setSurname", "useCases", "Lcom/gmail/superarch/fuctories/UseCaseProvider;", "onClickDelete", "", "onClickSave", "setStudentId", "presentation_debug"})
public final class PersonDetailsViewModel extends com.gmail.superarch.presentation.base.BaseViewModel<com.gmail.superarch.presentation.screen.person.PersonRouter> {
    private final com.gmail.superarch.fuctories.UseCaseProvider useCases = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean isProgressEnabled = null;
    private java.lang.String studentId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<java.lang.String> name;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<java.lang.String> surname;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<java.lang.String> imageUrl;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean isProgressEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getSurname() {
        return null;
    }
    
    public final void setSurname(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getImageUrl() {
        return null;
    }
    
    public final void setImageUrl(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<java.lang.String> p0) {
    }
    
    public final void setStudentId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void onClickSave() {
    }
    
    public final void onClickDelete() {
    }
    
    public PersonDetailsViewModel() {
        super();
    }
}