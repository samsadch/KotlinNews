package com.example.kotlinnews.ui.main;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.kotlinnews.R;
import com.example.kotlinnews.network.Children;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MainFragmentDirections {
  private MainFragmentDirections() {
  }

  @NonNull
  public static ActionMainFragmentToDetailFragment actionMainFragmentToDetailFragment(@NonNull Children selectedChild) {
    return new ActionMainFragmentToDetailFragment(selectedChild);
  }

  public static class ActionMainFragmentToDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionMainFragmentToDetailFragment(@NonNull Children selectedChild) {
      if (selectedChild == null) {
        throw new IllegalArgumentException("Argument \"selectedChild\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedChild", selectedChild);
    }

    @NonNull
    public ActionMainFragmentToDetailFragment setSelectedChild(@NonNull Children selectedChild) {
      if (selectedChild == null) {
        throw new IllegalArgumentException("Argument \"selectedChild\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedChild", selectedChild);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_mainFragment_to_detailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Children getSelectedChild() {
      return (Children) arguments.get("selectedChild");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMainFragmentToDetailFragment that = (ActionMainFragmentToDetailFragment) object;
      if (arguments.containsKey("selectedChild") != that.arguments.containsKey("selectedChild")) {
        return false;
      }
      if (getSelectedChild() != null ? !getSelectedChild().equals(that.getSelectedChild()) : that.getSelectedChild() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getSelectedChild() != null ? getSelectedChild().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMainFragmentToDetailFragment(actionId=" + getActionId() + "){"
          + "selectedChild=" + getSelectedChild()
          + "}";
    }
  }
}
