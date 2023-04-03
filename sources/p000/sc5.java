package p000;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: sc5 */
/* compiled from: RemoteInput */
public final class sc5 {

    /* renamed from: sc5$a */
    /* compiled from: RemoteInput */
    public static class C3262a {
        /* renamed from: a */
        public static void m26847a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static RemoteInput m26848b(sc5 sc5) {
            throw null;
        }

        /* renamed from: c */
        public static Bundle m26849c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* renamed from: a */
    public static RemoteInput m26845a(sc5 sc5) {
        return C3262a.m26848b(sc5);
    }

    /* renamed from: b */
    public static RemoteInput[] m26846b(sc5[] sc5Arr) {
        if (sc5Arr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[sc5Arr.length];
        for (int i = 0; i < sc5Arr.length; i++) {
            sc5 sc5 = sc5Arr[i];
            remoteInputArr[i] = m26845a((sc5) null);
        }
        return remoteInputArr;
    }
}
