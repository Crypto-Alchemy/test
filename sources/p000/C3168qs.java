package p000;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import androidx.media3.common.C0792h;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.Ints;
import java.util.Arrays;

/* renamed from: qs */
/* compiled from: AudioCapabilities */
public final class C3168qs {

    /* renamed from: c */
    public static final C3168qs f17047c = new C3168qs(new int[]{2}, 8);

    /* renamed from: d */
    public static final C3168qs f17048d = new C3168qs(new int[]{2, 5, 6}, 8);

    /* renamed from: e */
    public static final ImmutableMap<Integer, Integer> f17049e = new ImmutableMap.C4540b().mo34740d(5, 6).mo34740d(17, 6).mo34740d(7, 6).mo34740d(18, 6).mo34740d(6, 8).mo34740d(8, 8).mo34740d(14, 8).mo34738b();

    /* renamed from: a */
    public final int[] f17050a;

    /* renamed from: b */
    public final int f17051b;

    /* renamed from: qs$a */
    /* compiled from: AudioCapabilities */
    public static final class C3169a {

        /* renamed from: a */
        public static final AudioAttributes f17052a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        /* renamed from: a */
        public static int[] m25915a() {
            ImmutableList.C4534a builder = ImmutableList.builder();
            c47 it = C3168qs.f17049e.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f17052a)) {
                    builder.mo34667a(Integer.valueOf(intValue));
                }
            }
            builder.mo34667a(2);
            return Ints.m37052k(builder.mo34692l());
        }

        /* renamed from: b */
        public static int m25916b(int i, int i2) {
            for (int i3 = 8; i3 > 0; i3--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(w67.m29302E(i3)).build(), f17052a)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    public C3168qs(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f17050a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f17050a = new int[0];
        }
        this.f17051b = i;
    }

    /* renamed from: b */
    public static boolean m25907b() {
        if (w67.f19021a >= 17) {
            String str = w67.f19023c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static C3168qs m25908c(Context context) {
        return m25909d(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: d */
    public static C3168qs m25909d(Context context, Intent intent) {
        if (m25907b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f17048d;
        }
        if (w67.f19021a >= 29 && (w67.m29381t0(context) || w67.m29371o0(context))) {
            return new C3168qs(C3169a.m25915a(), 8);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f17047c;
        }
        return new C3168qs(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    /* renamed from: e */
    public static int m25910e(int i) {
        int i2 = w67.f19021a;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(w67.f19022b) && i == 1) {
            i = 2;
        }
        return w67.m29302E(i);
    }

    /* renamed from: g */
    public static int m25911g(int i, int i2) {
        if (w67.f19021a >= 29) {
            return C3169a.m25916b(i, i2);
        }
        return ((Integer) C2725kr.m20985e(f17049e.getOrDefault(Integer.valueOf(i), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3168qs)) {
            return false;
        }
        C3168qs qsVar = (C3168qs) obj;
        if (!Arrays.equals(this.f17050a, qsVar.f17050a) || this.f17051b != qsVar.f17051b) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Pair<Integer, Integer> mo25265f(C0792h hVar) {
        int d = vv3.m29130d((String) C2725kr.m20985e(hVar.f4175C), hVar.f4204y);
        if (!f17049e.containsKey(Integer.valueOf(d))) {
            return null;
        }
        if (d == 18 && !mo25268i(18)) {
            d = 6;
        } else if (d == 8 && !mo25268i(8)) {
            d = 7;
        }
        if (!mo25268i(d)) {
            return null;
        }
        int i = hVar.f4202v0;
        if (i == -1 || d == 18) {
            int i2 = hVar.f4187b1;
            if (i2 == -1) {
                i2 = 48000;
            }
            i = m25911g(d, i2);
        } else if (i > this.f17051b) {
            return null;
        }
        int e = m25910e(i);
        if (e == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(d), Integer.valueOf(e));
    }

    /* renamed from: h */
    public boolean mo25266h(C0792h hVar) {
        if (mo25265f(hVar) != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f17051b + (Arrays.hashCode(this.f17050a) * 31);
    }

    /* renamed from: i */
    public boolean mo25268i(int i) {
        if (Arrays.binarySearch(this.f17050a, i) >= 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f17051b + ", supportedEncodings=" + Arrays.toString(this.f17050a) + "]";
    }
}
