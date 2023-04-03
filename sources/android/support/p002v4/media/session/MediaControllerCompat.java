package android.support.p002v4.media.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p002v4.media.MediaMetadataCompat;
import android.support.p002v4.media.session.C0080a;
import android.support.p002v4.media.session.C0082b;
import android.support.p002v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: a */
    public final C0069b f283a;

    /* renamed from: b */
    public final MediaSessionCompat.Token f284b;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: c */
    public final ConcurrentHashMap<C0066a, Boolean> f285c = new ConcurrentHashMap<>();

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    public static class MediaControllerImplApi21 implements C0069b {

        /* renamed from: a */
        public final MediaController f286a;

        /* renamed from: b */
        public final Object f287b = new Object();

        /* renamed from: c */
        public final List<C0066a> f288c = new ArrayList();

        /* renamed from: d */
        public HashMap<C0066a, C0065a> f289d = new HashMap<>();

        /* renamed from: e */
        public final MediaSessionCompat.Token f290e;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            public WeakReference<MediaControllerImplApi21> f291a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.f291a = new WeakReference<>(mediaControllerImplApi21);
            }

            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f291a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f287b) {
                        mediaControllerImplApi21.f290e.mo760e(C0082b.C0083a.m601E0(s50.m26643a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f290e.mo762f(bm4.m11450b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.mo709b();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        public static class C0065a extends C0066a.C0068b {
            public C0065a(C0066a aVar) {
                super(aVar);
            }

            /* renamed from: J0 */
            public void mo713J0(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: K */
            public void mo714K() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: L */
            public void mo715L(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: h0 */
            public void mo716h0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: s0 */
            public void mo717s0(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: y */
            public void mo718y(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f290e = token;
            this.f286a = new MediaController(context, (MediaSession.Token) token.mo758d());
            if (token.mo757c() == null) {
                mo710c();
            }
        }

        /* renamed from: a */
        public boolean mo708a(KeyEvent keyEvent) {
            return this.f286a.dispatchMediaButtonEvent(keyEvent);
        }

        /* renamed from: b */
        public void mo709b() {
            if (this.f290e.mo757c() != null) {
                for (C0066a next : this.f288c) {
                    C0065a aVar = new C0065a(next);
                    this.f289d.put(next, aVar);
                    next.f293b = aVar;
                    try {
                        this.f290e.mo757c().mo791k0(aVar);
                        next.mo728i(13, (Object) null, (Bundle) null);
                    } catch (RemoteException unused) {
                    }
                }
                this.f288c.clear();
            }
        }

        /* renamed from: c */
        public final void mo710c() {
            mo711d("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }

        /* renamed from: d */
        public void mo711d(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f286a.sendCommand(str, bundle, resultReceiver);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0066a implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final MediaController.Callback f292a = new C0067a(this);

        /* renamed from: b */
        public C0080a f293b;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        public static class C0067a extends MediaController.Callback {

            /* renamed from: a */
            public final WeakReference<C0066a> f294a;

            public C0067a(C0066a aVar) {
                this.f294a = new WeakReference<>(aVar);
            }

            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                C0066a aVar = this.f294a.get();
                if (aVar != null) {
                    aVar.mo719a(new C0070c(playbackInfo.getPlaybackType(), AudioAttributesCompat.m5165c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m534a(bundle);
                C0066a aVar = this.f294a.get();
                if (aVar != null) {
                    aVar.mo720b(bundle);
                }
            }

            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                C0066a aVar = this.f294a.get();
                if (aVar != null) {
                    aVar.mo722c(MediaMetadataCompat.m501a(mediaMetadata));
                }
            }

            public void onPlaybackStateChanged(PlaybackState playbackState) {
                C0066a aVar = this.f294a.get();
                if (aVar != null && aVar.f293b == null) {
                    aVar.mo723d(PlaybackStateCompat.m555a(playbackState));
                }
            }

            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                C0066a aVar = this.f294a.get();
                if (aVar != null) {
                    aVar.mo724e(MediaSessionCompat.QueueItem.m537b(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                C0066a aVar = this.f294a.get();
                if (aVar != null) {
                    aVar.mo725f(charSequence);
                }
            }

            public void onSessionDestroyed() {
                C0066a aVar = this.f294a.get();
                if (aVar != null) {
                    aVar.mo726g();
                }
            }

            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m534a(bundle);
                C0066a aVar = this.f294a.get();
                if (aVar != null) {
                    C0080a aVar2 = aVar.f293b;
                    aVar.mo727h(str, bundle);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        public static class C0068b extends C0080a.C0081a {

            /* renamed from: a */
            public final WeakReference<C0066a> f295a;

            public C0068b(C0066a aVar) {
                this.f295a = new WeakReference<>(aVar);
            }

            /* renamed from: A0 */
            public void mo737A0(boolean z) throws RemoteException {
                C0066a aVar = this.f295a.get();
                if (aVar != null) {
                    aVar.mo728i(11, Boolean.valueOf(z), (Bundle) null);
                }
            }

            /* renamed from: I0 */
            public void mo738I0(boolean z) throws RemoteException {
            }

            /* renamed from: S */
            public void mo739S(int i) throws RemoteException {
                C0066a aVar = this.f295a.get();
                if (aVar != null) {
                    aVar.mo728i(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo740a(String str, Bundle bundle) throws RemoteException {
                C0066a aVar = this.f295a.get();
                if (aVar != null) {
                    aVar.mo728i(1, str, bundle);
                }
            }

            /* renamed from: n1 */
            public void mo741n1(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                C0066a aVar = this.f295a.get();
                if (aVar != null) {
                    aVar.mo728i(2, playbackStateCompat, (Bundle) null);
                }
            }

            /* renamed from: w */
            public void mo742w(int i) throws RemoteException {
                C0066a aVar = this.f295a.get();
                if (aVar != null) {
                    aVar.mo728i(9, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: x */
            public void mo743x() throws RemoteException {
                C0066a aVar = this.f295a.get();
                if (aVar != null) {
                    aVar.mo728i(13, (Object) null, (Bundle) null);
                }
            }
        }

        /* renamed from: a */
        public void mo719a(C0070c cVar) {
        }

        /* renamed from: b */
        public void mo720b(Bundle bundle) {
        }

        public void binderDied() {
            mo728i(8, (Object) null, (Bundle) null);
        }

        /* renamed from: c */
        public void mo722c(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: d */
        public void mo723d(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: e */
        public void mo724e(List<MediaSessionCompat.QueueItem> list) {
        }

        /* renamed from: f */
        public void mo725f(CharSequence charSequence) {
        }

        /* renamed from: g */
        public void mo726g() {
        }

        /* renamed from: h */
        public void mo727h(String str, Bundle bundle) {
        }

        /* renamed from: i */
        public void mo728i(int i, Object obj, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    public interface C0069b {
        /* renamed from: a */
        boolean mo708a(KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    public static final class C0070c {

        /* renamed from: a */
        public final int f296a;

        /* renamed from: b */
        public final AudioAttributesCompat f297b;

        /* renamed from: c */
        public final int f298c;

        /* renamed from: d */
        public final int f299d;

        /* renamed from: e */
        public final int f300e;

        public C0070c(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.f296a = i;
            this.f297b = audioAttributesCompat;
            this.f298c = i2;
            this.f299d = i3;
            this.f300e = i4;
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f284b = token;
            this.f283a = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    /* renamed from: a */
    public boolean mo707a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f283a.mo708a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
}
