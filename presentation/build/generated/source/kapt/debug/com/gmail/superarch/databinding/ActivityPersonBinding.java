package com.gmail.superarch.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityPersonBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.FrameLayout container;
    @Nullable
    public final android.widget.FrameLayout containerDetails;
    // variables
    protected com.gmail.superarch.presentation.screen.person.PersonViewModel mViewModel;
    protected ActivityPersonBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.FrameLayout container1
        , android.widget.FrameLayout containerDetails1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.container = container1;
        this.containerDetails = containerDetails1;
    }
    //getters and abstract setters
    public abstract void setViewModel(@Nullable com.gmail.superarch.presentation.screen.person.PersonViewModel ViewModel);
    @Nullable
    public com.gmail.superarch.presentation.screen.person.PersonViewModel getViewModel() {
        return mViewModel;
    }
    @NonNull
    public static ActivityPersonBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityPersonBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityPersonBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityPersonBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityPersonBinding>inflate(inflater, com.gmail.superarch.R.layout.activity_person, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityPersonBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityPersonBinding>inflate(inflater, com.gmail.superarch.R.layout.activity_person, null, false, bindingComponent);
    }
    @NonNull
    public static ActivityPersonBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ActivityPersonBinding)bind(bindingComponent, view, com.gmail.superarch.R.layout.activity_person);
    }
}