package net.safemoon.androidwallet.provider;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lnet/safemoon/androidwallet/provider/RequiredAuthorizeProvider;", "", "Lkotlin/Function0;", "Lr37;", "onSuccess", "onFail", "a", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Lho2;", "b", "Lho2;", "iHomeInterface", "<init>", "(Landroid/content/Context;Lho2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: RequiredAuthorizeProvider.kt */
public final class RequiredAuthorizeProvider {

    /* renamed from: a */
    public final Context f42493a;

    /* renamed from: b */
    public final ho2 f42494b;

    public RequiredAuthorizeProvider(Context context, ho2 ho2) {
        vx2.m53591g(context, "context");
        this.f42493a = context;
        this.f42494b = ho2;
    }

    /* renamed from: a */
    public final void mo60708a(pc2<r37> pc2, pc2<r37> pc22) {
        ji4 m;
        C3529wa<Intent> b;
        Intent intent;
        vx2.m53591g(pc2, "onSuccess");
        vx2.m53591g(pc22, "onFail");
        ho2 ho2 = this.f42494b;
        if (ho2 != null && (m = ho2.mo52268m()) != null && (b = m.mo52724b(new RequiredAuthorizeProvider$launch$1(pc2, pc22))) != null) {
            ho2 ho22 = this.f42494b;
            if (ho22 != null) {
                intent = ho22.mo52269o();
            } else {
                intent = null;
            }
            b.mo27473a(intent);
        }
    }
}
