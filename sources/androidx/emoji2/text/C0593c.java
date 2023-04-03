package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: androidx.emoji2.text.c */
/* compiled from: EmojiCompat */
public class C0593c {

    /* renamed from: n */
    public static final Object f3530n = new Object();

    /* renamed from: o */
    public static final Object f3531o = new Object();

    /* renamed from: p */
    public static volatile C0593c f3532p;

    /* renamed from: a */
    public final ReadWriteLock f3533a = new ReentrantReadWriteLock();

    /* renamed from: b */
    public final Set<C0599e> f3534b;

    /* renamed from: c */
    public volatile int f3535c = 3;

    /* renamed from: d */
    public final Handler f3536d;

    /* renamed from: e */
    public final C0596b f3537e;

    /* renamed from: f */
    public final C0601g f3538f;

    /* renamed from: g */
    public final boolean f3539g;

    /* renamed from: h */
    public final boolean f3540h;

    /* renamed from: i */
    public final int[] f3541i;

    /* renamed from: j */
    public final boolean f3542j;

    /* renamed from: k */
    public final int f3543k;

    /* renamed from: l */
    public final int f3544l;

    /* renamed from: m */
    public final C0598d f3545m;

    /* renamed from: androidx.emoji2.text.c$a */
    /* compiled from: EmojiCompat */
    public static final class C0594a extends C0596b {

        /* renamed from: b */
        public volatile C0604d f3546b;

        /* renamed from: c */
        public volatile C0610f f3547c;

        /* renamed from: androidx.emoji2.text.c$a$a */
        /* compiled from: EmojiCompat */
        public class C0595a extends C0602h {
            public C0595a() {
            }

            /* renamed from: a */
            public void mo5605a(Throwable th) {
                C0594a.this.f3549a.mo5625m(th);
            }

            /* renamed from: b */
            public void mo5606b(C0610f fVar) {
                C0594a.this.mo5637d(fVar);
            }
        }

        public C0594a(C0593c cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public void mo5634a() {
            try {
                this.f3549a.f3538f.mo5603a(new C0595a());
            } catch (Throwable th) {
                this.f3549a.mo5625m(th);
            }
        }

        /* renamed from: b */
        public CharSequence mo5635b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f3546b.mo5644h(charSequence, i, i2, i3, z);
        }

