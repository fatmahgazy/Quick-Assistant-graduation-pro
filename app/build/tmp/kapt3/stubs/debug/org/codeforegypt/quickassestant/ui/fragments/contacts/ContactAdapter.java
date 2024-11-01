package org.codeforegypt.quickassestant.ui.fragments.contacts;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.codeforegypt.quickassestant.data.model.Contact;
import org.codeforegypt.quickassestant.databinding.ItemPersonalContactBinding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\t2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u0014\u0010\u001a\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/contacts/ContactAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/codeforegypt/quickassestant/ui/fragments/contacts/ContactAdapter$ContactViewHolder;", "()V", "contactsList", "", "Lorg/codeforegypt/quickassestant/data/model/Contact;", "onCallClick", "Lkotlin/Function1;", "", "getOnCallClick$app_debug", "()Lkotlin/jvm/functions/Function1;", "setOnCallClick$app_debug", "(Lkotlin/jvm/functions/Function1;)V", "onDeleteClick", "getOnDeleteClick$app_debug", "setOnDeleteClick$app_debug", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "newContacts", "ContactViewHolder", "app_debug"})
public final class ContactAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.codeforegypt.quickassestant.ui.fragments.contacts.ContactAdapter.ContactViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<org.codeforegypt.quickassestant.data.model.Contact> contactsList;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Contact, kotlin.Unit> onCallClick;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Contact, kotlin.Unit> onDeleteClick;
    
    public ContactAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<org.codeforegypt.quickassestant.data.model.Contact, kotlin.Unit> getOnCallClick$app_debug() {
        return null;
    }
    
    public final void setOnCallClick$app_debug(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Contact, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<org.codeforegypt.quickassestant.data.model.Contact, kotlin.Unit> getOnDeleteClick$app_debug() {
        return null;
    }
    
    public final void setOnDeleteClick$app_debug(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Contact, kotlin.Unit> p0) {
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull
    java.util.List<org.codeforegypt.quickassestant.data.model.Contact> newContacts) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.codeforegypt.quickassestant.ui.fragments.contacts.ContactAdapter.ContactViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    org.codeforegypt.quickassestant.ui.fragments.contacts.ContactAdapter.ContactViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lorg/codeforegypt/quickassestant/ui/fragments/contacts/ContactAdapter$ContactViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/codeforegypt/quickassestant/databinding/ItemPersonalContactBinding;", "(Lorg/codeforegypt/quickassestant/ui/fragments/contacts/ContactAdapter;Lorg/codeforegypt/quickassestant/databinding/ItemPersonalContactBinding;)V", "getBinding", "()Lorg/codeforegypt/quickassestant/databinding/ItemPersonalContactBinding;", "bind", "", "contact", "Lorg/codeforegypt/quickassestant/data/model/Contact;", "onCallClick", "Lkotlin/Function1;", "onDeleteClick", "app_debug"})
    public final class ContactViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final org.codeforegypt.quickassestant.databinding.ItemPersonalContactBinding binding = null;
        
        public ContactViewHolder(@org.jetbrains.annotations.NotNull
        org.codeforegypt.quickassestant.databinding.ItemPersonalContactBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.codeforegypt.quickassestant.databinding.ItemPersonalContactBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        org.codeforegypt.quickassestant.data.model.Contact contact, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Contact, kotlin.Unit> onCallClick, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super org.codeforegypt.quickassestant.data.model.Contact, kotlin.Unit> onDeleteClick) {
        }
    }
}