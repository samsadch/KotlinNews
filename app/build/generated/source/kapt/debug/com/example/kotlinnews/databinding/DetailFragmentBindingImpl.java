package com.example.kotlinnews.databinding;
import com.example.kotlinnews.R;
import com.example.kotlinnews.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DetailFragmentBindingImpl extends DetailFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DetailFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private DetailFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.detailsText.setTag(null);
        this.mainPhotoImage.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.titleText.setTag(null);
        this.urlText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setViewModel((com.example.kotlinnews.ui.details.DetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.kotlinnews.ui.details.DetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelImageUrl((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelDisplayChildSelftText((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelDisplayChildData((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelDisplayChildURL((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelImageUrl(androidx.lifecycle.LiveData<java.lang.String> ViewModelImageUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDisplayChildSelftText(androidx.lifecycle.LiveData<java.lang.String> ViewModelDisplayChildSelftText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDisplayChildData(androidx.lifecycle.LiveData<java.lang.String> ViewModelDisplayChildData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDisplayChildURL(androidx.lifecycle.LiveData<java.lang.String> ViewModelDisplayChildURL, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        androidx.lifecycle.LiveData<java.lang.String> viewModelImageUrl = null;
        java.lang.String viewModelDisplayChildDataGetValue = null;
        java.lang.String viewModelImageUrlGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelDisplayChildSelftText = null;
        java.lang.String viewModelDisplayChildURLGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelDisplayChildData = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelDisplayChildURL = null;
        com.example.kotlinnews.ui.details.DetailViewModel viewModel = mViewModel;
        java.lang.String viewModelDisplayChildSelftTextGetValue = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imageUrl
                        viewModelImageUrl = viewModel.getImageUrl();
                    }
                    updateLiveDataRegistration(0, viewModelImageUrl);


                    if (viewModelImageUrl != null) {
                        // read viewModel.imageUrl.getValue()
                        viewModelImageUrlGetValue = viewModelImageUrl.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.displayChildSelftText
                        viewModelDisplayChildSelftText = viewModel.getDisplayChildSelftText();
                    }
                    updateLiveDataRegistration(1, viewModelDisplayChildSelftText);


                    if (viewModelDisplayChildSelftText != null) {
                        // read viewModel.displayChildSelftText.getValue()
                        viewModelDisplayChildSelftTextGetValue = viewModelDisplayChildSelftText.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.displayChildData
                        viewModelDisplayChildData = viewModel.getDisplayChildData();
                    }
                    updateLiveDataRegistration(2, viewModelDisplayChildData);


                    if (viewModelDisplayChildData != null) {
                        // read viewModel.displayChildData.getValue()
                        viewModelDisplayChildDataGetValue = viewModelDisplayChildData.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.displayChildURL
                        viewModelDisplayChildURL = viewModel.getDisplayChildURL();
                    }
                    updateLiveDataRegistration(3, viewModelDisplayChildURL);


                    if (viewModelDisplayChildURL != null) {
                        // read viewModel.displayChildURL.getValue()
                        viewModelDisplayChildURLGetValue = viewModelDisplayChildURL.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.detailsText, viewModelDisplayChildSelftTextGetValue);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            com.example.kotlinnews.BindingAdaptersKt.bindImage(this.mainPhotoImage, viewModelImageUrlGetValue);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, viewModelDisplayChildDataGetValue);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.urlText, viewModelDisplayChildURLGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.imageUrl
        flag 1 (0x2L): viewModel.displayChildSelftText
        flag 2 (0x3L): viewModel.displayChildData
        flag 3 (0x4L): viewModel.displayChildURL
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}