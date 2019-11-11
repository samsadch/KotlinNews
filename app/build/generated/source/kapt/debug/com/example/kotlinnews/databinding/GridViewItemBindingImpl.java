package com.example.kotlinnews.databinding;
import com.example.kotlinnews.R;
import com.example.kotlinnews.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class GridViewItemBindingImpl extends GridViewItemBinding  {

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
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public GridViewItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private GridViewItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.dataImage.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.child == variableId) {
            setChild((com.example.kotlinnews.network.Children) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setChild(@Nullable com.example.kotlinnews.network.Children Child) {
        this.mChild = Child;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.child);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String childDataTitle = null;
        com.example.kotlinnews.network.DataX childData = null;
        java.lang.String childDataThumbnail = null;
        com.example.kotlinnews.network.Children child = mChild;

        if ((dirtyFlags & 0x3L) != 0) {



                if (child != null) {
                    // read child.data
                    childData = child.getData();
                }


                if (childData != null) {
                    // read child.data.title
                    childDataTitle = childData.getTitle();
                    // read child.data.thumbnail
                    childDataThumbnail = childData.getThumbnail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.kotlinnews.ui.main.BindingAdaptersKt.bindImage(this.dataImage, childDataThumbnail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, childDataTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): child
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}