        /* renamed from: c */
        public void mo5636c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f3547c.mo5663e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f3549a.f3539g);
        }

        /* renamed from: d */
        public void mo5637d(C0610f fVar) {
            if (fVar == null) {
                this.f3549a.mo5625m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f3547c = fVar;
            C0610f fVar2 = this.f3547c;
            C0603i iVar = new C0603i();
            C0598d a = this.f3549a.f3545m;
            C0593c cVar = this.f3549a;
            this.f3546b = new C0604d(fVar2, iVar, a, cVar.f3540h, cVar.f3541i);
            this.f3549a.mo5626n();
        }
    }

    /* renamed from: androidx.emoji2.text.c$b */
    /* compiled from: EmojiCompat */
    public static class C0596b {

        /* renamed from: a */
        public final C0593c f3549a;

        public C0596b(C0593c cVar) {
            this.f3549a = cVar;
        }

        /* renamed from: a */
        public void mo5634a() {
            throw null;
        }

        /* renamed from: b */
        public CharSequence mo5635b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            throw null;
        }

        /* renamed from: c */
        public void mo5636c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.c$c */
    /* compiled from: EmojiCompat */
    public static abstract class C0597c {

        /* renamed from: a */
        public final C0601g f3550a;

        /* renamed from: b */
        public boolean f3551b;

        /* renamed from: c */
        public boolean f3552c;

        /* renamed from: d */
        public int[] f3553d;

        /* renamed from: e */
        public Set<C0599e> f3554e;

        /* renamed from: f */
        public boolean f3555f;

        /* renamed from: g */
        public int f3556g = -16711936;

        /* renamed from: h */
        public int f3557h = 0;

        /* renamed from: i */
        public C0598d f3558i = new C0592b();

        public C0597c(C0601g gVar) {
            gu4.m18429g(gVar, "metadataLoader cannot be null.");
            this.f3550a = gVar;
        }

        /* renamed from: a */
        public final C0601g mo5638a() {
            return this.f3550a;
        }

        /* renamed from: b */
        public C0597c mo5639b(int i) {
            this.f3557h = i;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.c$d */
    /* compiled from: EmojiCompat */
    public interface C0598d {
        /* renamed from: a */
        boolean mo5618a(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: androidx.emoji2.text.c$e */
    /* compiled from: EmojiCompat */
    public static abstract class C0599e {
        /* renamed from: a */
        public void mo2436a(Throwable th) {
        }

        /* renamed from: b */
        public void mo2437b() {
        }
    }

    /* renamed from: androidx.emoji2.text.c$f */
    /* compiled from: EmojiCompat */
    public static class C0600f implements Runnable {

        /* renamed from: a */
        public final List<C0599e> f3559a;

        /* renamed from: d */
        public final Throwable f3560d;

        /* renamed from: e */
        public final int f3561e;

        public C0600f(C0599e eVar, int i) {
            this(Arrays.asList(new C0599e[]{(C0599e) gu4.m18429g(eVar, "initCallback cannot be null")}), i, (Throwable) null);
        }

        public void run() {
            int size = this.f3559a.size();
            int i = 0;
            if (this.f3561e != 1) {
                while (i < size) {
                    this.f3559a.get(i).mo2436a(this.f3560d);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.f3559a.get(i).mo2437b();
                i++;
            }
        }

        public C0600f(Collection<C0599e> collection, int i) {
            this(collection, i, (Throwable) null);
        }

        public C0600f(Collection<C0599e> collection, int i, Throwable th) {
            gu4.m18429g(collection, "initCallbacks cannot be null");
            this.f3559a = new ArrayList(collection);
            this.f3561e = i;
            this.f3560d = th;
        }
    }

    /* renamed from: androidx.emoji2.text.c$g */
    /* compiled from: EmojiCompat */
    public interface C0601g {
        /* renamed from: a */
        void mo5603a(C0602h hVar);
    }

    /* renamed from: androidx.emoji2.text.c$h */
    /* compiled from: EmojiCompat */
    public static abstract class C0602h {
        /* renamed from: a */
        public abstract void mo5605a(Throwable th);

        /* renamed from: b */
        public abstract void mo5606b(C0610f fVar);
    }

    /* renamed from: androidx.emoji2.text.c$i */
    /* compiled from: EmojiCompat */
    public static class C0603i {
        /* renamed from: a */
        public io1 mo5641a(ho1 ho1) {
            return new p27(ho1);
        }
    }

    public C0593c(C0597c cVar) {
        this.f3539g = cVar.f3551b;
        this.f3540h = cVar.f3552c;
        this.f3541i = cVar.f3553d;
        this.f3542j = cVar.f3555f;
        this.f3543k = cVar.f3556g;
        this.f3538f = cVar.f3550a;
        this.f3544l = cVar.f3557h;
        this.f3545m = cVar.f3558i;
        this.f3536d = new Handler(Looper.getMainLooper());
        C3162qq qqVar = new C3162qq();
        this.f3534b = qqVar;
        Set<C0599e> set = cVar.f3554e;
        if (set != null && !set.isEmpty()) {
            qqVar.addAll(cVar.f3554e);
        }
        this.f3537e = new C0594a(this);
        mo5624l();
    }

    /* renamed from: b */
    public static C0593c m4517b() {
        C0593c cVar;
        boolean z;
        synchronized (f3530n) {
            cVar = f3532p;
            if (cVar != null) {
                z = true;
            } else {
                z = false;
            }
            gu4.m18430h(z, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return cVar;
    }

    /* renamed from: e */
    public static boolean m4518e(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        return C0604d.m4556c(inputConnection, editable, i, i2, z);
    }

    /* renamed from: f */
    public static boolean m4519f(Editable editable, int i, KeyEvent keyEvent) {
        return C0604d.m4557d(editable, i, keyEvent);
    }

    /* renamed from: g */
    public static C0593c m4520g(C0597c cVar) {
        C0593c cVar2 = f3532p;
        if (cVar2 == null) {
            synchronized (f3530n) {
                cVar2 = f3532p;
                if (cVar2 == null) {
                    cVar2 = new C0593c(cVar);
                    f3532p = cVar2;
                }
            }
        }
        return cVar2;
    }

    /* renamed from: h */
    public static boolean m4521h() {
        if (f3532p != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int mo5619c() {
        return this.f3543k;
    }

    /* renamed from: d */
    public int mo5620d() {
        this.f3533a.readLock().lock();
        try {
            return this.f3535c;
        } finally {
            this.f3533a.readLock().unlock();
        }
    }

    /* renamed from: i */
    public boolean mo5621i() {
        return this.f3542j;
    }

    /* renamed from: j */
    public final boolean mo5622j() {
        if (mo5620d() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void mo5623k() {
        boolean z = true;
        if (this.f3544l != 1) {
            z = false;
        }
        gu4.m18430h(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!mo5622j()) {
            this.f3533a.writeLock().lock();
            try {
                if (this.f3535c != 0) {
                    this.f3535c = 0;
                    this.f3533a.writeLock().unlock();
                    this.f3537e.mo5634a();
                }
            } finally {
                this.f3533a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: l */
    public final void mo5624l() {
        this.f3533a.writeLock().lock();
        try {
            if (this.f3544l == 0) {
                this.f3535c = 0;
            }
            this.f3533a.writeLock().unlock();
            if (mo5620d() == 0) {
                this.f3537e.mo5634a();
            }
        } catch (Throwable th) {
            this.f3533a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m */
    public void mo5625m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3533a.writeLock().lock();
        try {
            this.f3535c = 2;
            arrayList.addAll(this.f3534b);
            this.f3534b.clear();
            this.f3533a.writeLock().unlock();
            this.f3536d.post(new C0600f(arrayList, this.f3535c, th));
        } catch (Throwable th2) {
            this.f3533a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: n */
    public void mo5626n() {
        ArrayList arrayList = new ArrayList();
        this.f3533a.writeLock().lock();
        try {
            this.f3535c = 1;
            arrayList.addAll(this.f3534b);
            this.f3534b.clear();
            this.f3533a.writeLock().unlock();
            this.f3536d.post(new C0600f((Collection<C0599e>) arrayList, this.f3535c));
        } catch (Throwable th) {
            this.f3533a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: o */
    public CharSequence mo5627o(CharSequence charSequence) {
        int i;
        if (charSequence == null) {
            i = 0;
        } else {
            i = charSequence.length();
        }
        return mo5628p(charSequence, 0, i);
    }

    /* renamed from: p */
    public CharSequence mo5628p(CharSequence charSequence, int i, int i2) {
        return mo5629q(charSequence, i, i2, Integer.MAX_VALUE);
    }

    /* renamed from: q */
    public CharSequence mo5629q(CharSequence charSequence, int i, int i2, int i3) {
        return mo5630r(charSequence, i, i2, i3, 0);
    }

    /* renamed from: r */
    public CharSequence mo5630r(CharSequence charSequence, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        gu4.m18430h(mo5622j(), "Not initialized yet");
        gu4.m18426d(i, "start cannot be negative");
        gu4.m18426d(i2, "end cannot be negative");
        gu4.m18426d(i3, "maxEmojiCount cannot be negative");
        boolean z5 = false;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        gu4.m18423a(z, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i <= charSequence.length()) {
            z2 = true;
        } else {
            z2 = false;
        }
        gu4.m18423a(z2, "start should be < than charSequence length");
        if (i2 <= charSequence.length()) {
            z3 = true;
        } else {
            z3 = false;
        }
        gu4.m18423a(z3, "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                z5 = this.f3539g;
            }
            z4 = z5;
        } else {
            z4 = true;
        }
        return this.f3537e.mo5635b(charSequence, i, i2, i3, z4);
    }

    /* renamed from: s */
    public void mo5631s(C0599e eVar) {
        gu4.m18429g(eVar, "initCallback cannot be null");
        this.f3533a.writeLock().lock();
        try {
            if (this.f3535c != 1) {
                if (this.f3535c != 2) {
                    this.f3534b.add(eVar);
                }
            }
            this.f3536d.post(new C0600f(eVar, this.f3535c));
        } finally {
            this.f3533a.writeLock().unlock();
        }
    }

    /* renamed from: t */
    public void mo5632t(C0599e eVar) {
        gu4.m18429g(eVar, "initCallback cannot be null");
        this.f3533a.writeLock().lock();
        try {
            this.f3534b.remove(eVar);
        } finally {
            this.f3533a.writeLock().unlock();
        }
    }

    /* renamed from: u */
    public void mo5633u(EditorInfo editorInfo) {
        if (mo5622j() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f3537e.mo5636c(editorInfo);
        }
    }
}
