package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.ENS;
import p000.zv0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0006\n\u0013\u001cB#\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u001bJ(\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, mo44877d2 = {"Landroidx/lifecycle/l;", "", "Lad7;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Lad7;", "", "key", "b", "(Ljava/lang/String;Ljava/lang/Class;)Lad7;", "Lgd7;", "Lgd7;", "store", "Landroidx/lifecycle/l$b;", "Landroidx/lifecycle/l$b;", "factory", "Lzv0;", "c", "Lzv0;", "defaultCreationExtras", "<init>", "(Lgd7;Landroidx/lifecycle/l$b;Lzv0;)V", "Lhd7;", "owner", "(Lhd7;)V", "(Lhd7;Landroidx/lifecycle/l$b;)V", "d", "lifecycle-viewmodel_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.l */
/* compiled from: ViewModelProvider.kt */
public class C0729l {

    /* renamed from: a */
    public final gd7 f3988a;

    /* renamed from: b */
    public final C0733b f3989b;

    /* renamed from: c */
    public final zv0 f3990c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, mo44877d2 = {"Landroidx/lifecycle/l$b;", "", "Lad7;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Lad7;", "Lzv0;", "extras", "b", "(Ljava/lang/Class;Lzv0;)Lad7;", "lifecycle-viewmodel_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.l$b */
    /* compiled from: ViewModelProvider.kt */
    public interface C0733b {
        /* renamed from: a */
        <T extends ad7> T mo6370a(Class<T> cls);

        /* renamed from: b */
        <T extends ad7> T mo6371b(Class<T> cls, zv0 zv0);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo44877d2 = {"Landroidx/lifecycle/l$c;", "Landroidx/lifecycle/l$b;", "Lad7;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Lad7;", "<init>", "()V", "lifecycle-viewmodel_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.l$c */
    /* compiled from: ViewModelProvider.kt */
    public static class C0734c implements C0733b {

        /* renamed from: a */
        public static final C0735a f3996a = new C0735a((DefaultConstructorMarker) null);

        /* renamed from: b */
        public static C0734c f3997b;

        /* renamed from: c */
        public static final zv0.C3765b<String> f3998c = C0735a.C0736a.f3999a;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028GX\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, mo44877d2 = {"Landroidx/lifecycle/l$c$a;", "", "Landroidx/lifecycle/l$c;", "a", "()Landroidx/lifecycle/l$c;", "getInstance$annotations", "()V", "instance", "Lzv0$b;", "", "VIEW_MODEL_KEY", "Lzv0$b;", "sInstance", "Landroidx/lifecycle/l$c;", "<init>", "lifecycle-viewmodel_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
        /* renamed from: androidx.lifecycle.l$c$a */
        /* compiled from: ViewModelProvider.kt */
        public static final class C0735a {

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo44877d2 = {"Landroidx/lifecycle/l$c$a$a;", "Lzv0$b;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
            /* renamed from: androidx.lifecycle.l$c$a$a */
            /* compiled from: ViewModelProvider.kt */
            public static final class C0736a implements zv0.C3765b<String> {

                /* renamed from: a */
                public static final C0736a f3999a = new C0736a();
            }

            public C0735a() {
            }

            public /* synthetic */ C0735a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C0734c mo6426a() {
                if (C0734c.f3997b == null) {
                    C0734c.f3997b = new C0734c();
                }
                C0734c c = C0734c.f3997b;
                vx2.m53588d(c);
                return c;
            }
        }

        /* renamed from: a */
        public <T extends ad7> T mo6370a(Class<T> cls) {
            vx2.m53591g(cls, "modelClass");
            try {
                T newInstance = cls.newInstance();
                vx2.m53590f(newInstance, "{\n                modelC…wInstance()\n            }");
                return (ad7) newInstance;
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }

        /* renamed from: b */
        public /* synthetic */ ad7 mo6371b(Class cls, zv0 zv0) {
            return ed7.m16079b(this, cls, zv0);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo44877d2 = {"Landroidx/lifecycle/l$d;", "", "Lad7;", "viewModel", "Lr37;", "c", "<init>", "()V", "lifecycle-viewmodel_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.l$d */
    /* compiled from: ViewModelProvider.kt */
    public static class C0737d {
        /* renamed from: c */
        public void mo6372c(ad7 ad7) {
            vx2.m53591g(ad7, "viewModel");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0729l(gd7 gd7, C0733b bVar) {
        this(gd7, bVar, (zv0) null, 4, (DefaultConstructorMarker) null);
        vx2.m53591g(gd7, "store");
        vx2.m53591g(bVar, "factory");
    }

    public C0729l(gd7 gd7, C0733b bVar, zv0 zv0) {
        vx2.m53591g(gd7, "store");
        vx2.m53591g(bVar, "factory");
        vx2.m53591g(zv0, "defaultCreationExtras");
        this.f3988a = gd7;
        this.f3989b = bVar;
        this.f3990c = zv0;
    }

    /* renamed from: a */
    public <T extends ad7> T mo6421a(Class<T> cls) {
        vx2.m53591g(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo6422b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends ad7> T mo6422b(String str, Class<T> cls) {
        T t;
        C0737d dVar;
        vx2.m53591g(str, "key");
        vx2.m53591g(cls, "modelClass");
        T b = this.f3988a.mo20540b(str);
        if (cls.isInstance(b)) {
            C0733b bVar = this.f3989b;
            if (bVar instanceof C0737d) {
                dVar = (C0737d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                vx2.m53590f(b, "viewModel");
                dVar.mo6372c(b);
            }
            if (b != null) {
                return b;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        j04 j04 = new j04(this.f3990c);
        j04.mo21704c(C0734c.f3998c, str);
        try {
            t = this.f3989b.mo6371b(cls, j04);
        } catch (AbstractMethodError unused) {
            t = this.f3989b.mo6370a(cls);
        }
        this.f3988a.mo20542d(str, t);
        return t;
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\nB\u001b\b\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\t\b\u0016¢\u0006\u0004\b\u0015\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0018J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, mo44877d2 = {"Landroidx/lifecycle/l$a;", "Landroidx/lifecycle/l$c;", "Lad7;", "T", "Ljava/lang/Class;", "modelClass", "Lzv0;", "extras", "b", "(Ljava/lang/Class;Lzv0;)Lad7;", "a", "(Ljava/lang/Class;)Lad7;", "Landroid/app/Application;", "app", "g", "(Ljava/lang/Class;Landroid/app/Application;)Lad7;", "d", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "e", "lifecycle-viewmodel_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.l$a */
    /* compiled from: ViewModelProvider.kt */
    public static class C0730a extends C0734c {

        /* renamed from: e */
        public static final C0731a f3991e = new C0731a((DefaultConstructorMarker) null);

        /* renamed from: f */
        public static C0730a f3992f;

        /* renamed from: g */
        public static final zv0.C3765b<Application> f3993g = C0731a.C0732a.f3995a;

        /* renamed from: d */
        public final Application f3994d;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0000XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo44877d2 = {"Landroidx/lifecycle/l$a$a;", "", "Lhd7;", "owner", "Landroidx/lifecycle/l$b;", "a", "(Lhd7;)Landroidx/lifecycle/l$b;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/l$a;", "b", "Lzv0$b;", "APPLICATION_KEY", "Lzv0$b;", "", "DEFAULT_KEY", "Ljava/lang/String;", "sInstance", "Landroidx/lifecycle/l$a;", "<init>", "()V", "lifecycle-viewmodel_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
        /* renamed from: androidx.lifecycle.l$a$a */
        /* compiled from: ViewModelProvider.kt */
        public static final class C0731a {

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo44877d2 = {"Landroidx/lifecycle/l$a$a$a;", "Lzv0$b;", "Landroid/app/Application;", "<init>", "()V", "lifecycle-viewmodel_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
            /* renamed from: androidx.lifecycle.l$a$a$a */
            /* compiled from: ViewModelProvider.kt */
            public static final class C0732a implements zv0.C3765b<Application> {

                /* renamed from: a */
                public static final C0732a f3995a = new C0732a();
            }

            public C0731a() {
            }

            public /* synthetic */ C0731a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C0733b mo6424a(hd7 hd7) {
                vx2.m53591g(hd7, ENS.FUNC_OWNER);
                if (!(hd7 instanceof C0714d)) {
                    return C0734c.f3996a.mo6426a();
                }
                C0733b defaultViewModelProviderFactory = ((C0714d) hd7).getDefaultViewModelProviderFactory();
                vx2.m53590f(defaultViewModelProviderFactory, "owner.defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            /* renamed from: b */
            public final C0730a mo6425b(Application application) {
                vx2.m53591g(application, "application");
                if (C0730a.f3992f == null) {
                    C0730a.f3992f = new C0730a(application);
                }
                C0730a e = C0730a.f3992f;
                vx2.m53588d(e);
                return e;
            }
        }

        public C0730a(Application application, int i) {
            this.f3994d = application;
        }

        /* renamed from: a */
        public <T extends ad7> T mo6370a(Class<T> cls) {
            vx2.m53591g(cls, "modelClass");
            Application application = this.f3994d;
            if (application != null) {
                return mo6423g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        /* renamed from: b */
        public <T extends ad7> T mo6371b(Class<T> cls, zv0 zv0) {
            vx2.m53591g(cls, "modelClass");
            vx2.m53591g(zv0, "extras");
            if (this.f3994d != null) {
                return mo6370a(cls);
            }
            Application application = (Application) zv0.mo21703a(f3993g);
            if (application != null) {
                return mo6423g(cls, application);
            }
            if (!C3552wj.class.isAssignableFrom(cls)) {
                return super.mo6370a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        /* renamed from: g */
        public final <T extends ad7> T mo6423g(Class<T> cls, Application application) {
            if (!C3552wj.class.isAssignableFrom(cls)) {
                return super.mo6370a(cls);
            }
            try {
                T t = (ad7) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                vx2.m53590f(t, "{\n                try {\n…          }\n            }");
                return t;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }

        public C0730a() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C0730a(Application application) {
            this(application, 0);
            vx2.m53591g(application, "application");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0729l(gd7 gd7, C0733b bVar, zv0 zv0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gd7, bVar, (i & 4) != 0 ? zv0.C3764a.f20690b : zv0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0729l(p000.hd7 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            p000.vx2.m53591g(r3, r0)
            gd7 r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            p000.vx2.m53590f(r0, r1)
            androidx.lifecycle.l$a$a r1 = androidx.lifecycle.C0729l.C0730a.f3991e
            androidx.lifecycle.l$b r1 = r1.mo6424a(r3)
            zv0 r3 = p000.fd7.m16947a(r3)
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0729l.<init>(hd7):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0729l(p000.hd7 r3, androidx.lifecycle.C0729l.C0733b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            p000.vx2.m53591g(r3, r0)
            java.lang.String r0 = "factory"
            p000.vx2.m53591g(r4, r0)
            gd7 r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            p000.vx2.m53590f(r0, r1)
            zv0 r3 = p000.fd7.m16947a(r3)
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0729l.<init>(hd7, androidx.lifecycle.l$b):void");
    }
}
