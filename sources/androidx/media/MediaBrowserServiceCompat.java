package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.p002v4.media.MediaBrowserCompat;
import android.support.p002v4.media.session.C0082b;
import android.support.p002v4.media.session.MediaSessionCompat;
import android.support.p002v4.p003os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: x */
    public static final boolean f4010x = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: a */
    public C0745g f4011a;

    /* renamed from: d */
    public final C0743f f4012d = new C0743f("android.media.session.MediaController", -1, -1, (Bundle) null, (C0768o) null);

    /* renamed from: e */
    public final ArrayList<C0743f> f4013e = new ArrayList<>();

    /* renamed from: g */
    public final C2781lq<IBinder, C0743f> f4014g = new C2781lq<>();

    /* renamed from: k */
    public C0743f f4015k;

    /* renamed from: r */
    public final C0770q f4016r = new C0770q();

    /* renamed from: s */
    public MediaSessionCompat.Token f4017s;

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    public class C0738a extends C0756l<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f */
        public final /* synthetic */ C0743f f4018f;

        /* renamed from: g */
        public final /* synthetic */ String f4019g;

        /* renamed from: h */
        public final /* synthetic */ Bundle f4020h;

        /* renamed from: i */
        public final /* synthetic */ Bundle f4021i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0738a(Object obj, C0743f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f4018f = fVar;
            this.f4019g = str;
            this.f4020h = bundle;
            this.f4021i = bundle2;
        }

        /* renamed from: h */
        public void mo6459d(List<MediaBrowserCompat.MediaItem> list) {
            if (MediaBrowserServiceCompat.this.f4014g.get(this.f4018f.f4036f.asBinder()) == this.f4018f) {
                if ((mo6482a() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.mo6441b(list, this.f4020h);
                }
                try {
                    this.f4018f.f4036f.mo6507a(this.f4019g, list, this.f4020h, this.f4021i);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calling onLoadChildren() failed for id=");
                    sb.append(this.f4019g);
                    sb.append(" package=");
                    sb.append(this.f4018f.f4031a);
                }
            } else if (MediaBrowserServiceCompat.f4010x) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                sb2.append(this.f4018f.f4031a);
                sb2.append(" id=");
                sb2.append(this.f4019g);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    public class C0739b extends C0756l<MediaBrowserCompat.MediaItem> {

        /* renamed from: f */
        public final /* synthetic */ ResultReceiver f4023f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0739b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f4023f = resultReceiver;
        }

        /* renamed from: h */
        public void mo6459d(MediaBrowserCompat.MediaItem mediaItem) {
            if ((mo6482a() & 2) != 0) {
                this.f4023f.mo793b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f4023f.mo793b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    public class C0740c extends C0756l<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f */
        public final /* synthetic */ ResultReceiver f4025f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0740c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f4025f = resultReceiver;
        }

        /* renamed from: h */
        public void mo6459d(List<MediaBrowserCompat.MediaItem> list) {
            if ((mo6482a() & 4) != 0 || list == null) {
                this.f4025f.mo793b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f4025f.mo793b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    public class C0741d extends C0756l<Bundle> {

        /* renamed from: f */
        public final /* synthetic */ ResultReceiver f4027f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0741d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f4027f = resultReceiver;
        }

        /* renamed from: c */
        public void mo6463c(Bundle bundle) {
            this.f4027f.mo793b(-1, bundle);
        }

        /* renamed from: h */
        public void mo6459d(Bundle bundle) {
            this.f4027f.mo793b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    public static final class C0742e {

        /* renamed from: a */
        public final String f4029a;

        /* renamed from: b */
        public final Bundle f4030b;

        public C0742e(String str, Bundle bundle) {
            if (str != null) {
                this.f4029a = str;
                this.f4030b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }

        /* renamed from: c */
        public Bundle mo6465c() {
            return this.f4030b;
        }

        /* renamed from: d */
        public String mo6466d() {
            return this.f4029a;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    public class C0743f implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f4031a;

        /* renamed from: b */
        public final int f4032b;

        /* renamed from: c */
        public final int f4033c;

        /* renamed from: d */
        public final rr3 f4034d;

        /* renamed from: e */
        public final Bundle f4035e;

        /* renamed from: f */
        public final C0768o f4036f;

        /* renamed from: g */
        public final HashMap<String, List<jl4<IBinder, Bundle>>> f4037g = new HashMap<>();

        /* renamed from: h */
        public C0742e f4038h;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$f$a */
        public class C0744a implements Runnable {
            public C0744a() {
            }

            public void run() {
                C0743f fVar = C0743f.this;
                MediaBrowserServiceCompat.this.f4014g.remove(fVar.f4036f.asBinder());
            }
        }

        public C0743f(String str, int i, int i2, Bundle bundle, C0768o oVar) {
            this.f4031a = str;
            this.f4032b = i;
            this.f4033c = i2;
            this.f4034d = new rr3(str, i, i2);
            this.f4035e = bundle;
            this.f4036f = oVar;
        }

        public void binderDied() {
            MediaBrowserServiceCompat.this.f4016r.post(new C0744a());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    public interface C0745g {
        /* renamed from: a */
        void mo6469a();

        /* renamed from: b */
        IBinder mo6470b(Intent intent);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$h */
    public class C0746h implements C0745g {

        /* renamed from: a */
        public final List<Bundle> f4041a = new ArrayList();

        /* renamed from: b */
        public MediaBrowserService f4042b;

        /* renamed from: c */
        public Messenger f4043c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$a */
        public class C0747a extends C0756l<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f */
            public final /* synthetic */ C0757m f4045f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0747a(Object obj, C0757m mVar) {
                super(obj);
                this.f4045f = mVar;
            }

            /* renamed from: h */
            public void mo6459d(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                        Parcel obtain = Parcel.obtain();
                        writeToParcel.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f4045f.mo6488b(arrayList);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$b */
        public class C0748b extends MediaBrowserService {
            public C0748b(Context context) {
                attachBaseContext(context);
            }

            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                Bundle bundle2;
                MediaSessionCompat.m534a(bundle);
                C0746h hVar = C0746h.this;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                C0742e c = hVar.mo6471c(str, i, bundle2);
                if (c == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(c.f4029a, c.f4030b);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                C0746h.this.mo6472d(str, new C0757m(result));
            }
        }

        public C0746h() {
        }

        /* renamed from: b */
        public IBinder mo6470b(Intent intent) {
            return this.f4042b.onBind(intent);
        }

        /* renamed from: c */
        public C0742e mo6471c(String str, int i, Bundle bundle) {
            int i2;
            Bundle bundle2;
            IBinder iBinder;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                i2 = -1;
                bundle2 = null;
            } else {
                bundle.remove("extra_client_version");
                this.f4043c = new Messenger(MediaBrowserServiceCompat.this.f4016r);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                s50.m26644b(bundle2, "extra_messenger", this.f4043c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f4017s;
                if (token != null) {
                    C0082b c = token.mo757c();
                    if (c == null) {
                        iBinder = null;
                    } else {
                        iBinder = c.asBinder();
                    }
                    s50.m26644b(bundle2, "extra_session_binder", iBinder);
                } else {
                    this.f4041a.add(bundle2);
                }
                int i3 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
                i2 = i3;
            }
            C0743f fVar = new C0743f(str, i2, i, bundle, (C0768o) null);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f4015k = fVar;
            C0742e e = mediaBrowserServiceCompat.mo6445e(str, i, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.f4015k = null;
            if (e == null) {
                return null;
            }
            if (this.f4043c != null) {
                mediaBrowserServiceCompat2.f4013e.add(fVar);
            }
            if (bundle2 == null) {
                bundle2 = e.mo6465c();
            } else if (e.mo6465c() != null) {
                bundle2.putAll(e.mo6465c());
            }
            return new C0742e(e.mo6466d(), bundle2);
        }

        /* renamed from: d */
        public void mo6472d(String str, C0757m<List<Parcel>> mVar) {
            C0747a aVar = new C0747a(str, mVar);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f4015k = mediaBrowserServiceCompat.f4012d;
            mediaBrowserServiceCompat.mo6446f(str, aVar);
            MediaBrowserServiceCompat.this.f4015k = null;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$i */
    public class C0749i extends C0746h {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$a */
        public class C0750a extends C0756l<MediaBrowserCompat.MediaItem> {

            /* renamed from: f */
            public final /* synthetic */ C0757m f4049f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0750a(Object obj, C0757m mVar) {
                super(obj);
                this.f4049f = mVar;
            }

            /* renamed from: h */
            public void mo6459d(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f4049f.mo6488b(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f4049f.mo6488b(obtain);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$b */
        public class C0751b extends C0746h.C0748b {
            public C0751b(Context context) {
                super(context);
            }

            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                C0749i.this.mo6476e(str, new C0757m(result));
            }
        }

        public C0749i() {
            super();
        }

        /* renamed from: a */
        public void mo6469a() {
            C0751b bVar = new C0751b(MediaBrowserServiceCompat.this);
            this.f4042b = bVar;
            bVar.onCreate();
        }

        /* renamed from: e */
        public void mo6476e(String str, C0757m<Parcel> mVar) {
            C0750a aVar = new C0750a(str, mVar);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f4015k = mediaBrowserServiceCompat.f4012d;
            mediaBrowserServiceCompat.mo6448h(str, aVar);
            MediaBrowserServiceCompat.this.f4015k = null;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$j */
    public class C0752j extends C0749i {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$a */
        public class C0753a extends C0756l<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f */
            public final /* synthetic */ C0757m f4053f;

            /* renamed from: g */
            public final /* synthetic */ Bundle f4054g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0753a(Object obj, C0757m mVar, Bundle bundle) {
                super(obj);
                this.f4053f = mVar;
                this.f4054g = bundle;
            }

            /* renamed from: h */
            public void mo6459d(List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f4053f.mo6488b(null);
                    return;
                }
                if ((mo6482a() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.mo6441b(list, this.f4054g);
                }
                ArrayList arrayList = new ArrayList();
                for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                    Parcel obtain = Parcel.obtain();
                    writeToParcel.writeToParcel(obtain, 0);
                    arrayList.add(obtain);
                }
                this.f4053f.mo6488b(arrayList);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$b */
        public class C0754b extends C0749i.C0751b {
            public C0754b(Context context) {
                super(context);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.m534a(bundle);
                C0752j jVar = C0752j.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f4015k = mediaBrowserServiceCompat.f4012d;
                jVar.mo6479f(str, new C0757m(result), bundle);
                MediaBrowserServiceCompat.this.f4015k = null;
            }
        }

        public C0752j() {
            super();
        }

        /* renamed from: a */
        public void mo6469a() {
            C0754b bVar = new C0754b(MediaBrowserServiceCompat.this);
            this.f4042b = bVar;
            bVar.onCreate();
        }

        /* renamed from: f */
        public void mo6479f(String str, C0757m<List<Parcel>> mVar, Bundle bundle) {
            C0753a aVar = new C0753a(str, mVar, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f4015k = mediaBrowserServiceCompat.f4012d;
            mediaBrowserServiceCompat.mo6447g(str, aVar, bundle);
            MediaBrowserServiceCompat.this.f4015k = null;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$k */
    public class C0755k extends C0752j {
        public C0755k() {
            super();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$l */
    public static class C0756l<T> {

        /* renamed from: a */
        public final Object f4058a;

        /* renamed from: b */
        public boolean f4059b;

        /* renamed from: c */
        public boolean f4060c;

        /* renamed from: d */
        public boolean f4061d;

        /* renamed from: e */
        public int f4062e;

        public C0756l(Object obj) {
            this.f4058a = obj;
        }

        /* renamed from: a */
        public int mo6482a() {
            return this.f4062e;
        }

        /* renamed from: b */
        public boolean mo6483b() {
            if (this.f4059b || this.f4060c || this.f4061d) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void mo6463c(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f4058a);
        }

        /* renamed from: d */
        public void mo6459d(T t) {
            throw null;
        }

        /* renamed from: e */
        public void mo6484e(Bundle bundle) {
            if (this.f4060c || this.f4061d) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f4058a);
            }
            this.f4061d = true;
            mo6463c(bundle);
        }

        /* renamed from: f */
        public void mo6485f(T t) {
            if (this.f4060c || this.f4061d) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f4058a);
            }
            this.f4060c = true;
            mo6459d(t);
        }

        /* renamed from: g */
        public void mo6486g(int i) {
            this.f4062e = i;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$m */
    public static class C0757m<T> {

        /* renamed from: a */
        public MediaBrowserService.Result f4063a;

        public C0757m(MediaBrowserService.Result result) {
            this.f4063a = result;
        }

        /* renamed from: a */
        public List<MediaBrowser.MediaItem> mo6487a(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel next : list) {
                next.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(next));
                next.recycle();
            }
            return arrayList;
        }

        /* renamed from: b */
        public void mo6488b(T t) {
            if (t instanceof List) {
                this.f4063a.sendResult(mo6487a((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.f4063a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f4063a.sendResult((Object) null);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$n */
    public class C0758n {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$a */
        public class C0759a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0768o f4065a;

            /* renamed from: d */
            public final /* synthetic */ String f4066d;

            /* renamed from: e */
            public final /* synthetic */ int f4067e;

            /* renamed from: g */
            public final /* synthetic */ int f4068g;

            /* renamed from: k */
            public final /* synthetic */ Bundle f4069k;

            public C0759a(C0768o oVar, String str, int i, int i2, Bundle bundle) {
                this.f4065a = oVar;
                this.f4066d = str;
                this.f4067e = i;
                this.f4068g = i2;
                this.f4069k = bundle;
            }

            public void run() {
                IBinder asBinder = this.f4065a.asBinder();
                MediaBrowserServiceCompat.this.f4014g.remove(asBinder);
                C0743f fVar = new C0743f(this.f4066d, this.f4067e, this.f4068g, this.f4069k, this.f4065a);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f4015k = fVar;
                C0742e e = mediaBrowserServiceCompat.mo6445e(this.f4066d, this.f4068g, this.f4069k);
                fVar.f4038h = e;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.f4015k = null;
                if (e == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No root for client ");
                    sb.append(this.f4066d);
                    sb.append(" from service ");
                    sb.append(getClass().getName());
                    try {
                        this.f4065a.mo6509b();
                    } catch (RemoteException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                        sb2.append(this.f4066d);
                    }
                } else {
                    try {
                        mediaBrowserServiceCompat2.f4014g.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (MediaBrowserServiceCompat.this.f4017s != null) {
                            this.f4065a.mo6510c(fVar.f4038h.mo6466d(), MediaBrowserServiceCompat.this.f4017s, fVar.f4038h.mo6465c());
                        }
                    } catch (RemoteException unused2) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Calling onConnect() failed. Dropping client. pkg=");
                        sb3.append(this.f4066d);
                        MediaBrowserServiceCompat.this.f4014g.remove(asBinder);
                    }
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$b */
        public class C0760b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0768o f4071a;

            public C0760b(C0768o oVar) {
                this.f4071a = oVar;
            }

            public void run() {
                C0743f remove = MediaBrowserServiceCompat.this.f4014g.remove(this.f4071a.asBinder());
                if (remove != null) {
                    remove.f4036f.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$c */
        public class C0761c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0768o f4073a;

            /* renamed from: d */
            public final /* synthetic */ String f4074d;

            /* renamed from: e */
            public final /* synthetic */ IBinder f4075e;

            /* renamed from: g */
            public final /* synthetic */ Bundle f4076g;

            public C0761c(C0768o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.f4073a = oVar;
                this.f4074d = str;
                this.f4075e = iBinder;
                this.f4076g = bundle;
            }

            public void run() {
                C0743f fVar = MediaBrowserServiceCompat.this.f4014g.get(this.f4073a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("addSubscription for callback that isn't registered id=");
                    sb.append(this.f4074d);
                    return;
                }
                MediaBrowserServiceCompat.this.mo6440a(this.f4074d, fVar, this.f4075e, this.f4076g);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$d */
        public class C0762d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0768o f4078a;

            /* renamed from: d */
            public final /* synthetic */ String f4079d;

            /* renamed from: e */
            public final /* synthetic */ IBinder f4080e;

            public C0762d(C0768o oVar, String str, IBinder iBinder) {
                this.f4078a = oVar;
                this.f4079d = str;
                this.f4080e = iBinder;
            }

            public void run() {
                C0743f fVar = MediaBrowserServiceCompat.this.f4014g.get(this.f4078a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeSubscription for callback that isn't registered id=");
                    sb.append(this.f4079d);
                } else if (!MediaBrowserServiceCompat.this.mo6458p(this.f4079d, fVar, this.f4080e)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("removeSubscription called for ");
                    sb2.append(this.f4079d);
                    sb2.append(" which is not subscribed");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$e */
        public class C0763e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0768o f4082a;

            /* renamed from: d */
            public final /* synthetic */ String f4083d;

            /* renamed from: e */
            public final /* synthetic */ ResultReceiver f4084e;

            public C0763e(C0768o oVar, String str, ResultReceiver resultReceiver) {
                this.f4082a = oVar;
                this.f4083d = str;
                this.f4084e = resultReceiver;
            }

            public void run() {
                C0743f fVar = MediaBrowserServiceCompat.this.f4014g.get(this.f4082a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getMediaItem for callback that isn't registered id=");
                    sb.append(this.f4083d);
                    return;
                }
                MediaBrowserServiceCompat.this.mo6454n(this.f4083d, fVar, this.f4084e);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$f */
        public class C0764f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0768o f4086a;

            /* renamed from: d */
            public final /* synthetic */ int f4087d;

            /* renamed from: e */
            public final /* synthetic */ String f4088e;

            /* renamed from: g */
            public final /* synthetic */ int f4089g;

            /* renamed from: k */
            public final /* synthetic */ Bundle f4090k;

            public C0764f(C0768o oVar, int i, String str, int i2, Bundle bundle) {
                this.f4086a = oVar;
                this.f4087d = i;
                this.f4088e = str;
                this.f4089g = i2;
                this.f4090k = bundle;
            }

            public void run() {
                C0743f fVar;
                IBinder asBinder = this.f4086a.asBinder();
                MediaBrowserServiceCompat.this.f4014g.remove(asBinder);
                Iterator<C0743f> it = MediaBrowserServiceCompat.this.f4013e.iterator();
                while (true) {
                    fVar = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    C0743f next = it.next();
                    if (next.f4033c == this.f4087d) {
                        if (TextUtils.isEmpty(this.f4088e) || this.f4089g <= 0) {
                            fVar = new C0743f(next.f4031a, next.f4032b, next.f4033c, this.f4090k, this.f4086a);
                        }
                        it.remove();
                    }
                }
                if (fVar == null) {
                    fVar = new C0743f(this.f4088e, this.f4089g, this.f4087d, this.f4090k, this.f4086a);
                }
                MediaBrowserServiceCompat.this.f4014g.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$g */
        public class C0765g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0768o f4092a;

            public C0765g(C0768o oVar) {
                this.f4092a = oVar;
            }

            public void run() {
                IBinder asBinder = this.f4092a.asBinder();
                C0743f remove = MediaBrowserServiceCompat.this.f4014g.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$h */
        public class C0766h implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0768o f4094a;

            /* renamed from: d */
            public final /* synthetic */ String f4095d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f4096e;

            /* renamed from: g */
            public final /* synthetic */ ResultReceiver f4097g;

            public C0766h(C0768o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f4094a = oVar;
                this.f4095d = str;
                this.f4096e = bundle;
                this.f4097g = resultReceiver;
            }

            public void run() {
                C0743f fVar = MediaBrowserServiceCompat.this.f4014g.get(this.f4094a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("search for callback that isn't registered query=");
                    sb.append(this.f4095d);
                    return;
                }
                MediaBrowserServiceCompat.this.mo6455o(this.f4095d, this.f4096e, fVar, this.f4097g);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$i */
        public class C0767i implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0768o f4099a;

            /* renamed from: d */
            public final /* synthetic */ String f4100d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f4101e;

            /* renamed from: g */
            public final /* synthetic */ ResultReceiver f4102g;

            public C0767i(C0768o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f4099a = oVar;
                this.f4100d = str;
                this.f4101e = bundle;
                this.f4102g = resultReceiver;
            }

            public void run() {
                C0743f fVar = MediaBrowserServiceCompat.this.f4014g.get(this.f4099a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("sendCustomAction for callback that isn't registered action=");
                    sb.append(this.f4100d);
                    sb.append(", extras=");
                    sb.append(this.f4101e);
                    return;
                }
                MediaBrowserServiceCompat.this.mo6452l(this.f4100d, this.f4101e, fVar, this.f4102g);
            }
        }

        public C0758n() {
        }

        /* renamed from: a */
        public void mo6489a(String str, IBinder iBinder, Bundle bundle, C0768o oVar) {
            MediaBrowserServiceCompat.this.f4016r.mo6512a(new C0761c(oVar, str, iBinder, bundle));
        }

        /* renamed from: b */
        public void mo6490b(String str, int i, int i2, Bundle bundle, C0768o oVar) {
            if (MediaBrowserServiceCompat.this.mo6442c(str, i2)) {
                MediaBrowserServiceCompat.this.f4016r.mo6512a(new C0759a(oVar, str, i, i2, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
        }

        /* renamed from: c */
        public void mo6491c(C0768o oVar) {
            MediaBrowserServiceCompat.this.f4016r.mo6512a(new C0760b(oVar));
        }

        /* renamed from: d */
        public void mo6492d(String str, ResultReceiver resultReceiver, C0768o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f4016r.mo6512a(new C0763e(oVar, str, resultReceiver));
            }
        }

        /* renamed from: e */
        public void mo6493e(C0768o oVar, String str, int i, int i2, Bundle bundle) {
            MediaBrowserServiceCompat.this.f4016r.mo6512a(new C0764f(oVar, i2, str, i, bundle));
        }

        /* renamed from: f */
        public void mo6494f(String str, IBinder iBinder, C0768o oVar) {
            MediaBrowserServiceCompat.this.f4016r.mo6512a(new C0762d(oVar, str, iBinder));
        }

        /* renamed from: g */
        public void mo6495g(String str, Bundle bundle, ResultReceiver resultReceiver, C0768o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f4016r.mo6512a(new C0766h(oVar, str, bundle, resultReceiver));
            }
        }

        /* renamed from: h */
        public void mo6496h(String str, Bundle bundle, ResultReceiver resultReceiver, C0768o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f4016r.mo6512a(new C0767i(oVar, str, bundle, resultReceiver));
            }
        }

        /* renamed from: i */
        public void mo6497i(C0768o oVar) {
            MediaBrowserServiceCompat.this.f4016r.mo6512a(new C0765g(oVar));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$o */
    public interface C0768o {
        /* renamed from: a */
        void mo6507a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        /* renamed from: b */
        void mo6509b() throws RemoteException;

        /* renamed from: c */
        void mo6510c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$p */
    public static class C0769p implements C0768o {

        /* renamed from: a */
        public final Messenger f4104a;

        public C0769p(Messenger messenger) {
            this.f4104a = messenger;
        }

        /* renamed from: a */
        public void mo6507a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            ArrayList arrayList;
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                if (list instanceof ArrayList) {
                    arrayList = (ArrayList) list;
                } else {
                    arrayList = new ArrayList(list);
                }
                bundle3.putParcelableArrayList("data_media_item_list", arrayList);
            }
            mo6511d(3, bundle3);
        }

        public IBinder asBinder() {
            return this.f4104a.getBinder();
        }

        /* renamed from: b */
        public void mo6509b() throws RemoteException {
            mo6511d(2, (Bundle) null);
        }

        /* renamed from: c */
        public void mo6510c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            mo6511d(1, bundle2);
        }

        /* renamed from: d */
        public final void mo6511d(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f4104a.send(obtain);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$q */
    public final class C0770q extends Handler {

        /* renamed from: a */
        public final C0758n f4105a;

        public C0770q() {
            this.f4105a = new C0758n();
        }

        /* renamed from: a */
        public void mo6512a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m534a(bundle);
                    this.f4105a.mo6490b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new C0769p(message.replyTo));
                    return;
                case 2:
                    this.f4105a.mo6491c(new C0769p(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m534a(bundle2);
                    this.f4105a.mo6489a(data.getString("data_media_item_id"), s50.m26643a(data, "data_callback_token"), bundle2, new C0769p(message.replyTo));
                    return;
                case 4:
                    this.f4105a.mo6494f(data.getString("data_media_item_id"), s50.m26643a(data, "data_callback_token"), new C0769p(message.replyTo));
                    return;
                case 5:
                    this.f4105a.mo6492d(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C0769p(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m534a(bundle3);
                    C0758n nVar = this.f4105a;
                    C0769p pVar = new C0769p(message.replyTo);
                    nVar.mo6493e(pVar, data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.f4105a.mo6497i(new C0769p(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m534a(bundle4);
                    this.f4105a.mo6495g(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new C0769p(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m534a(bundle5);
                    this.f4105a.mo6496h(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new C0769p(message.replyTo));
                    return;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unhandled message: ");
                    sb.append(message);
                    sb.append("\n  Service version: ");
                    sb.append(2);
                    sb.append("\n  Client version: ");
                    sb.append(message.arg1);
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    /* renamed from: a */
    public void mo6440a(String str, C0743f fVar, IBinder iBinder, Bundle bundle) {
        List<jl4> list = fVar.f4037g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (jl4 jl4 : list) {
            if (iBinder == jl4.f13688a && pq3.m25134a(bundle, (Bundle) jl4.f13689b)) {
                return;
            }
        }
        list.add(new jl4(iBinder, bundle));
        fVar.f4037g.put(str, list);
        mo6453m(str, fVar, bundle, (Bundle) null);
        this.f4015k = fVar;
        mo6450j(str, bundle);
        this.f4015k = null;
    }

    /* renamed from: b */
    public List<MediaBrowserCompat.MediaItem> mo6441b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }

    /* renamed from: c */
    public boolean mo6442c(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void mo6443d(String str, Bundle bundle, C0756l<Bundle> lVar) {
        lVar.mo6484e((Bundle) null);
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public abstract C0742e mo6445e(String str, int i, Bundle bundle);

    /* renamed from: f */
    public abstract void mo6446f(String str, C0756l<List<MediaBrowserCompat.MediaItem>> lVar);

    /* renamed from: g */
    public void mo6447g(String str, C0756l<List<MediaBrowserCompat.MediaItem>> lVar, Bundle bundle) {
        lVar.mo6486g(1);
        mo6446f(str, lVar);
    }

    /* renamed from: h */
    public void mo6448h(String str, C0756l<MediaBrowserCompat.MediaItem> lVar) {
        lVar.mo6486g(2);
        lVar.mo6485f(null);
    }

    /* renamed from: i */
    public void mo6449i(String str, Bundle bundle, C0756l<List<MediaBrowserCompat.MediaItem>> lVar) {
        lVar.mo6486g(4);
        lVar.mo6485f(null);
    }

    /* renamed from: j */
    public void mo6450j(String str, Bundle bundle) {
    }

    /* renamed from: k */
    public void mo6451k(String str) {
    }

    /* renamed from: l */
    public void mo6452l(String str, Bundle bundle, C0743f fVar, ResultReceiver resultReceiver) {
        C0741d dVar = new C0741d(str, resultReceiver);
        this.f4015k = fVar;
        mo6443d(str, bundle, dVar);
        this.f4015k = null;
        if (!dVar.mo6483b()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }

    /* renamed from: m */
    public void mo6453m(String str, C0743f fVar, Bundle bundle, Bundle bundle2) {
        C0738a aVar = new C0738a(str, fVar, str, bundle, bundle2);
        this.f4015k = fVar;
        if (bundle == null) {
            mo6446f(str, aVar);
        } else {
            mo6447g(str, aVar, bundle);
        }
        this.f4015k = null;
        if (!aVar.mo6483b()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f4031a + " id=" + str);
        }
    }

    /* renamed from: n */
    public void mo6454n(String str, C0743f fVar, ResultReceiver resultReceiver) {
        C0739b bVar = new C0739b(str, resultReceiver);
        this.f4015k = fVar;
        mo6448h(str, bVar);
        this.f4015k = null;
        if (!bVar.mo6483b()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    /* renamed from: o */
    public void mo6455o(String str, Bundle bundle, C0743f fVar, ResultReceiver resultReceiver) {
        C0740c cVar = new C0740c(str, resultReceiver);
        this.f4015k = fVar;
        mo6449i(str, bundle, cVar);
        this.f4015k = null;
        if (!cVar.mo6483b()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f4011a.mo6470b(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f4011a = new C0755k();
        } else if (i >= 26) {
            this.f4011a = new C0752j();
        } else {
            this.f4011a = new C0749i();
        }
        this.f4011a.mo6469a();
    }

    /* renamed from: p */
    public boolean mo6458p(String str, C0743f fVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (fVar.f4037g.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.f4015k = fVar;
                mo6451k(str);
                this.f4015k = null;
            }
        } else {
            List list = fVar.f4037g.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((jl4) it.next()).f13688a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.f4037g.remove(str);
                }
            }
            this.f4015k = fVar;
            mo6451k(str);
            this.f4015k = null;
            return z2;
        }
    }
}
