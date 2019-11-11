package com.example.kotlinnews.ui.main;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.kotlinnews.R;

public class MainFragmentDirections {
  private MainFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMainFragmentToDetailFragment() {
    return new ActionOnlyNavDirections(R.id.action_mainFragment_to_detailFragment);
  }
}
