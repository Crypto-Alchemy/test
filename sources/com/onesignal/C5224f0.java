package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.onesignal.f0 */
/* compiled from: OSNotificationDataController */
public class C5224f0 extends C5317r {

    /* renamed from: a */
    public final C5340w0 f26309a;

    /* renamed from: b */
    public final ld4 f26310b;

    /* renamed from: com.onesignal.f0$a */
    /* compiled from: OSNotificationDataController */
    public class C5225a extends C6751yw {
        public C5225a() {
        }

        public void run() {
            super.run();
            C5224f0.this.f26309a.mo39147d("notification", "created_time < ?", new String[]{String.valueOf((OneSignal.m40443w0().mo46064a() / 1000) - 604800)});
        }
    }

    /* renamed from: com.onesignal.f0$b */
    /* compiled from: OSNotificationDataController */
    public class C5226b extends C6751yw {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f26312a;

        /* renamed from: d */
        public final /* synthetic */ int f26313d;

        public C5226b(WeakReference weakReference, int i) {
            this.f26312a = weakReference;
            this.f26313d = i;
        }

        public void run() {
            super.run();
            Context context = (Context) this.f26312a.get();
            if (context != null) {
                String str = "android_notification_id = " + this.f26313d + " AND " + "opened" + " = 0 AND " + "dismissed" + " = 0";
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", 1);
                if (C5224f0.this.f26309a.mo39144a("notification", contentValues, str, (String[]) null) > 0) {
                    C5311q.m41237e(context, C5224f0.this.f26309a, this.f26313d);
                }
                C5186b.m40596c(C5224f0.this.f26309a, context);
                ei4.m43983i(context).cancel(this.f26313d);
            }
        }
    }

    /* renamed from: com.onesignal.f0$c */
    /* compiled from: OSNotificationDataController */
    public class C5227c extends C6751yw {

        /* renamed from: a */
        public final /* synthetic */ String f26315a;

        /* renamed from: d */
        public final /* synthetic */ C5228d f26316d;

        public C5227c(String str, C5228d dVar) {
            this.f26315a = str;
            this.f26316d = dVar;
        }

        public void run() {
            super.run();
            boolean z = true;
            Cursor c = C5224f0.this.f26309a.mo39146c("notification", new String[]{"notification_id"}, "notification_id = ?", new String[]{this.f26315a}, (String) null, (String) null, (String) null);
            boolean moveToFirst = c.moveToFirst();
            c.close();
            if (moveToFirst) {
                C5224f0.this.f26310b.debug("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.f26315a);
            } else {
                z = false;
            }
            this.f26316d.mo38821a(z);
        }
    }

    /* renamed from: com.onesignal.f0$d */
    /* compiled from: OSNotificationDataController */
    public interface C5228d {
        /* renamed from: a */
        void mo38821a(boolean z);
    }

    public C5224f0(C5340w0 w0Var, ld4 ld4) {
        this.f26309a = w0Var;
        this.f26310b = ld4;
    }

    /* renamed from: g */
    public final void mo38816g() {
        mo39086d(new C5225a(), "OS_NOTIFICATIONS_THREAD");
    }

    /* renamed from: h */
    public void mo38817h() {
        mo38816g();
    }

    /* renamed from: i */
    public final void mo38818i(String str, C5228d dVar) {
        if (str == null || "".equals(str)) {
            dVar.mo38821a(false);
        } else if (!OSNotificationWorkManager.m40229a(str)) {
            this.f26310b.debug("Notification notValidOrDuplicated with id duplicated");
            dVar.mo38821a(true);
        } else {
            mo39086d(new C5227c(str, dVar), "OS_NOTIFICATIONS_THREAD");
        }
    }

    /* renamed from: j */
    public void mo38819j(JSONObject jSONObject, C5228d dVar) {
        String b = C5235g0.m40846b(jSONObject);
        if (b == null) {
            this.f26310b.debug("Notification notValidOrDuplicated with id null");
            dVar.mo38821a(true);
            return;
        }
        mo38818i(b, dVar);
    }

    /* renamed from: k */
    public void mo38820k(int i, WeakReference<Context> weakReference) {
        mo39086d(new C5226b(weakReference, i), "OS_NOTIFICATIONS_THREAD");
    }
}
