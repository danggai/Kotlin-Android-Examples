// Generated by data binding compiler. Do not edit!
package com.example.tddexample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.tddexample.R;
import com.example.tddexample.ui.main.MainViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MainFragmentBinding extends ViewDataBinding {
  @NonNull
  public final Button btnMinus;

  @NonNull
  public final Button btnMultiple;

  @NonNull
  public final Button btnPlus;

  @NonNull
  public final AppCompatEditText etAnother;

  @NonNull
  public final AppCompatEditText etOrigin;

  @NonNull
  public final LinearLayoutCompat llMain;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final AppCompatTextView tvResult;

  @Bindable
  protected MainViewModel mVm;

  protected MainFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnMinus, Button btnMultiple, Button btnPlus, AppCompatEditText etAnother,
      AppCompatEditText etOrigin, LinearLayoutCompat llMain, ConstraintLayout main,
      AppCompatTextView tvResult) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnMinus = btnMinus;
    this.btnMultiple = btnMultiple;
    this.btnPlus = btnPlus;
    this.etAnother = etAnother;
    this.etOrigin = etOrigin;
    this.llMain = llMain;
    this.main = main;
    this.tvResult = tvResult;
  }

  public abstract void setVm(@Nullable MainViewModel vm);

  @Nullable
  public MainViewModel getVm() {
    return mVm;
  }

  @NonNull
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MainFragmentBinding>inflateInternal(inflater, R.layout.main_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MainFragmentBinding>inflateInternal(inflater, R.layout.main_fragment, null, false, component);
  }

  public static MainFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static MainFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (MainFragmentBinding)bind(component, view, R.layout.main_fragment);
  }
}