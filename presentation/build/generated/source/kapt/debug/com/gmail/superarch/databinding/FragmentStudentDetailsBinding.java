package com.gmail.superarch.databinding;
import com.gmail.superarch.R;
import com.gmail.superarch.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentStudentDetailsBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.relativeLayout, 6);
    }
    // views
    @NonNull
    public final android.widget.Button detele;
    @NonNull
    public final android.widget.ImageView image;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final android.widget.EditText nameEditText;
    @NonNull
    public final android.widget.RelativeLayout relativeLayout;
    @NonNull
    public final android.widget.Button save;
    @NonNull
    public final android.widget.EditText surnameEditText;
    // variables
    @Nullable
    private com.gmail.superarch.presentation.screen.person.details.PersonDetailsViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener nameEditTextandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.name.get()
            //         is viewModel.name.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(nameEditText);
            // localize variables for thread safety
            // viewModel.name.get()
            java.lang.String viewModelNameGet = null;
            // viewModel.name != null
            boolean viewModelNameJavaLangObjectNull = false;
            // viewModel.name
            android.databinding.ObservableField<java.lang.String> viewModelName = null;
            // viewModel
            com.gmail.superarch.presentation.screen.person.details.PersonDetailsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelName = viewModel.getName();

                viewModelNameJavaLangObjectNull = (viewModelName) != (null);
                if (viewModelNameJavaLangObjectNull) {




                    viewModelName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener surnameEditTextandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.surname.get()
            //         is viewModel.surname.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(surnameEditText);
            // localize variables for thread safety
            // viewModel.surname
            android.databinding.ObservableField<java.lang.String> viewModelSurname = null;
            // viewModel.surname.get()
            java.lang.String viewModelSurnameGet = null;
            // viewModel
            com.gmail.superarch.presentation.screen.person.details.PersonDetailsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.surname != null
            boolean viewModelSurnameJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSurname = viewModel.getSurname();

                viewModelSurnameJavaLangObjectNull = (viewModelSurname) != (null);
                if (viewModelSurnameJavaLangObjectNull) {




                    viewModelSurname.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentStudentDetailsBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.detele = (android.widget.Button) bindings[4];
        this.detele.setTag(null);
        this.image = (android.widget.ImageView) bindings[1];
        this.image.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nameEditText = (android.widget.EditText) bindings[2];
        this.nameEditText.setTag(null);
        this.relativeLayout = (android.widget.RelativeLayout) bindings[6];
        this.save = (android.widget.Button) bindings[5];
        this.save.setTag(null);
        this.surnameEditText = (android.widget.EditText) bindings[3];
        this.surnameEditText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback3 = new android.databinding.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((com.gmail.superarch.presentation.screen.person.details.PersonDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.gmail.superarch.presentation.screen.person.details.PersonDetailsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.gmail.superarch.presentation.screen.person.details.PersonDetailsViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSurname((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelImageUrl((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSurname(android.databinding.ObservableField<java.lang.String> ViewModelSurname, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelName(android.databinding.ObservableField<java.lang.String> ViewModelName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelImageUrl(android.databinding.ObservableField<java.lang.String> ViewModelImageUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        android.databinding.ObservableField<java.lang.String> viewModelSurname = null;
        android.databinding.ObservableField<java.lang.String> viewModelName = null;
        java.lang.String viewModelNameGet = null;
        java.lang.String viewModelImageUrlGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelImageUrl = null;
        java.lang.String viewModelSurnameGet = null;
        com.gmail.superarch.presentation.screen.person.details.PersonDetailsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.surname
                        viewModelSurname = viewModel.getSurname();
                    }
                    updateRegistration(0, viewModelSurname);


                    if (viewModelSurname != null) {
                        // read viewModel.surname.get()
                        viewModelSurnameGet = viewModelSurname.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.name
                        viewModelName = viewModel.getName();
                    }
                    updateRegistration(1, viewModelName);


                    if (viewModelName != null) {
                        // read viewModel.name.get()
                        viewModelNameGet = viewModelName.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imageUrl
                        viewModelImageUrl = viewModel.getImageUrl();
                    }
                    updateRegistration(2, viewModelImageUrl);


                    if (viewModelImageUrl != null) {
                        // read viewModel.imageUrl.get()
                        viewModelImageUrlGet = viewModelImageUrl.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.detele.setOnClickListener(mCallback2);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.nameEditText, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nameEditTextandroidTextAttrChanged);
            this.save.setOnClickListener(mCallback3);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.surnameEditText, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, surnameEditTextandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            com.gmail.superarch.presentation.utils.DataBindingAdaptersKt.loadImage(this.image, viewModelImageUrlGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameEditText, viewModelNameGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.surnameEditText, viewModelSurnameGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.gmail.superarch.presentation.screen.person.details.PersonDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onClickDelete();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.gmail.superarch.presentation.screen.person.details.PersonDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onClickSave();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static FragmentStudentDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentStudentDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<FragmentStudentDetailsBinding>inflate(inflater, com.gmail.superarch.R.layout.fragment_student_details, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static FragmentStudentDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentStudentDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.gmail.superarch.R.layout.fragment_student_details, null, false), bindingComponent);
    }
    @NonNull
    public static FragmentStudentDetailsBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentStudentDetailsBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_student_details_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentStudentDetailsBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.surname
        flag 1 (0x2L): viewModel.name
        flag 2 (0x3L): viewModel.imageUrl
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}