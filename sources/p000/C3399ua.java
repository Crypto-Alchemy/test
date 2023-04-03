package p000;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import p000.C3253sa;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, mo44877d2 = {"Lua;", "Lsa;", "", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "", "resultCode", "intent", "f", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "Lsa$a;", "e", "<init>", "()V", "activity_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ua */
/* compiled from: ActivityResultContracts.kt */
public final class C3399ua extends C3253sa<String, Boolean> {
    /* renamed from: d */
    public Intent mo6044a(Context context, String str) {
        vx2.m53591g(context, "context");
        vx2.m53591g(str, "input");
        return C3349ta.f18107a.mo26402a(new String[]{str});
    }

    /* renamed from: e */
    public C3253sa.C3254a<Boolean> mo25690b(Context context, String str) {
        boolean z;
        vx2.m53591g(context, "context");
        vx2.m53591g(str, "input");
        if (zr0.m31438a(context, str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C3253sa.C3254a<>(Boolean.TRUE);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if (r5 == true) goto L_0x0027;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean mo6045c(int r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L_0x002c
            r0 = -1
            if (r5 == r0) goto L_0x0006
            goto L_0x002c
        L_0x0006:
            java.lang.String r5 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            int[] r5 = r6.getIntArrayExtra(r5)
            r6 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0026
            int r1 = r5.length
            r2 = r0
        L_0x0012:
            if (r2 >= r1) goto L_0x0022
            r3 = r5[r2]
            if (r3 != 0) goto L_0x001a
            r3 = r6
            goto L_0x001b
        L_0x001a:
            r3 = r0
        L_0x001b:
            if (r3 == 0) goto L_0x001f
            r5 = r6
            goto L_0x0023
        L_0x001f:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0022:
            r5 = r0
        L_0x0023:
            if (r5 != r6) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r6 = r0
        L_0x0027:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            return r5
        L_0x002c:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3399ua.mo6045c(int, android.content.Intent):java.lang.Boolean");
    }
}
