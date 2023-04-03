package p000;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p000.rr0;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: uu2 */
/* compiled from: InputConnectionCompat */
public final class uu2 {

    /* renamed from: uu2$a */
    /* compiled from: InputConnectionCompat */
    public class C3433a extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ C3435c f18580a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3433a(InputConnection inputConnection, boolean z, C3435c cVar) {
            super(inputConnection, z);
            this.f18580a = cVar;
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f18580a.mo26568a(vu2.m29109f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: uu2$b */
    /* compiled from: InputConnectionCompat */
    public class C3434b extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ C3435c f18581a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3434b(InputConnection inputConnection, boolean z, C3435c cVar) {
            super(inputConnection, z);
            this.f18581a = cVar;
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (uu2.m28428e(str, bundle, this.f18581a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: uu2$c */
    /* compiled from: InputConnectionCompat */
    public interface C3435c {
        /* renamed from: a */
        boolean mo26568a(vu2 vu2, int i, Bundle bundle);
    }

    /* renamed from: b */
    public static C3435c m28425b(View view) {
        gu4.m18428f(view);
        return new tu2(view);
    }

    /* renamed from: c */
    public static InputConnection m28426c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m28427d(inputConnection, editorInfo, m28425b(view));
    }

    @Deprecated
    /* renamed from: d */
    public static InputConnection m28427d(InputConnection inputConnection, EditorInfo editorInfo, C3435c cVar) {
        mf4.m22286d(inputConnection, "inputConnection must be non-null");
        mf4.m22286d(editorInfo, "editorInfo must be non-null");
        mf4.m22286d(cVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new C3433a(inputConnection, false, cVar);
        }
        if (un1.m28359a(editorInfo).length == 0) {
            return inputConnection;
        }
        return new C3434b(inputConnection, false, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m28428e(java.lang.String r7, android.os.Bundle r8, p000.uu2.C3435c r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x000e
            r7 = r0
            goto L_0x0017
        L_0x000e:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 == 0) goto L_0x0081
            r7 = 1
        L_0x0017:
            r1 = 0
            if (r7 == 0) goto L_0x001d
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L_0x001f
        L_0x001d:
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L_0x001f:
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch:{ all -> 0x0079 }
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x002a
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L_0x002c
        L_0x002a:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L_0x002c:
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch:{ all -> 0x0077 }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0037
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L_0x0039
        L_0x0037:
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L_0x0039:
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch:{ all -> 0x0077 }
            android.content.ClipDescription r4 = (android.content.ClipDescription) r4     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0044
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L_0x0046
        L_0x0044:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L_0x0046:
            android.os.Parcelable r5 = r8.getParcelable(r5)     // Catch:{ all -> 0x0077 }
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0051
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L_0x0053
        L_0x0051:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L_0x0053:
            int r6 = r8.getInt(r6)     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x005c
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L_0x005e
        L_0x005c:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L_0x005e:
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch:{ all -> 0x0077 }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x0071
            if (r4 == 0) goto L_0x0071
            vu2 r8 = new vu2     // Catch:{ all -> 0x0077 }
            r8.<init>(r3, r4, r5)     // Catch:{ all -> 0x0077 }
            boolean r0 = r9.mo26568a(r8, r6, r7)     // Catch:{ all -> 0x0077 }
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r2.send(r0, r1)
        L_0x0076:
            return r0
        L_0x0077:
            r7 = move-exception
            goto L_0x007b
        L_0x0079:
            r7 = move-exception
            r2 = r1
        L_0x007b:
            if (r2 == 0) goto L_0x0080
            r2.send(r0, r1)
        L_0x0080:
            throw r7
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uu2.m28428e(java.lang.String, android.os.Bundle, uu2$c):boolean");
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m28429f(View view, vu2 vu2, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                vu2.mo27331d();
                InputContentInfo inputContentInfo = (InputContentInfo) vu2.mo27332e();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception unused) {
                return false;
            }
        }
        if (ga7.m17765f0(view, new rr0.C3216a(new ClipData(vu2.mo27329b(), new ClipData.Item(vu2.mo27328a())), 2).mo25509d(vu2.mo27330c()).mo25507b(bundle).mo25506a()) == null) {
            return true;
        }
        return false;
    }
}
