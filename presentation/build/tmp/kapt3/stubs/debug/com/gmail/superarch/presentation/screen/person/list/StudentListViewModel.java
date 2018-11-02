package com.gmail.superarch.presentation.screen.person.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/gmail/superarch/presentation/screen/person/list/StudentListViewModel;", "Lcom/gmail/superarch/presentation/base/BaseViewModel;", "Lcom/gmail/superarch/presentation/screen/person/PersonRouter;", "()V", "adapter", "Lcom/gmail/superarch/presentation/utils/PersonRecyclerViewAdapter;", "getAdapter", "()Lcom/gmail/superarch/presentation/utils/PersonRecyclerViewAdapter;", "isProgressEnabled", "Landroid/databinding/ObservableBoolean;", "()Landroid/databinding/ObservableBoolean;", "listener", "com/gmail/superarch/presentation/screen/person/list/StudentListViewModel$listener$1", "Lcom/gmail/superarch/presentation/screen/person/list/StudentListViewModel$listener$1;", "searchStudentsUseCase", "Lcom/gmail/name/domain/usecases/SearchStudentsUseCase;", "studentListUseCase", "Lcom/gmail/name/domain/usecases/GetStudentsUseCase;", "onClickAdd", "", "search", "", "presentation_debug"})
public final class StudentListViewModel extends com.gmail.superarch.presentation.base.BaseViewModel<com.gmail.superarch.presentation.screen.person.PersonRouter> {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean isProgressEnabled = null;
    private final com.gmail.name.domain.usecases.GetStudentsUseCase studentListUseCase = null;
    private final com.gmail.name.domain.usecases.SearchStudentsUseCase searchStudentsUseCase = null;
    private final com.gmail.superarch.presentation.utils.ClickListener listener = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gmail.superarch.presentation.utils.PersonRecyclerViewAdapter adapter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean isProgressEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gmail.superarch.presentation.utils.PersonRecyclerViewAdapter getAdapter() {
        return null;
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    java.lang.String search) {
    }
    
    public final void onClickAdd() {
    }
    
    public StudentListViewModel() {
        super();
    }
}