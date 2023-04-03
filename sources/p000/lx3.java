package p000;

import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;

/* renamed from: lx3 */
/* compiled from: ModuleDescriptorImpl.kt */
public final class lx3 implements kx3 {

    /* renamed from: a */
    public final List<ModuleDescriptorImpl> f40712a;

    /* renamed from: b */
    public final Set<ModuleDescriptorImpl> f40713b;

    /* renamed from: c */
    public final List<ModuleDescriptorImpl> f40714c;

    /* renamed from: d */
    public final Set<ModuleDescriptorImpl> f40715d;

    public lx3(List<ModuleDescriptorImpl> list, Set<ModuleDescriptorImpl> set, List<ModuleDescriptorImpl> list2, Set<ModuleDescriptorImpl> set2) {
        vx2.m53591g(list, "allDependencies");
        vx2.m53591g(set, "modulesWhoseInternalsAreVisible");
        vx2.m53591g(list2, "directExpectedByDependencies");
        vx2.m53591g(set2, "allExpectedByDependencies");
        this.f40712a = list;
        this.f40713b = set;
        this.f40714c = list2;
        this.f40715d = set2;
    }

    /* renamed from: a */
    public List<ModuleDescriptorImpl> mo55788a() {
        return this.f40712a;
    }

    /* renamed from: b */
    public List<ModuleDescriptorImpl> mo55789b() {
        return this.f40714c;
    }

    /* renamed from: c */
    public Set<ModuleDescriptorImpl> mo55790c() {
        return this.f40713b;
    }
}
