package org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.codeforegypt.quickassestant.data.model.Emergency;
import org.codeforegypt.quickassestant.databinding.ListEmergancyItemBinding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u0014\u0010\u001a\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/emergencies/emergancy/EmergencyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/codeforegypt/quickassestant/ui/fragments/emergencies/emergancy/EmergencyAdapter$EmergencyViewHolder;", "()V", "emergencyList", "", "Lorg/codeforegypt/quickassestant/data/model/Emergency;", "onCallClick", "Lkotlin/Function1;", "", "getOnCallClick$app_debug", "()Lkotlin/jvm/functions/Function1;", "setOnCallClick$app_debug", "(Lkotlin/jvm/functions/Function1;)V", "onShowLocationClick", "getOnShowLocationClick$app_debug", "setOnShowLocationClick$app_debug", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "newList", "EmergencyViewHolder", "app_debug"})
public final class EmergencyAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy.EmergencyAdapter.EmergencyViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<org.codeforegypt.quickassestant.data.model.Emergency> emergencyList;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Emergency, kotlin.Unit> onCallClick;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Emergency, kotlin.Unit> onShowLocationClick;
    
    public EmergencyAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<org.codeforegypt.quickassestant.data.model.Emergency, kotlin.Unit> getOnCallClick$app_debug() {
        return null;
    }
    
    public final void setOnCallClick$app_debug(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Emergency, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<org.codeforegypt.quickassestant.data.model.Emergency, kotlin.Unit> getOnShowLocationClick$app_debug() {
        return null;
    }
    
    public final void setOnShowLocationClick$app_debug(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Emergency, kotlin.Unit> p0) {
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull
    java.util.List<org.codeforegypt.quickassestant.data.model.Emergency> newList) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy.EmergencyAdapter.EmergencyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.ui.fragments.emergencies.emergancy.EmergencyAdapter.EmergencyViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/emergencies/emergancy/EmergencyAdapter$EmergencyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/codeforegypt/quickassestant/databinding/ListEmergancyItemBinding;", "(Lorg/codeforegypt/quickassestant/databinding/ListEmergancyItemBinding;)V", "getBinding", "()Lorg/codeforegypt/quickassestant/databinding/ListEmergancyItemBinding;", "bind", "", "emergency", "Lorg/codeforegypt/quickassestant/data/model/Emergency;", "onCallClick", "Lkotlin/Function1;", "onShowLocationClick", "app_debug"})
    public static final class EmergencyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final org.codeforegypt.quickassestant.databinding.ListEmergancyItemBinding binding = null;
        
        public EmergencyViewHolder(@org.jetbrains.annotations.NotNull
        org.codeforegypt.quickassestant.databinding.ListEmergancyItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.codeforegypt.quickassestant.databinding.ListEmergancyItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        org.codeforegypt.quickassestant.data.model.Emergency emergency, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Emergency, kotlin.Unit> onCallClick, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Emergency, kotlin.Unit> onShowLocationClick) {
        }
    }
}