package net.safemoon.androidwallet.fragments;

import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.SimilarTypeGroup;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/TokenType;", "type", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/common/TokenType;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionsFragment.kt */
public final class ReflectionsFragment$onViewCreated$5 extends Lambda implements rc2<TokenType, r37> {
    public final /* synthetic */ ReflectionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionsFragment$onViewCreated$5(ReflectionsFragment reflectionsFragment) {
        super(1);
        this.this$0 = reflectionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TokenType) obj);
        return r37.f33317a;
    }

    public final void invoke(TokenType tokenType) {
        if (tokenType != null) {
            ReflectionsFragment reflectionsFragment = this.this$0;
            la2 A = reflectionsFragment.f42043x;
            la2 la2 = null;
            if (A == null) {
                vx2.m53605u("binding");
                A = null;
            }
            A.f31266g.f21731f.setText(tokenType.getPlaneName());
            la2 A2 = reflectionsFragment.f42043x;
            if (A2 == null) {
                vx2.m53605u("binding");
                A2 = null;
            }
            A2.f31266g.f21730e.setImageResource(tokenType.getIcon());
            if (tokenType.getCoinType().getSimilarTypeGroup() == SimilarTypeGroup.EVM_CAPABILITY) {
                la2 A3 = reflectionsFragment.f42043x;
                if (A3 == null) {
                    vx2.m53605u("binding");
                    A3 = null;
                }
                ImageView imageView = A3.f31268i.f29300d;
                vx2.m53590f(imageView, "binding.topBar.ivTokenListAddNew");
                imageView.setVisibility(0);
                la2 A4 = reflectionsFragment.f42043x;
                if (A4 == null) {
                    vx2.m53605u("binding");
                    A4 = null;
                }
                MaterialTextView materialTextView = A4.f31270k;
                vx2.m53590f(materialTextView, "binding.txtAlertReflection");
                materialTextView.setVisibility(8);
                la2 A5 = reflectionsFragment.f42043x;
                if (A5 == null) {
                    vx2.m53605u("binding");
                } else {
                    la2 = A5;
                }
                la2.f31270k.setText("");
                return;
            }
            la2 A6 = reflectionsFragment.f42043x;
            if (A6 == null) {
                vx2.m53605u("binding");
                A6 = null;
            }
            ImageView imageView2 = A6.f31268i.f29300d;
            vx2.m53590f(imageView2, "binding.topBar.ivTokenListAddNew");
            imageView2.setVisibility(8);
            la2 A7 = reflectionsFragment.f42043x;
            if (A7 == null) {
                vx2.m53605u("binding");
                A7 = null;
            }
            MaterialTextView materialTextView2 = A7.f31270k;
            vx2.m53590f(materialTextView2, "binding.txtAlertReflection");
            materialTextView2.setVisibility(0);
            la2 A8 = reflectionsFragment.f42043x;
            if (A8 == null) {
                vx2.m53605u("binding");
            } else {
                la2 = A8;
            }
            la2.f31270k.setText(reflectionsFragment.getString(R.string.screen_unsupported_reflection));
        }
    }
}
