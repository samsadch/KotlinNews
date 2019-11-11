package com.example.kotlinnews.ui.details;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.example.kotlinnews.network.Children;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailFragmentArgs() {
  }

  private DetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    bundle.setClassLoader(DetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("selectedChild")) {
      Children selectedChild;
      if (Parcelable.class.isAssignableFrom(Children.class) || Serializable.class.isAssignableFrom(Children.class)) {
        selectedChild = (Children) bundle.get("selectedChild");
      } else {
        throw new UnsupportedOperationException(Children.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (selectedChild == null) {
        throw new IllegalArgumentException("Argument \"selectedChild\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("selectedChild", selectedChild);
    } else {
      throw new IllegalArgumentException("Required argument \"selectedChild\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Children getSelectedChild() {
    return (Children) arguments.get("selectedChild");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("selectedChild")) {
      Children selectedChild = (Children) arguments.get("selectedChild");
      if (Parcelable.class.isAssignableFrom(Children.class) || selectedChild == null) {
        __result.putParcelable("selectedChild", Parcelable.class.cast(selectedChild));
      } else if (Serializable.class.isAssignableFrom(Children.class)) {
        __result.putSerializable("selectedChild", Serializable.class.cast(selectedChild));
      } else {
        throw new UnsupportedOperationException(Children.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailFragmentArgs that = (DetailFragmentArgs) object;
    if (arguments.containsKey("selectedChild") != that.arguments.containsKey("selectedChild")) {
      return false;
    }
    if (getSelectedChild() != null ? !getSelectedChild().equals(that.getSelectedChild()) : that.getSelectedChild() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getSelectedChild() != null ? getSelectedChild().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailFragmentArgs{"
        + "selectedChild=" + getSelectedChild()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(DetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Children selectedChild) {
      if (selectedChild == null) {
        throw new IllegalArgumentException("Argument \"selectedChild\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedChild", selectedChild);
    }

    @NonNull
    public DetailFragmentArgs build() {
      DetailFragmentArgs result = new DetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setSelectedChild(@NonNull Children selectedChild) {
      if (selectedChild == null) {
        throw new IllegalArgumentException("Argument \"selectedChild\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedChild", selectedChild);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Children getSelectedChild() {
      return (Children) arguments.get("selectedChild");
    }
  }
}
