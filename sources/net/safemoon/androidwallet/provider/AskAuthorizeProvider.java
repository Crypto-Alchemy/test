package net.safemoon.androidwallet.provider;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lnet/safemoon/androidwallet/provider/AskAuthorizeProvider;", "", "Lkotlin/Function0;", "Lr37;", "onSuccess", "onFail", "a", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Lho2;", "b", "Lho2;", "iHomeInterface", "<init>", "(Landroid/content/Context;Lho2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AskAuthorizeProvider.kt */
public final class AskAuthorizeProvider {

    /* renamed from: a */
    public final Context f42491a;

    /* renamed from: b */
    public final ho2 f42492b;

    public AskAuthorizeProvider(Context context, ho2 ho2) {
        vx2.m53591g(context, "context");
        this.f42491a = context;
        this.f42492b = ho2;
    }

    /* renamed from: a */
    public final void mo60705a(pc2<r37> pc2, pc2<r37> pc22) {
        ji4 m;
        C3529wa<Intent> b;
        vx2.m53591g(pc2, "onSuccess");
        vx2.m53591g(pc22, "onFail");
        if (f06.m57514e(this.f42491a, "ASK_AUTH_TRANSACTION_SIGN", true)) {
            ho2 ho2 = this.f42492b;
            if (ho2 != null && (m = ho2.mo52268m()) != null && (b = m.mo52724b(new AskAuthorizeProvider$launch$1(pc2, pc22))) != null) {
                b.mo27473a(this.f42492b.mo52269o());
                return;
            }
            return;
        }
        pc2.invoke();
    }
}
