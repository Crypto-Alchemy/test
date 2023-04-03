package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.C2021a;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.wf0;

/* renamed from: com.fasterxml.jackson.databind.introspect.c */
/* compiled from: AnnotatedCreatorCollector */
public final class C2024c extends kk0 {

    /* renamed from: d */
    public final C2033i f10036d;

    /* renamed from: e */
    public final boolean f10037e;

    /* renamed from: f */
    public AnnotatedConstructor f10038f;

    public C2024c(AnnotationIntrospector annotationIntrospector, C2033i iVar, boolean z) {
        super(annotationIntrospector);
        this.f10036d = iVar;
        this.f10037e = z;
    }

    /* renamed from: k */
    public static boolean m14200k(Method method) {
        if (!Modifier.isStatic(method.getModifiers()) || method.isSynthetic()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static C2021a.C2022a m14201p(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, C2033i iVar, JavaType javaType, Class<?> cls, boolean z) {
        boolean z2;
        if (cls != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new C2024c(annotationIntrospector, iVar, z | z2).mo16060l(typeFactory, javaType, cls);
    }

    /* renamed from: t */
    public static boolean m14202t(Constructor<?> constructor) {
        return !constructor.isSynthetic();
    }

    /* renamed from: i */
    public final List<AnnotatedConstructor> mo16058i(JavaType javaType, Class<?> cls) {
        ArrayList arrayList;
        wf0.C3534a aVar;
        List<AnnotatedConstructor> list;
        int i;
        if (!javaType.isEnumType()) {
            aVar = null;
            arrayList = null;
            for (wf0.C3534a aVar2 : wf0.m29474A(javaType.getRawClass())) {
                if (m14202t(aVar2.mo27500a())) {
                    if (aVar2.mo27503d() == 0) {
                        aVar = aVar2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(aVar2);
                    }
                }
            }
        } else {
            aVar = null;
            arrayList = null;
        }
        if (arrayList == null) {
            list = Collections.emptyList();
            if (aVar == null) {
                return list;
            }
            i = 0;
        } else {
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add((Object) null);
            }
            ArrayList arrayList3 = arrayList2;
            i = size;
            list = arrayList3;
        }
        if (cls != null) {
            os3[] os3Arr = null;
            for (wf0.C3534a aVar3 : wf0.m29474A(cls)) {
                if (aVar3.mo27503d() == 0) {
                    if (aVar != null) {
                        this.f10038f = mo16064q(aVar, aVar3);
                        aVar = null;
                    }
                } else if (arrayList != null) {
                    if (os3Arr == null) {
                        os3Arr = new os3[i];
                        for (int i3 = 0; i3 < i; i3++) {
                            os3Arr[i3] = new os3(((wf0.C3534a) arrayList.get(i3)).mo27500a());
                        }
                    }
                    os3 os3 = new os3(aVar3.mo27500a());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i) {
                            break;
                        } else if (os3.equals(os3Arr[i4])) {
                            list.set(i4, mo16066s((wf0.C3534a) arrayList.get(i4), aVar3));
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        }
        if (aVar != null) {
            this.f10038f = mo16064q(aVar, (wf0.C3534a) null);
        }
        for (int i5 = 0; i5 < i; i5++) {
            if (list.get(i5) == null) {
                list.set(i5, mo16066s((wf0.C3534a) arrayList.get(i5), (wf0.C3534a) null));
            }
        }
        return list;
    }

    /* renamed from: j */
    public final List<AnnotatedMethod> mo16059j(TypeFactory typeFactory, JavaType javaType, Class<?> cls) {
        ArrayList arrayList = null;
        for (Method method : wf0.m29540z(javaType.getRawClass())) {
            if (m14200k(method)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(method);
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        C2033i iVar = this.f10036d;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add((Object) null);
        }
        if (cls != null) {
            os3[] os3Arr = null;
            for (Method method2 : cls.getDeclaredMethods()) {
                if (m14200k(method2)) {
                    if (os3Arr == null) {
                        os3Arr = new os3[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            os3Arr[i2] = new os3((Method) arrayList.get(i2));
                        }
                    }
                    os3 os3 = new os3(method2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        } else if (os3.equals(os3Arr[i3])) {
                            arrayList2.set(i3, mo16065r((Method) arrayList.get(i3), iVar, method2));
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (((AnnotatedMethod) arrayList2.get(i4)) == null) {
                Method method3 = (Method) arrayList.get(i4);
                arrayList2.set(i4, mo16065r(method3, C2031g.m14228e(method3, javaType, typeFactory, iVar), (Method) null));
            } else {
                TypeFactory typeFactory2 = typeFactory;
                JavaType javaType2 = javaType;
            }
        }
        return arrayList2;
    }

    /* renamed from: l */
    public C2021a.C2022a mo16060l(TypeFactory typeFactory, JavaType javaType, Class<?> cls) {
        List<AnnotatedConstructor> i = mo16058i(javaType, cls);
        List<AnnotatedMethod> j = mo16059j(typeFactory, javaType, cls);
        if (this.f10037e) {
            AnnotatedConstructor annotatedConstructor = this.f10038f;
            if (annotatedConstructor != null && this.f14136a.hasIgnoreMarker(annotatedConstructor)) {
                this.f10038f = null;
            }
            int size = i.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (this.f14136a.hasIgnoreMarker(i.get(size))) {
                    i.remove(size);
                }
            }
            int size2 = j.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                } else if (this.f14136a.hasIgnoreMarker(j.get(size2))) {
                    j.remove(size2);
                }
            }
        }
        return new C2021a.C2022a(this.f10038f, i, j);
    }

    /* renamed from: m */
    public final C3742zl mo16061m(wf0.C3534a aVar, wf0.C3534a aVar2) {
        if (!this.f10037e) {
            return kk0.m20793a();
        }
        AnnotationCollector e = mo22338e(aVar.mo27501b());
        if (aVar2 != null) {
            e = mo22337d(e, aVar2.mo27501b());
        }
        return e.mo15948b();
    }

    /* renamed from: n */
    public final C3742zl mo16062n(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        AnnotationCollector e = mo22338e(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            e = mo22337d(e, annotatedElement2.getDeclaredAnnotations());
        }
        return e.mo15948b();
    }

    /* renamed from: o */
    public final C3742zl[] mo16063o(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this.f10037e) {
            return kk0.f14134b;
        }
        int length = annotationArr.length;
        C3742zl[] zlVarArr = new C3742zl[length];
        for (int i = 0; i < length; i++) {
            AnnotationCollector d = mo22337d(AnnotationCollector.m14134e(), annotationArr[i]);
            if (annotationArr2 != null) {
                d = mo22337d(d, annotationArr2[i]);
            }
            zlVarArr[i] = d.mo15948b();
        }
        return zlVarArr;
    }

    /* renamed from: q */
    public AnnotatedConstructor mo16064q(wf0.C3534a aVar, wf0.C3534a aVar2) {
        return new AnnotatedConstructor(this.f10036d, aVar.mo27500a(), mo16061m(aVar, aVar2), kk0.f14134b);
    }

    /* renamed from: r */
    public AnnotatedMethod mo16065r(Method method, C2033i iVar, Method method2) {
        Annotation[][] annotationArr;
        int length = method.getParameterTypes().length;
        if (this.f14136a == null) {
            return new AnnotatedMethod(iVar, method, kk0.m20793a(), kk0.m20794b(length));
        }
        if (length == 0) {
            return new AnnotatedMethod(iVar, method, mo16062n(method, method2), kk0.f14134b);
        }
        C3742zl n = mo16062n(method, method2);
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (method2 == null) {
            annotationArr = null;
            Annotation[][] annotationArr2 = null;
        } else {
            annotationArr = method2.getParameterAnnotations();
        }
        return new AnnotatedMethod(iVar, method, n, mo16063o(parameterAnnotations, annotationArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: zl[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: zl[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: zl[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.introspect.AnnotatedConstructor mo16066s(p000.wf0.C3534a r9, p000.wf0.C3534a r10) {
        /*
            r8 = this;
            int r0 = r9.mo27503d()
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r8.f14136a
            if (r1 != 0) goto L_0x001c
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.i r1 = r8.f10036d
            java.lang.reflect.Constructor r9 = r9.mo27500a()
            zl r2 = p000.kk0.m20793a()
            zl[] r0 = p000.kk0.m20794b(r0)
            r10.<init>(r1, r9, r2, r0)
            return r10
        L_0x001c:
            if (r0 != 0) goto L_0x0030
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.i r1 = r8.f10036d
            java.lang.reflect.Constructor r2 = r9.mo27500a()
            zl r9 = r8.mo16061m(r9, r10)
            zl[] r10 = p000.kk0.f14134b
            r0.<init>(r1, r2, r9, r10)
            return r0
        L_0x0030:
            java.lang.annotation.Annotation[][] r1 = r9.mo27504e()
            int r2 = r1.length
            r3 = 0
            if (r0 == r2) goto L_0x00a1
            java.lang.Class r2 = r9.mo27502c()
            boolean r4 = p000.wf0.m29485L(r2)
            r5 = 0
            r6 = 1
            r7 = 2
            if (r4 == 0) goto L_0x005a
            int r4 = r1.length
            int r4 = r4 + r7
            if (r0 != r4) goto L_0x005a
            int r2 = r1.length
            int r2 = r2 + r7
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r7, r4)
            r1 = r3
            java.lang.annotation.Annotation[][] r1 = (java.lang.annotation.Annotation[][]) r1
            zl[] r3 = r8.mo16063o(r2, r3)
        L_0x0058:
            r1 = r2
            goto L_0x0078
        L_0x005a:
            boolean r2 = r2.isMemberClass()
            if (r2 == 0) goto L_0x0078
            int r2 = r1.length
            int r2 = r2 + r6
            if (r0 != r2) goto L_0x0078
            int r2 = r1.length
            int r2 = r2 + r6
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r6, r4)
            java.lang.annotation.Annotation[] r1 = p000.kk0.f14135c
            r2[r5] = r1
            r1 = r3
            java.lang.annotation.Annotation[][] r1 = (java.lang.annotation.Annotation[][]) r1
            zl[] r3 = r8.mo16063o(r2, r3)
            goto L_0x0058
        L_0x0078:
            if (r3 == 0) goto L_0x007b
            goto L_0x00af
        L_0x007b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class r9 = r9.mo27502c()
            java.lang.String r9 = r9.getName()
            r2[r5] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r2[r6] = r9
            int r9 = r1.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r7] = r9
            java.lang.String r9 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r9 = java.lang.String.format(r9, r2)
            r10.<init>(r9)
            throw r10
        L_0x00a1:
            if (r10 != 0) goto L_0x00a7
            r0 = r3
            java.lang.annotation.Annotation[][] r0 = (java.lang.annotation.Annotation[][]) r0
            goto L_0x00ab
        L_0x00a7:
            java.lang.annotation.Annotation[][] r3 = r10.mo27504e()
        L_0x00ab:
            zl[] r3 = r8.mo16063o(r1, r3)
        L_0x00af:
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.i r1 = r8.f10036d
            java.lang.reflect.Constructor r2 = r9.mo27500a()
            zl r9 = r8.mo16061m(r9, r10)
            r0.<init>(r1, r2, r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.C2024c.mo16066s(wf0$a, wf0$a):com.fasterxml.jackson.databind.introspect.AnnotatedConstructor");
    }
}
