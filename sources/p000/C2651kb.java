package p000;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\t\b&\u0018\u0000 \u00052\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo44877d2 = {"Lkb;", "", "", "a", "[F", "b", "()[F", "transform", "<init>", "([F)V", "d", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: kb */
/* compiled from: Adaptation.kt */
public abstract class C2651kb {

    /* renamed from: b */
    public static final C2655d f14024b = new C2655d((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final C2651kb f14025c = new C2652a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* renamed from: d */
    public static final C2651kb f14026d = new C2654c(new float[]{0.40024f, -0.2263f, Utils.FLOAT_EPSILON, 0.7076f, 1.16532f, Utils.FLOAT_EPSILON, -0.08081f, 0.0457f, 0.91822f});

    /* renamed from: e */
    public static final C2651kb f14027e = new C2653b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* renamed from: a */
    public final float[] f14028a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"kb$a", "Lkb;", "", "toString", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kb$a */
    /* compiled from: Adaptation.kt */
    public static final class C2652a extends C2651kb {
        public C2652a(float[] fArr) {
            super(fArr, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"kb$b", "Lkb;", "", "toString", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kb$b */
    /* compiled from: Adaptation.kt */
    public static final class C2653b extends C2651kb {
        public C2653b(float[] fArr) {
            super(fArr, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"kb$c", "Lkb;", "", "toString", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kb$c */
    /* compiled from: Adaptation.kt */
    public static final class C2654c extends C2651kb {
        public C2654c(float[] fArr) {
            super(fArr, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Lkb$d;", "", "Lkb;", "Bradford", "Lkb;", "a", "()Lkb;", "<init>", "()V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kb$d */
    /* compiled from: Adaptation.kt */
    public static final class C2655d {
        public C2655d() {
        }

        public /* synthetic */ C2655d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2651kb mo22242a() {
            return C2651kb.f14025c;
        }
    }

    public C2651kb(float[] fArr) {
        this.f14028a = fArr;
    }

    public /* synthetic */ C2651kb(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    /* renamed from: b */
    public final float[] mo22238b() {
        return this.f14028a;
    }
}
