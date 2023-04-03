package p000;

import android.net.Uri;
import android.os.Build;
import com.walletconnect.android.internal.common.exception.GenericException;
import com.walletconnect.android.internal.common.exception.InvalidProjectIdException;
import com.walletconnect.android.internal.common.exception.ProjectIdDoesNotExistException;
import com.walletconnect.android.internal.common.exception.WalletConnectException;
import com.walletconnect.android.relay.ConnectionType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000\u001a\f\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0000\"\u0018\u0010\r\u001a\u00020\n*\u00020\t8@X\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\u0012\u001a\u00020\u000f*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, mo44877d2 = {"", "f", "sdkVersion", "a", "Lcom/walletconnect/android/relay/ConnectionType;", "g", "", "d", "e", "", "Lcom/walletconnect/android/internal/common/exception/WalletConnectException;", "c", "(Ljava/lang/Throwable;)Lcom/walletconnect/android/internal/common/exception/WalletConnectException;", "toWalletConnectException", "Lkotlin/Int$Companion;", "", "b", "(Liw2;)I", "DefaultId", "sdk_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ay1 */
/* compiled from: Extensions.kt */
public final /* synthetic */ class ay1 {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: ay1$a */
    /* compiled from: Extensions.kt */
    public /* synthetic */ class C3867a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21066a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.walletconnect.android.relay.ConnectionType[] r0 = com.walletconnect.android.relay.ConnectionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.walletconnect.android.relay.ConnectionType r1 = com.walletconnect.android.relay.ConnectionType.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.walletconnect.android.relay.ConnectionType r1 = com.walletconnect.android.relay.ConnectionType.MANUAL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f21066a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ay1.C3867a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ String m32283a(String str, String str2) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "sdkVersion");
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        String str3 = Build.VERSION.RELEASE;
        String uri = buildUpon.appendQueryParameter("ua", "wc-2/kotlin-" + str2 + "/android-" + str3).build().toString();
        vx2.m53590f(uri, "parse(this).buildUpon()\n…ild()\n        .toString()");
        return uri;
    }

    /* renamed from: c */
    public static final /* synthetic */ WalletConnectException m32285c(Throwable th) {
        boolean z;
        vx2.m53591g(th, "<this>");
        String message = th.getMessage();
        boolean z2 = true;
        if (message == null || !StringsKt__StringsKt.m63081R(message, "401", false, 2, (Object) null)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return new ProjectIdDoesNotExistException(th.getMessage());
        }
        String message2 = th.getMessage();
        if (message2 == null || !StringsKt__StringsKt.m63081R(message2, "403", false, 2, (Object) null)) {
            z2 = false;
        }
        if (z2) {
            return new InvalidProjectIdException(th.getMessage());
        }
        return new GenericException(th.getMessage());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ boolean m32286d(java.lang.String r4) {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r4, r0)
            boolean r0 = p000.yb6.m74325B(r4)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 == 0) goto L_0x0040
            android.net.Uri r4 = android.net.Uri.parse(r4)
            if (r4 == 0) goto L_0x003c
            java.lang.String r0 = "wss"
            java.lang.String r3 = "ws"
            java.lang.String[] r0 = new java.lang.String[]{r0, r3}
            java.lang.String r3 = r4.getScheme()
            boolean r0 = kotlin.collections.ArraysKt___ArraysKt.m47249D(r0, r3)
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "projectId"
            java.lang.String r4 = r4.getQueryParameter(r0)
            if (r4 == 0) goto L_0x0037
            boolean r4 = p000.yb6.m74325B(r4)
            if (r4 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r4 = r2
            goto L_0x0038
        L_0x0037:
            r4 = r1
        L_0x0038:
            if (r4 != 0) goto L_0x003c
            r4 = r1
            goto L_0x003d
        L_0x003c:
            r4 = r2
        L_0x003d:
            if (r4 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r1 = r2
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ay1.m32286d(java.lang.String):boolean");
    }

    /* renamed from: e */
    public static final /* synthetic */ String m32287e(String str) {
        vx2.m53591g(str, "<this>");
        Uri parse = Uri.parse(str);
        vx2.m53588d(parse);
        String queryParameter = parse.getQueryParameter("projectId");
        vx2.m53588d(queryParameter);
        vx2.m53590f(queryParameter, "parse(this)!!.let { rela…eter(\"projectId\")!!\n    }");
        return queryParameter;
    }

    /* renamed from: f */
    public static final /* synthetic */ String m32288f(String str) {
        vx2.m53591g(str, "<this>");
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        return scheme + "://" + authority;
    }

    /* renamed from: g */
    public static final /* synthetic */ ConnectionType m32289g(ConnectionType connectionType) {
        vx2.m53591g(connectionType, "<this>");
        int i = C3867a.f21066a[connectionType.ordinal()];
        if (i == 1) {
            return ConnectionType.AUTOMATIC;
        }
        if (i == 2) {
            return ConnectionType.MANUAL;
        }
        throw new NoWhenBranchMatchedException();
    }
}
