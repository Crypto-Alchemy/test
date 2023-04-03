package net.safemoon.androidwallet.fragments;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import p000.l21;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Ljava/util/Date;", "it", "Lr37;", "invoke", "(Ljava/util/Date;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionsAdvanceFragment.kt */
public final class ReflectionsAdvanceFragment$onViewCreated$3 extends Lambda implements rc2<Date, r37> {
    public final /* synthetic */ ReflectionsAdvanceFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionsAdvanceFragment$onViewCreated$3(ReflectionsAdvanceFragment reflectionsAdvanceFragment) {
        super(1);
        this.this$0 = reflectionsAdvanceFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Date) obj);
        return r37.f33317a;
    }

    public final void invoke(Date date) {
        ka2 A = this.this$0.mo57580M();
        if (A != null) {
            ReflectionsAdvanceFragment reflectionsAdvanceFragment = this.this$0;
            AppCompatTextView appCompatTextView = A.f30776s;
            vx2.m53590f(appCompatTextView, "txtLoading");
            int i = 8;
            appCompatTextView.setVisibility(date != null ? 0 : 8);
            AppCompatImageView appCompatImageView = A.f30771n.f34317c;
            vx2.m53590f(appCompatImageView, "toolbar.ivToolbarAction");
            if (date == null) {
                i = 0;
            }
            appCompatImageView.setVisibility(i);
            if (date != null) {
                AppCompatTextView appCompatTextView2 = A.f30776s;
                Resources resources = reflectionsAdvanceFragment.getResources();
                l21.C7817a aVar = l21.f40561a;
                Context requireContext = reflectionsAdvanceFragment.requireContext();
                vx2.m53590f(requireContext, "requireContext()");
                appCompatTextView2.setText(resources.getString(R.string.reflection_data_for_date, new Object[]{aVar.mo55805b(requireContext).format(date)}));
            }
        }
    }
}
