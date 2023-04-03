package net.safemoon.androidwallet.fragments;

import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;
import p000.xb5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "model", "Landroid/widget/Button;", "button", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;Landroid/widget/Button;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionsFragment.kt */
public final class ReflectionsFragment$onViewCreated$6 extends Lambda implements fd2<RoomReflectionsToken, Button, r37> {
    public final /* synthetic */ ReflectionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionsFragment$onViewCreated$6(ReflectionsFragment reflectionsFragment) {
        super(2);
        this.this$0 = reflectionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((RoomReflectionsToken) obj, (Button) obj2);
        return r37.f33317a;
    }

    public final void invoke(final RoomReflectionsToken roomReflectionsToken, Button button) {
        vx2.m53591g(roomReflectionsToken, "model");
        vx2.m53591g(button, "button");
        if (!roomReflectionsToken.getEnableAdvanceMode()) {
            FragmentActivity requireActivity = this.this$0.requireActivity();
            vx2.m53590f(requireActivity, "requireActivity()");
            String string = this.this$0.getString(R.string.warning_title);
            String string2 = this.this$0.getString(R.string.reflection_data_loading);
            vx2.m53590f(string2, "getString(R.string.reflection_data_loading)");
            final ReflectionsFragment reflectionsFragment = this.this$0;
            C84271 r4 = new pc2<r37>() {
                public final void invoke() {
                    roomReflectionsToken.setEnableAdvanceMode(false);
                    reflectionsFragment.mo57595H().mo61352x(roomReflectionsToken);
                    ReflectionsFragment reflectionsFragment = reflectionsFragment;
                    xb5.C9591b c = xb5.m73909c(roomReflectionsToken.getSymbolWithType());
                    vx2.m53590f(c, "actionReflectionsFragmen…                        )");
                    reflectionsFragment.mo50753j(c);
                }
            };
            final ReflectionsFragment reflectionsFragment2 = this.this$0;
            fy0.m57960i(requireActivity, string, string2, false, r4, new pc2<r37>() {
                public final void invoke() {
                    roomReflectionsToken.setEnableAdvanceMode(true);
                    reflectionsFragment2.mo57595H().mo61352x(roomReflectionsToken);
                }
            });
            return;
        }
        this.this$0.mo57595H().mo61352x(roomReflectionsToken);
    }
}
