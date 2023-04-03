package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import p000.lo2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo44877d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "", "a", "I", "c", "()I", "d", "(I)V", "maxClientId", "", "", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Lko2;", "e", "Landroid/os/RemoteCallbackList;", "()Landroid/os/RemoteCallbackList;", "callbackList", "Llo2$a;", "g", "Llo2$a;", "binder", "<init>", "()V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: MultiInstanceInvalidationService.kt */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a */
    public int f6867a;

    /* renamed from: d */
    public final Map<Integer, String> f6868d = new LinkedHashMap();

    /* renamed from: e */
    public final RemoteCallbackList<ko2> f6869e = new C1365b(this);

    /* renamed from: g */
    public final lo2.C2773a f6870g = new C1364a(this);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016J'\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo44877d2 = {"androidx/room/MultiInstanceInvalidationService$a", "Llo2$a;", "Lko2;", "callback", "", "name", "", "o", "clientId", "Lr37;", "d1", "", "tables", "X", "(I[Ljava/lang/String;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    /* compiled from: MultiInstanceInvalidationService.kt */
    public static final class C1364a extends lo2.C2773a {

        /* renamed from: a */
        public final /* synthetic */ MultiInstanceInvalidationService f6871a;

        public C1364a(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f6871a = multiInstanceInvalidationService;
        }

        /* renamed from: X */
        public void mo10109X(int i, String[] strArr) {
            vx2.m53591g(strArr, "tables");
            RemoteCallbackList<ko2> a = this.f6871a.mo10104a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6871a;
            synchronized (a) {
                String str = multiInstanceInvalidationService.mo10105b().get(Integer.valueOf(i));
                if (str != null) {
                    int beginBroadcast = multiInstanceInvalidationService.mo10104a().beginBroadcast();
                    int i2 = 0;
                    while (i2 < beginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService.mo10104a().getBroadcastCookie(i2);
                            vx2.m53589e(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            int intValue = ((Integer) broadcastCookie).intValue();
                            String str2 = multiInstanceInvalidationService.mo10105b().get(Integer.valueOf(intValue));
                            if (i != intValue && vx2.m53586b(str, str2)) {
                                try {
                                    multiInstanceInvalidationService.mo10104a().getBroadcastItem(i2).mo22423l(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                            i2++;
                        } catch (Throwable th) {
                            multiInstanceInvalidationService.mo10104a().finishBroadcast();
                            throw th;
                        }
                    }
                    multiInstanceInvalidationService.mo10104a().finishBroadcast();
                    r37 r37 = r37.f33317a;
                }
            }
        }

        /* renamed from: d1 */
        public void mo10110d1(ko2 ko2, int i) {
            vx2.m53591g(ko2, "callback");
            RemoteCallbackList<ko2> a = this.f6871a.mo10104a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6871a;
            synchronized (a) {
                multiInstanceInvalidationService.mo10104a().unregister(ko2);
                String remove = multiInstanceInvalidationService.mo10105b().remove(Integer.valueOf(i));
            }
        }

        /* renamed from: o */
        public int mo10111o(ko2 ko2, String str) {
            vx2.m53591g(ko2, "callback");
            int i = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList<ko2> a = this.f6871a.mo10104a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6871a;
            synchronized (a) {
                multiInstanceInvalidationService.mo10107d(multiInstanceInvalidationService.mo10106c() + 1);
                int c = multiInstanceInvalidationService.mo10106c();
                if (multiInstanceInvalidationService.mo10104a().register(ko2, Integer.valueOf(c))) {
                    multiInstanceInvalidationService.mo10105b().put(Integer.valueOf(c), str);
                    i = c;
                } else {
                    multiInstanceInvalidationService.mo10107d(multiInstanceInvalidationService.mo10106c() - 1);
                    multiInstanceInvalidationService.mo10106c();
                }
            }
            return i;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo44877d2 = {"androidx/room/MultiInstanceInvalidationService$b", "Landroid/os/RemoteCallbackList;", "Lko2;", "callback", "", "cookie", "Lr37;", "a", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    /* compiled from: MultiInstanceInvalidationService.kt */
    public static final class C1365b extends RemoteCallbackList<ko2> {

        /* renamed from: a */
        public final /* synthetic */ MultiInstanceInvalidationService f6872a;

        public C1365b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f6872a = multiInstanceInvalidationService;
        }

        /* renamed from: a */
        public void onCallbackDied(ko2 ko2, Object obj) {
            vx2.m53591g(ko2, "callback");
            vx2.m53591g(obj, "cookie");
            this.f6872a.mo10105b().remove((Integer) obj);
        }
    }

    /* renamed from: a */
    public final RemoteCallbackList<ko2> mo10104a() {
        return this.f6869e;
    }

    /* renamed from: b */
    public final Map<Integer, String> mo10105b() {
        return this.f6868d;
    }

    /* renamed from: c */
    public final int mo10106c() {
        return this.f6867a;
    }

    /* renamed from: d */
    public final void mo10107d(int i) {
        this.f6867a = i;
    }

    public IBinder onBind(Intent intent) {
        vx2.m53591g(intent, "intent");
        return this.f6870g;
    }
}
