package com.onesignal;

import android.content.Context;
import android.util.Base64;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.OneSignal;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import p000.c32;

/* renamed from: com.onesignal.e1 */
/* compiled from: PushRegistratorFCM */
public class C5221e1 extends C5215d1 {

    /* renamed from: f */
    public f22 f26302f;

    /* renamed from: g */
    public final Context f26303g;

    /* renamed from: h */
    public final C5222a f26304h;

    /* renamed from: com.onesignal.e1$a */
    /* compiled from: PushRegistratorFCM */
    public static class C5222a {

        /* renamed from: a */
        public final String f26305a;

        /* renamed from: b */
        public final String f26306b;

        /* renamed from: c */
        public final String f26307c;

        public C5222a() {
            this((String) null, (String) null, (String) null);
        }

        public C5222a(String str, String str2, String str3) {
            this.f26305a = str == null ? "onesignal-shared-public" : str;
            this.f26306b = str2 == null ? "1:754795614042:android:c682b8144a8dd52bc1ad63" : str2;
            this.f26307c = str3 == null ? new String(Base64.decode("QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV", 0)) : str3;
        }
    }

    public C5221e1(Context context, C5222a aVar) {
        this.f26303g = context;
        if (aVar == null) {
            this.f26304h = new C5222a();
        } else {
            this.f26304h = aVar;
        }
    }

    /* renamed from: f */
    public String mo38796f() {
        return "FCM";
    }

    /* renamed from: g */
    public String mo38797g(String str) throws Exception {
        mo38812n(str);
        try {
            return mo38811m();
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.INFO, "FirebaseMessaging.getToken not found, attempting to use FirebaseInstanceId.getToken");
            return mo38810l(str);
        }
    }

    @Deprecated
    /* renamed from: l */
    public final String mo38810l(String str) throws IOException {
        Class<String> cls = String.class;
        try {
            Object invoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getMethod("getInstance", new Class[]{f22.class}).invoke((Object) null, new Object[]{this.f26302f});
            return (String) invoke.getClass().getMethod("getToken", new Class[]{cls, cls}).invoke(invoke, new Object[]{str, "FCM"});
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new Error("Reflection error on FirebaseInstanceId.getInstance(firebaseApp).getToken(senderId, FirebaseMessaging.INSTANCE_ID_SCOPE)", e);
        }
    }

    /* renamed from: m */
    public final String mo38811m() throws Exception {
        tl6 i = ((FirebaseMessaging) this.f26302f.mo42484g(FirebaseMessaging.class)).mo36214i();
        try {
            return (String) jm6.m46615a(i);
        } catch (ExecutionException unused) {
            throw i.mo48140k();
        }
    }

    /* renamed from: n */
    public final void mo38812n(String str) {
        if (this.f26302f == null) {
            this.f26302f = f22.m44164p(this.f26303g, new c32.C3924b().mo29861d(str).mo29860c(this.f26304h.f26306b).mo29859b(this.f26304h.f26307c).mo29862e(this.f26304h.f26305a).mo29858a(), "ONESIGNAL_SDK_FCM_APP_NAME");
        }
    }
}
