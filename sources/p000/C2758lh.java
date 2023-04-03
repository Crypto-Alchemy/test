package p000;

import android.content.ClipDescription;
import android.content.ClipboardManager;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\f"}, mo44877d2 = {"Llh;", "Lyg0;", "", "a", "Landroid/content/ClipboardManager;", "Landroid/content/ClipboardManager;", "clipboardManager", "<init>", "(Landroid/content/ClipboardManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: lh */
/* compiled from: AndroidClipboardManager.android.kt */
public final class C2758lh implements yg0 {

    /* renamed from: a */
    public final ClipboardManager f14515a;

    public C2758lh(ClipboardManager clipboardManager) {
        vx2.m53591g(clipboardManager, "clipboardManager");
        this.f14515a = clipboardManager;
    }

    /* renamed from: a */
    public final boolean mo22762a() {
        ClipDescription primaryClipDescription = this.f14515a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/plain");
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2758lh(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p000.vx2.m53591g(r2, r0)
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            p000.vx2.m53589e(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>((android.content.ClipboardManager) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2758lh.<init>(android.content.Context):void");
    }
}
