package p000;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.C3253sa;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00152 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00040\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0016"}, mo44877d2 = {"Lta;", "Lsa;", "", "", "", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lsa$a;", "e", "(Landroid/content/Context;[Ljava/lang/String;)Lsa$a;", "", "resultCode", "intent", "f", "<init>", "()V", "a", "activity_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ta */
/* compiled from: ActivityResultContracts.kt */
public final class C3349ta extends C3253sa<String[], Map<String, Boolean>> {

    /* renamed from: a */
    public static final C3350a f18107a = new C3350a((DefaultConstructorMarker) null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00038\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, mo44877d2 = {"Lta$a;", "", "", "", "input", "Landroid/content/Intent;", "a", "([Ljava/lang/String;)Landroid/content/Intent;", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "<init>", "()V", "activity_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: ta$a */
    /* compiled from: ActivityResultContracts.kt */
    public static final class C3350a {
        public C3350a() {
        }

        public /* synthetic */ C3350a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo26402a(String[] strArr) {
            vx2.m53591g(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            vx2.m53590f(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    /* renamed from: d */
    public Intent mo6044a(Context context, String[] strArr) {
        vx2.m53591g(context, "context");
        vx2.m53591g(strArr, "input");
        return f18107a.mo26402a(strArr);
    }

    /* renamed from: e */
    public C3253sa.C3254a<Map<String, Boolean>> mo25690b(Context context, String[] strArr) {
        boolean z;
        boolean z2;
        vx2.m53591g(context, "context");
        vx2.m53591g(strArr, "input");
        boolean z3 = true;
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C3253sa.C3254a<>(C6177b.m47361i());
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (zr0.m31438a(context, strArr[i]) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
                break;
            }
            i++;
        }
        if (!z3) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d75.m43382d(ao3.m31893e(strArr.length), 16));
        for (String a : strArr) {
            Pair a2 = wy6.m54142a(a, Boolean.TRUE);
            linkedHashMap.put(a2.getFirst(), a2.getSecond());
        }
        return new C3253sa.C3254a<>(linkedHashMap);
    }

    /* renamed from: f */
    public Map<String, Boolean> mo6045c(int i, Intent intent) {
        boolean z;
        if (i != -1) {
            return C6177b.m47361i();
        }
        if (intent == null) {
            return C6177b.m47361i();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return C6177b.m47361i();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(Boolean.valueOf(z));
        }
        return C6177b.m47369q(CollectionsKt___CollectionsKt.m47321R0(ArraysKt___ArraysKt.m47253F(stringArrayExtra), arrayList));
    }
}
