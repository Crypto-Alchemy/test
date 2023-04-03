package android.support.p002v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.p002v4.media.session.C0082b;
import android.support.p002v4.media.session.MediaSessionCompat;
import android.support.p002v4.p003os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: b */
    public static final boolean f230b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    public final C0049d f231a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    public static class CustomActionResultReceiver extends ResultReceiver {
        /* renamed from: a */
        public void mo635a(int i, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    public static class ItemReceiver extends ResultReceiver {
        /* renamed from: a */
        public void mo635a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m535b(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    public static class SearchResultReceiver extends ResultReceiver {
        /* renamed from: a */
        public void mo635a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m535b(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static class C0044a {
        /* renamed from: a */
        public static MediaDescription m433a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        /* renamed from: b */
        public static int m434b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0045b extends Handler {

        /* renamed from: a */
        public final WeakReference<C0053h> f234a;

        /* renamed from: b */
        public WeakReference<Messenger> f235b;

        public C0045b(C0053h hVar) {
            this.f234a = new WeakReference<>(hVar);
        }

        /* renamed from: a */
        public void mo643a(Messenger messenger) {
            this.f235b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f235b;
            if (weakReference != null && weakReference.get() != null && this.f234a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m534a(data);
                C0053h hVar = this.f234a.get();
                Messenger messenger = this.f235b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.m534a(bundle);
                        hVar.mo659g(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i == 2) {
                        hVar.mo660i(messenger);
                    } else if (i != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unhandled message: ");
                        sb.append(message);
                        sb.append("\n  Client version: ");
                        sb.append(1);
                        sb.append("\n  Service version: ");
                        sb.append(message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.m534a(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.m534a(bundle3);
                        hVar.mo658b(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        hVar.mo660i(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static class C0046c {

        /* renamed from: a */
        public final MediaBrowser.ConnectionCallback f236a = new C0047a();

        /* renamed from: b */
        public C0048b f237b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$a */
        public class C0047a extends MediaBrowser.ConnectionCallback {
            public C0047a() {
            }

            public void onConnected() {
                C0048b bVar = C0046c.this.f237b;
                if (bVar != null) {
                    bVar.mo652d();
                }
                C0046c.this.mo645a();
            }

            public void onConnectionFailed() {
                C0048b bVar = C0046c.this.f237b;
                if (bVar != null) {
                    bVar.mo653e();
                }
                C0046c.this.mo646b();
            }

            public void onConnectionSuspended() {
                C0048b bVar = C0046c.this.f237b;
                if (bVar != null) {
                    bVar.mo654h();
                }
                C0046c.this.mo647c();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$b */
        public interface C0048b {
            /* renamed from: d */
            void mo652d();

            /* renamed from: e */
            void mo653e();

            /* renamed from: h */
            void mo654h();
        }

        /* renamed from: a */
        public void mo645a() {
            throw null;
        }

        /* renamed from: b */
        public void mo646b() {
            throw null;
        }

        /* renamed from: c */
        public void mo647c() {
            throw null;
        }

        /* renamed from: d */
        public void mo648d(C0048b bVar) {
            this.f237b = bVar;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public interface C0049d {
        /* renamed from: a */
        void mo655a();

        /* renamed from: c */
        void mo656c();

        /* renamed from: f */
        MediaSessionCompat.Token mo657f();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    public static class C0050e implements C0049d, C0053h, C0046c.C0048b {

        /* renamed from: a */
        public final Context f239a;

        /* renamed from: b */
        public final MediaBrowser f240b;

        /* renamed from: c */
        public final Bundle f241c;

        /* renamed from: d */
        public final C0045b f242d = new C0045b(this);

        /* renamed from: e */
        public final C2781lq<String, C0055j> f243e = new C2781lq<>();

        /* renamed from: f */
        public int f244f;

        /* renamed from: g */
        public C0054i f245g;

        /* renamed from: h */
        public Messenger f246h;

        /* renamed from: i */
        public MediaSessionCompat.Token f247i;

        /* renamed from: j */
        public Bundle f248j;

        public C0050e(Context context, ComponentName componentName, C0046c cVar, Bundle bundle) {
            Bundle bundle2;
            this.f239a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f241c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            cVar.mo648d(this);
            this.f240b = new MediaBrowser(context, componentName, cVar.f236a, bundle2);
        }

        /* renamed from: a */
        public void mo655a() {
            Messenger messenger;
            C0054i iVar = this.f245g;
            if (!(iVar == null || (messenger = this.f246h) == null)) {
                try {
                    iVar.mo663c(messenger);
                } catch (RemoteException unused) {
                }
            }
            this.f240b.disconnect();
        }

        /* renamed from: b */
        public void mo658b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f246h == messenger) {
                C0055j jVar = this.f243e.get(str);
                if (jVar != null) {
                    C0056k a = jVar.mo664a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo669c(str);
                            return;
                        }
                        this.f248j = bundle2;
                        a.mo667a(str, list);
                        this.f248j = null;
                    } else if (list == null) {
                        a.mo670d(str, bundle);
                    } else {
                        this.f248j = bundle2;
                        a.mo668b(str, list, bundle);
                        this.f248j = null;
                    }
                } else if (MediaBrowserCompat.f230b) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for id that isn't subscribed id=");
                    sb.append(str);
                }
            }
        }

        /* renamed from: c */
        public void mo656c() {
            this.f240b.connect();
        }

        /* renamed from: d */
        public void mo652d() {
            try {
                Bundle extras = this.f240b.getExtras();
                if (extras != null) {
                    this.f244f = extras.getInt("extra_service_version", 0);
                    IBinder a = s50.m26643a(extras, "extra_messenger");
                    if (a != null) {
                        this.f245g = new C0054i(a, this.f241c);
                        Messenger messenger = new Messenger(this.f242d);
                        this.f246h = messenger;
                        this.f242d.mo643a(messenger);
                        try {
                            this.f245g.mo661a(this.f239a, this.f246h);
                        } catch (RemoteException unused) {
                        }
                    }
                    C0082b E0 = C0082b.C0083a.m601E0(s50.m26643a(extras, "extra_session_binder"));
                    if (E0 != null) {
                        this.f247i = MediaSessionCompat.Token.m546b(this.f240b.getSessionToken(), E0);
                    }
                }
            } catch (IllegalStateException unused2) {
            }
        }

        /* renamed from: e */
        public void mo653e() {
        }

        /* renamed from: f */
        public MediaSessionCompat.Token mo657f() {
            if (this.f247i == null) {
                this.f247i = MediaSessionCompat.Token.m545a(this.f240b.getSessionToken());
            }
            return this.f247i;
        }

        /* renamed from: g */
        public void mo659g(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        /* renamed from: h */
        public void mo654h() {
            this.f245g = null;
            this.f246h = null;
            this.f247i = null;
            this.f242d.mo643a((Messenger) null);
        }

        /* renamed from: i */
        public void mo660i(Messenger messenger) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    public static class C0051f extends C0050e {
        public C0051f(Context context, ComponentName componentName, C0046c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    public static class C0052g extends C0051f {
        public C0052g(Context context, ComponentName componentName, C0046c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    public interface C0053h {
        /* renamed from: b */
        void mo658b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        /* renamed from: g */
        void mo659g(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: i */
        void mo660i(Messenger messenger);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    public static class C0054i {

        /* renamed from: a */
        public Messenger f249a;

        /* renamed from: b */
        public Bundle f250b;

        public C0054i(IBinder iBinder, Bundle bundle) {
            this.f249a = new Messenger(iBinder);
            this.f250b = bundle;
        }

        /* renamed from: a */
        public void mo661a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f250b);
            mo662b(6, bundle, messenger);
        }

        /* renamed from: b */
        public final void mo662b(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f249a.send(obtain);
        }

        /* renamed from: c */
        public void mo663c(Messenger messenger) throws RemoteException {
            mo662b(7, (Bundle) null, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    public static class C0055j {

        /* renamed from: a */
        public final List<C0056k> f251a = new ArrayList();

        /* renamed from: b */
        public final List<Bundle> f252b = new ArrayList();

        /* renamed from: a */
        public C0056k mo664a(Bundle bundle) {
            for (int i = 0; i < this.f252b.size(); i++) {
                if (pq3.m25134a(this.f252b.get(i), bundle)) {
                    return this.f251a.get(i);
                }
            }
            return null;
        }

        /* renamed from: b */
        public List<C0056k> mo665b() {
            return this.f251a;
        }

        /* renamed from: c */
        public List<Bundle> mo666c() {
            return this.f252b;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class C0056k {

        /* renamed from: a */
        public final MediaBrowser.SubscriptionCallback f253a;

        /* renamed from: b */
        public final IBinder f254b = new Binder();

        /* renamed from: c */
        public WeakReference<C0055j> f255c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$k$a */
        public class C0057a extends MediaBrowser.SubscriptionCallback {
            public C0057a() {
            }

            /* renamed from: a */
            public List<MediaItem> mo671a(List<MediaItem> list, Bundle bundle) {
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

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                C0055j jVar;
                WeakReference<C0055j> weakReference = C0056k.this.f255c;
                if (weakReference == null) {
                    jVar = null;
                } else {
                    jVar = weakReference.get();
                }
                if (jVar == null) {
                    C0056k.this.mo667a(str, MediaItem.m429b(list));
                    return;
                }
                List<MediaItem> b = MediaItem.m429b(list);
                List<C0056k> b2 = jVar.mo665b();
                List<Bundle> c = jVar.mo666c();
                for (int i = 0; i < b2.size(); i++) {
                    Bundle bundle = c.get(i);
                    if (bundle == null) {
                        C0056k.this.mo667a(str, b);
                    } else {
                        C0056k.this.mo668b(str, mo671a(b, bundle), bundle);
                    }
                }
            }

            public void onError(String str) {
                C0056k.this.mo669c(str);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$k$b */
        public class C0058b extends C0057a {
            public C0058b() {
                super();
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.m534a(bundle);
                C0056k.this.mo668b(str, MediaItem.m429b(list), bundle);
            }

            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.m534a(bundle);
                C0056k.this.mo670d(str, bundle);
            }
        }

        public C0056k() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f253a = new C0058b();
            } else {
                this.f253a = new C0057a();
            }
        }

        /* renamed from: a */
        public void mo667a(String str, List<MediaItem> list) {
        }

        /* renamed from: b */
        public void mo668b(String str, List<MediaItem> list, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo669c(String str) {
        }

        /* renamed from: d */
        public void mo670d(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0046c cVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f231a = new C0052g(context, componentName, cVar, bundle);
        } else {
            this.f231a = new C0051f(context, componentName, cVar, bundle);
        }
    }

    /* renamed from: a */
    public void mo632a() {
        this.f231a.mo656c();
    }

    /* renamed from: b */
    public void mo633b() {
        this.f231a.mo655a();
    }

    /* renamed from: c */
    public MediaSessionCompat.Token mo634c() {
        return this.f231a.mo657f();
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0043a();

        /* renamed from: a */
        public final int f232a;

        /* renamed from: d */
        public final MediaDescriptionCompat f233d;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        public class C0043a implements Parcelable.Creator<MediaItem> {
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.mo677c())) {
                this.f232a = i;
                this.f233d = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        /* renamed from: a */
        public static MediaItem m428a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.m469a(C0044a.m433a(mediaItem)), C0044a.m434b(mediaItem));
        }

        /* renamed from: b */
        public static List<MediaItem> m429b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m428a(a));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f232a + ", mDescription=" + this.f233d + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f232a);
            this.f233d.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.f232a = parcel.readInt();
            this.f233d = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
