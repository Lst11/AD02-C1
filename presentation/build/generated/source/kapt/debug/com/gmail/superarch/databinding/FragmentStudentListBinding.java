package com.gmail.superarch.databinding;
import com.gmail.superarch.R;
import com.gmail.superarch.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentStudentListBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchEditText, 4);
    }
    // views
    @NonNull
    public final android.support.design.widget.FloatingActionButton fab;
    @NonNull
    public final android.support.v7.widget.RecyclerView listRecyclerView;
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    public final android.widget.ProgressBar progresssBar;
    @NonNull
    public final android.widget.EditText searchEditText;
    // variables
    @Nullable
    private com.gmail.superarch.presentation.screen.person.list.StudentListViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStudentListBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.fab = (android.support.design.widget.FloatingActionButton) bindings[3];
        this.fab.setTag(null);
        this.listRecyclerView = (android.support.v7.widget.RecyclerView) bindings[1];
        this.listRecyclerView.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progresssBar = (android.widget.ProgressBar) bindings[2];
        this.progresssBar.setTag(null);
        this.searchEditText = (android.widget.EditText) bindings[4];
        setRootTag(root);
        // listeners
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.gmail.superarch.presentation.screen.person.list.StudentListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.gmail.superarch.presentation.screen.person.list.StudentListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.gmail.superarch.presentation.screen.person.list.StudentListViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsProgressEnabled((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsProgressEnabled(android.databinding.ObservableBoolean ViewModelIsProgressEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean viewModelIsProgressEnabledGet = false;
        boolean viewModelIsProgressEnabled = false;
        android.databinding.ObservableBoolean ViewModelIsProgressEnabled1 = null;
        com.gmail.superarch.presentation.screen.person.list.StudentListViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.isProgressEnabled
                    ViewModelIsProgressEnabled1 = viewModel.isProgressEnabled();
                }
                updateRegistration(0, ViewModelIsProgressEnabled1);


                if (ViewModelIsProgressEnabled1 != null) {
                    // read viewModel.isProgressEnabled.get()
                    viewModelIsProgressEnabledGet = ViewModelIsProgressEnabled1.get();
                }


                // read !viewModel.isProgressEnabled.get()
                viewModelIsProgressEnabled = !viewModelIsProgressEnabledGet;
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.fab.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.gmail.superarch.presentation.utils.DataBindingAdaptersKt.visibility(this.listRecyclerView, viewModelIsProgressEnabled);
            com.gmail.superarch.presentation.utils.DataBindingAdaptersKt.visibility(this.progresssBar, viewModelIsProgressEnabledGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.gmail.superarch.presentation.screen.person.list.StudentListViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onClickAdd();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static FragmentStudentListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentStudentListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<FragmentStudentListBinding>inflate(inflater, com.gmail.superarch.R.layout.fragment_student_list, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static FragmentStudentListBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentStudentListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.gmail.superarch.R.layout.fragment_student_list, null, false), bindingComponent);
    }
    @NonNull
    public static FragmentStudentListBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentStudentListBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_student_list_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentStudentListBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.isProgressEnabled
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}