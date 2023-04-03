package p000;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.C1946a;
import com.facebook.imagepipeline.memory.C1947b;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* renamed from: ls4 */
/* compiled from: PoolFactory */
public class ls4 {

    /* renamed from: a */
    public final ks4 f14704a;

    /* renamed from: b */
    public C1947b f14705b;

    /* renamed from: c */
    public s20 f14706c;

    /* renamed from: d */
    public C1947b f14707d;

    /* renamed from: e */
    public f42 f14708e;

    /* renamed from: f */
    public C1947b f14709f;

    /* renamed from: g */
    public qs4 f14710g;

    /* renamed from: h */
    public ts4 f14711h;

    /* renamed from: i */
    public j60 f14712i;

    public ls4(ks4 ks4) {
        this.f14704a = (ks4) au4.m10792g(ks4);
    }

    /* renamed from: a */
    public final C1947b mo22955a() {
        if (this.f14705b == null) {
            try {
                this.f14705b = AshmemMemoryChunkPool.class.getConstructor(new Class[]{ht3.class, ms4.class, ns4.class}).newInstance(new Object[]{this.f14704a.mo22526i(), this.f14704a.mo22524g(), this.f14704a.mo22525h()});
            } catch (ClassNotFoundException unused) {
                this.f14705b = null;
            } catch (IllegalAccessException unused2) {
                this.f14705b = null;
            } catch (InstantiationException unused3) {
                this.f14705b = null;
            } catch (NoSuchMethodException unused4) {
                this.f14705b = null;
            } catch (InvocationTargetException unused5) {
                this.f14705b = null;
            }
        }
        return this.f14705b;
    }

    /* renamed from: b */
    public s20 mo22956b() {
        ht3 ht3;
        if (this.f14706c == null) {
            String e = this.f14704a.mo22522e();
            char c = 65535;
            switch (e.hashCode()) {
                case -1868884870:
                    if (e.equals("legacy_default_params")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1106578487:
                    if (e.equals("legacy")) {
                        c = 4;
                        break;
                    }
                    break;
                case -404562712:
                    if (e.equals("experimental")) {
                        c = 2;
                        break;
                    }
                    break;
                case -402149703:
                    if (e.equals("dummy_with_tracking")) {
                        c = 1;
                        break;
                    }
                    break;
                case 95945896:
                    if (e.equals("dummy")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.f14706c = new al1();
            } else if (c == 1) {
                this.f14706c = new dl1();
            } else if (c == 2) {
                int b = this.f14704a.mo22519b();
                int a = this.f14704a.mo22518a();
                w74 h = w74.m29399h();
                if (this.f14704a.mo22530m()) {
                    ht3 = this.f14704a.mo22526i();
                } else {
                    ht3 = null;
                }
                this.f14706c = new zl3(b, a, h, ht3);
            } else if (c != 3) {
                this.f14706c = new l40(this.f14704a.mo22526i(), this.f14704a.mo22520c(), this.f14704a.mo22521d(), this.f14704a.mo22529l());
            } else {
                this.f14706c = new l40(this.f14704a.mo22526i(), v61.m28647a(), this.f14704a.mo22521d(), this.f14704a.mo22529l());
            }
        }
        return this.f14706c;
    }

    /* renamed from: c */
    public C1947b mo22957c() {
        if (this.f14707d == null) {
            try {
                this.f14707d = BufferMemoryChunkPool.class.getConstructor(new Class[]{ht3.class, ms4.class, ns4.class}).newInstance(new Object[]{this.f14704a.mo22526i(), this.f14704a.mo22524g(), this.f14704a.mo22525h()});
            } catch (ClassNotFoundException unused) {
                this.f14707d = null;
            } catch (IllegalAccessException unused2) {
                this.f14707d = null;
            } catch (InstantiationException unused3) {
                this.f14707d = null;
            } catch (NoSuchMethodException unused4) {
                this.f14707d = null;
            } catch (InvocationTargetException unused5) {
                this.f14707d = null;
            }
        }
        return this.f14707d;
    }

    /* renamed from: d */
    public f42 mo22958d() {
        if (this.f14708e == null) {
            this.f14708e = new f42(this.f14704a.mo22526i(), this.f14704a.mo22523f());
        }
        return this.f14708e;
    }

    /* renamed from: e */
    public int mo22959e() {
        return this.f14704a.mo22523f().f15247g;
    }

    /* renamed from: f */
    public final C1947b mo22960f(int i) {
        if (i == 0) {
            return mo22961g();
        }
        if (i == 1) {
            return mo22957c();
        }
        if (i == 2) {
            return mo22955a();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* renamed from: g */
    public C1947b mo22961g() {
        if (this.f14709f == null) {
            try {
                this.f14709f = NativeMemoryChunkPool.class.getConstructor(new Class[]{ht3.class, ms4.class, ns4.class}).newInstance(new Object[]{this.f14704a.mo22526i(), this.f14704a.mo22524g(), this.f14704a.mo22525h()});
            } catch (ClassNotFoundException e) {
                oy1.m24422i("PoolFactory", "", e);
                this.f14709f = null;
            } catch (IllegalAccessException e2) {
                oy1.m24422i("PoolFactory", "", e2);
                this.f14709f = null;
            } catch (InstantiationException e3) {
                oy1.m24422i("PoolFactory", "", e3);
                this.f14709f = null;
            } catch (NoSuchMethodException e4) {
                oy1.m24422i("PoolFactory", "", e4);
                this.f14709f = null;
            } catch (InvocationTargetException e5) {
                oy1.m24422i("PoolFactory", "", e5);
                this.f14709f = null;
            }
        }
        return this.f14709f;
    }

    /* renamed from: h */
    public qs4 mo22962h() {
        return mo22963i(q34.m25367a() ^ true ? 1 : 0);
    }

    /* renamed from: i */
    public qs4 mo22963i(int i) {
        if (this.f14710g == null) {
            C1947b f = mo22960f(i);
            au4.m10793h(f, "failed to get pool for chunk type: " + i);
            this.f14710g = new et3(f, mo22964j());
        }
        return this.f14710g;
    }

    /* renamed from: j */
    public ts4 mo22964j() {
        if (this.f14711h == null) {
            this.f14711h = new ts4(mo22965k());
        }
        return this.f14711h;
    }

    /* renamed from: k */
    public j60 mo22965k() {
        if (this.f14712i == null) {
            this.f14712i = new C1946a(this.f14704a.mo22526i(), this.f14704a.mo22527j(), this.f14704a.mo22528k());
        }
        return this.f14712i;
    }
}
