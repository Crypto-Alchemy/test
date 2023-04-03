package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;

/* compiled from: LazyJavaPackageFragment.kt */
public final class LazyJavaPackageFragment$partToFacade$2 extends Lambda implements pc2<HashMap<y73, y73>> {
    public final /* synthetic */ LazyJavaPackageFragment this$0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$partToFacade$2$a */
    /* compiled from: LazyJavaPackageFragment.kt */
    public /* synthetic */ class C7456a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39518a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
            iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
            f39518a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment$partToFacade$2(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.this$0 = lazyJavaPackageFragment;
    }

    public final HashMap<y73, y73> invoke() {
        HashMap<y73, y73> hashMap = new HashMap<>();
        for (Map.Entry next : this.this$0.mo53591G0().entrySet()) {
            y73 d = y73.m74293d((String) next.getKey());
            vx2.m53590f(d, "byInternalName(partInternalName)");
            KotlinClassHeader a = ((tc3) next.getValue()).mo65261a();
            int i = C7456a.f39518a[a.mo53822c().ordinal()];
            if (i == 1) {
                String e = a.mo53824e();
                if (e != null) {
                    y73 d2 = y73.m74293d(e);
                    vx2.m53590f(d2, "byInternalName(header.mu…: continue@kotlinClasses)");
                    hashMap.put(d, d2);
                }
            } else if (i == 2) {
                hashMap.put(d, d);
            }
        }
        return hashMap;
    }
}
