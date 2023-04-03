package p000;

/* renamed from: xs5 */
/* compiled from: SeekMap */
public interface xs5 {

    /* renamed from: xs5$a */
    /* compiled from: SeekMap */
    public static final class C3641a {

        /* renamed from: a */
        public final zs5 f19968a;

        /* renamed from: b */
        public final zs5 f19969b;

        public C3641a(zs5 zs5) {
            this(zs5, zs5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3641a.class != obj.getClass()) {
                return false;
            }
            C3641a aVar = (C3641a) obj;
            if (!this.f19968a.equals(aVar.f19968a) || !this.f19969b.equals(aVar.f19969b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f19968a.hashCode() * 31) + this.f19969b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f19968a);
            if (this.f19968a.equals(this.f19969b)) {
                str = "";
            } else {
                str = ", " + this.f19969b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public C3641a(zs5 zs5, zs5 zs52) {
            this.f19968a = (zs5) C2725kr.m20985e(zs5);
            this.f19969b = (zs5) C2725kr.m20985e(zs52);
        }
    }

    /* renamed from: xs5$b */
    /* compiled from: SeekMap */
    public static class C3642b implements xs5 {

        /* renamed from: a */
        public final long f19970a;

        /* renamed from: b */
        public final C3641a f19971b;

        public C3642b(long j) {
            this(j, 0);
        }

        /* renamed from: f */
        public C3641a mo11155f(long j) {
            return this.f19971b;
        }

        /* renamed from: h */
        public boolean mo11156h() {
            return false;
        }

        /* renamed from: i */
        public long mo11157i() {
            return this.f19970a;
        }

        public C3642b(long j, long j2) {
            this.f19970a = j;
            this.f19971b = new C3641a(j2 == 0 ? zs5.f20674c : new zs5(0, j2));
        }
    }

    /* renamed from: f */
    C3641a mo11155f(long j);

    /* renamed from: h */
    boolean mo11156h();

    /* renamed from: i */
    long mo11157i();
}
