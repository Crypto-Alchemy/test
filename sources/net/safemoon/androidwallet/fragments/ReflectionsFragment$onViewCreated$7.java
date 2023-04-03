package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;
import p000.xb5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionsFragment.kt */
public final class ReflectionsFragment$onViewCreated$7 extends Lambda implements rc2<RoomReflectionsToken, r37> {
    public final /* synthetic */ ReflectionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionsFragment$onViewCreated$7(ReflectionsFragment reflectionsFragment) {
        super(1);
        this.this$0 = reflectionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RoomReflectionsToken) obj);
        return r37.f33317a;
    }

    public final void invoke(RoomReflectionsToken roomReflectionsToken) {
        vx2.m53591g(roomReflectionsToken, "it");
        if (roomReflectionsToken.getEnableAdvanceMode()) {
            ReflectionsFragment reflectionsFragment = this.this$0;
            xb5.C9591b c = xb5.m73909c(roomReflectionsToken.getSymbolWithType());
            vx2.m53590f(c, "actionReflectionsFragmen…ype\n                    )");
            reflectionsFragment.mo50753j(c);
        }
    }
}
