package p000;

import com.squareup.moshi.C5391d;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, mo44877d2 = {"Lrc3;", "Lcom/squareup/moshi/d$d;", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/h;", "moshi", "Lcom/squareup/moshi/d;", "a", "<init>", "()V", "reflect"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: rc3 */
/* compiled from: KotlinJsonAdapter.kt */
public final class rc3 implements C5391d.C5395d {
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01db, code lost:
        if (r9 == null) goto L_0x01dd;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.squareup.moshi.C5391d<?> mo39349a(java.lang.reflect.Type r28, java.util.Set<? extends java.lang.annotation.Annotation> r29, com.squareup.moshi.C5401h r30) {
        /*
            r27 = this;
            r1 = r28
            r2 = r30
            java.lang.String r0 = "type"
            p000.vx2.m53591g(r1, r0)
            java.lang.String r0 = "annotations"
            r3 = r29
            p000.vx2.m53591g(r3, r0)
            java.lang.String r0 = "moshi"
            p000.vx2.m53591g(r2, r0)
            boolean r0 = r29.isEmpty()
            r3 = 1
            r0 = r0 ^ r3
            r4 = 0
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            java.lang.Class r5 = p000.xp7.m54488a(r28)
            boolean r0 = r5.isInterface()
            if (r0 == 0) goto L_0x002a
            return r4
        L_0x002a:
            boolean r0 = r5.isEnum()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            java.lang.Class r0 = p000.sc3.f33823a
            boolean r0 = r5.isAnnotationPresent(r0)
            if (r0 != 0) goto L_0x003c
            return r4
        L_0x003c:
            boolean r0 = p000.t67.m52108i(r5)
            if (r0 == 0) goto L_0x0043
            return r4
        L_0x0043:
            com.squareup.moshi.d r0 = p000.t67.m52103d(r2, r1, r5)     // Catch:{ RuntimeException -> 0x004a }
            if (r0 == 0) goto L_0x0054
            return r0
        L_0x004a:
            r0 = move-exception
            r6 = r0
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof java.lang.ClassNotFoundException
            if (r0 == 0) goto L_0x0472
        L_0x0054:
            boolean r0 = r5.isLocalClass()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0453
            q83 r0 = p000.x73.m54256e(r5)
            boolean r6 = r0.isAbstract()
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x0434
            boolean r6 = r0.mo47000i()
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x0415
            java.lang.Object r6 = r0.mo46998f()
            if (r6 != 0) goto L_0x0075
            r6 = r3
            goto L_0x0076
        L_0x0075:
            r6 = 0
        L_0x0076:
            if (r6 == 0) goto L_0x03f6
            boolean r6 = r0.mo46997c()
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x03d2
            z83 r6 = p000.u83.m52674b(r0)
            if (r6 != 0) goto L_0x0086
            return r4
        L_0x0086:
            java.util.List r8 = r6.getParameters()
            r9 = 10
            int r10 = p000.dk0.m43495u(r8, r9)
            int r10 = p000.ao3.m31893e(r10)
            r11 = 16
            int r10 = p000.d75.m43382d(r10, r11)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L_0x00a3:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x00b8
            java.lang.Object r10 = r8.next()
            r12 = r10
            kotlin.reflect.KParameter r12 = (kotlin.reflect.KParameter) r12
            java.lang.String r12 = r12.getName()
            r11.put(r12, r10)
            goto L_0x00a3
        L_0x00b8:
            p000.p83.m24751a(r6, r3)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.Collection r0 = p000.u83.m52673a(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x00c8:
            boolean r10 = r0.hasNext()
            java.lang.String r12 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            if (r10 == 0) goto L_0x02f9
            java.lang.Object r10 = r0.next()
            k93 r10 = (p000.k93) r10
            java.lang.String r13 = r10.getName()
            java.lang.Object r13 = r11.get(r13)
            r15 = r13
            kotlin.reflect.KParameter r15 = (kotlin.reflect.KParameter) r15
            p000.p83.m24751a(r10, r3)
            java.util.List r13 = r10.getAnnotations()
            java.util.Iterator r13 = r13.iterator()
        L_0x00ec:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0100
            java.lang.Object r14 = r13.next()
            r4 = r14
            java.lang.annotation.Annotation r4 = (java.lang.annotation.Annotation) r4
            boolean r4 = r4 instanceof p000.y33
            if (r4 == 0) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            r4 = 0
            goto L_0x00ec
        L_0x0100:
            r14 = 0
        L_0x0101:
            y33 r14 = (p000.y33) r14
            java.util.List r4 = r10.getAnnotations()
            java.util.List r4 = kotlin.collections.CollectionsKt___CollectionsKt.m47313M0(r4)
            if (r15 == 0) goto L_0x0136
            java.util.List r13 = r15.getAnnotations()
            p000.hk0.m45275z(r4, r13)
            if (r14 != 0) goto L_0x0136
            java.util.List r13 = r15.getAnnotations()
            java.util.Iterator r13 = r13.iterator()
        L_0x011e:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0133
            java.lang.Object r14 = r13.next()
            r9 = r14
            java.lang.annotation.Annotation r9 = (java.lang.annotation.Annotation) r9
            boolean r9 = r9 instanceof p000.y33
            if (r9 == 0) goto L_0x0130
            goto L_0x0134
        L_0x0130:
            r9 = 10
            goto L_0x011e
        L_0x0133:
            r14 = 0
        L_0x0134:
            y33 r14 = (p000.y33) r14
        L_0x0136:
            java.lang.reflect.Field r9 = p000.oa5.m23728b(r10)
            if (r9 == 0) goto L_0x0141
            int r9 = r9.getModifiers()
            goto L_0x0142
        L_0x0141:
            r9 = 0
        L_0x0142:
            boolean r9 = java.lang.reflect.Modifier.isTransient(r9)
            if (r9 == 0) goto L_0x0176
            if (r15 == 0) goto L_0x0153
            boolean r4 = r15.mo45215m()
            if (r4 == 0) goto L_0x0151
            goto L_0x0153
        L_0x0151:
            r4 = 0
            goto L_0x0154
        L_0x0153:
            r4 = r3
        L_0x0154:
            if (r4 == 0) goto L_0x015b
        L_0x0156:
            r4 = 0
            r9 = 10
            goto L_0x00c8
        L_0x015b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No default value for transient constructor "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0176:
            if (r14 == 0) goto L_0x0180
            boolean r9 = r14.ignore()
            if (r9 != r3) goto L_0x0180
            r9 = r3
            goto L_0x0181
        L_0x0180:
            r9 = 0
        L_0x0181:
            if (r9 == 0) goto L_0x01ad
            if (r15 == 0) goto L_0x018e
            boolean r4 = r15.mo45215m()
            if (r4 == 0) goto L_0x018c
            goto L_0x018e
        L_0x018c:
            r4 = 0
            goto L_0x018f
        L_0x018e:
            r4 = r3
        L_0x018f:
            if (r4 == 0) goto L_0x0192
            goto L_0x0156
        L_0x0192:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No default value for ignored constructor "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x01ad:
            if (r15 == 0) goto L_0x01c0
            m93 r9 = r15.getType()
            m93 r13 = r10.getReturnType()
            boolean r9 = p000.vx2.m53586b(r9, r13)
            if (r9 == 0) goto L_0x01be
            goto L_0x01c0
        L_0x01be:
            r9 = 0
            goto L_0x01c1
        L_0x01c0:
            r9 = r3
        L_0x01c1:
            if (r9 == 0) goto L_0x02b9
            boolean r9 = r10 instanceof p000.g93
            if (r9 != 0) goto L_0x01c9
            if (r15 == 0) goto L_0x0156
        L_0x01c9:
            if (r14 == 0) goto L_0x01dd
            java.lang.String r9 = r14.name()
            if (r9 == 0) goto L_0x01dd
            java.lang.String r13 = "\u0000"
            boolean r13 = p000.vx2.m53586b(r9, r13)
            if (r13 != 0) goto L_0x01da
            goto L_0x01db
        L_0x01da:
            r9 = 0
        L_0x01db:
            if (r9 != 0) goto L_0x01e1
        L_0x01dd:
            java.lang.String r9 = r10.getName()
        L_0x01e1:
            r14 = r9
            m93 r9 = r10.getReturnType()
            x83 r9 = r9.mo45705d()
            boolean r13 = r9 instanceof p000.q83
            if (r13 == 0) goto L_0x025b
            q83 r9 = (p000.q83) r9
            boolean r13 = r9.mo47003q()
            if (r13 == 0) goto L_0x0252
            java.lang.Class r9 = p000.x73.m54253b(r9)
            m93 r13 = r10.getReturnType()
            java.util.List r13 = r13.mo45704b()
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x0209
            goto L_0x0267
        L_0x0209:
            m93 r13 = r10.getReturnType()
            java.util.List r13 = r13.mo45704b()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x021a:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L_0x023a
            java.lang.Object r16 = r13.next()
            q93 r16 = (p000.q93) r16
            m93 r16 = r16.mo47028c()
            if (r16 == 0) goto L_0x0233
            java.lang.reflect.Type r16 = p000.oa5.m23732f(r16)
            r7 = r16
            goto L_0x0234
        L_0x0233:
            r7 = 0
        L_0x0234:
            if (r7 == 0) goto L_0x021a
            r3.add(r7)
            goto L_0x021a
        L_0x023a:
            r7 = 0
            java.lang.reflect.Type[] r13 = new java.lang.reflect.Type[r7]
            java.lang.Object[] r3 = r3.toArray(r13)
            p000.vx2.m53589e(r3, r12)
            java.lang.reflect.Type[] r3 = (java.lang.reflect.Type[]) r3
            int r7 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r7)
            java.lang.reflect.Type[] r3 = (java.lang.reflect.Type[]) r3
            java.lang.reflect.ParameterizedType r9 = p000.u27.m52594j(r9, r3)
            goto L_0x0267
        L_0x0252:
            m93 r3 = r10.getReturnType()
            java.lang.reflect.Type r9 = p000.oa5.m23732f(r3)
            goto L_0x0267
        L_0x025b:
            boolean r3 = r9 instanceof p000.o93
            if (r3 == 0) goto L_0x02ad
            m93 r3 = r10.getReturnType()
            java.lang.reflect.Type r9 = p000.oa5.m23732f(r3)
        L_0x0267:
            java.lang.reflect.Type r3 = p000.t67.m52115p(r1, r5, r9)
            r7 = 0
            java.lang.annotation.Annotation[] r9 = new java.lang.annotation.Annotation[r7]
            java.lang.Object[] r4 = r4.toArray(r9)
            p000.vx2.m53589e(r4, r12)
            java.lang.annotation.Annotation[] r4 = (java.lang.annotation.Annotation[]) r4
            java.util.Set r4 = p000.t67.m52110k(r4)
            java.lang.String r7 = r10.getName()
            com.squareup.moshi.d r3 = r2.mo39411f(r3, r4, r7)
            java.lang.String r4 = r10.getName()
            qc3$a r7 = new qc3$a
            java.lang.String r9 = "adapter"
            p000.vx2.m53590f(r3, r9)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Any, kotlin.Any?>"
            p000.vx2.m53589e(r10, r9)
            if (r15 == 0) goto L_0x029a
            int r9 = r15.getIndex()
            goto L_0x029b
        L_0x029a:
            r9 = -1
        L_0x029b:
            r18 = r9
            r13 = r7
            r9 = r15
            r15 = r3
            r16 = r10
            r17 = r9
            r13.<init>(r14, r15, r16, r17, r18)
            r8.put(r4, r7)
            r3 = 1
            goto L_0x0156
        L_0x02ad:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not possible!"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02b9:
            r9 = r15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = r10.getName()
            r0.append(r1)
            java.lang.String r1 = "' has a constructor parameter of type "
            r0.append(r1)
            p000.vx2.m53588d(r9)
            m93 r1 = r9.getType()
            r0.append(r1)
            java.lang.String r1 = " but a property of type "
            r0.append(r1)
            m93 r1 = r10.getReturnType()
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x02f9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r6.getParameters()
            java.util.Iterator r1 = r1.iterator()
        L_0x0306:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x034d
            java.lang.Object r2 = r1.next()
            kotlin.reflect.KParameter r2 = (kotlin.reflect.KParameter) r2
            java.lang.String r3 = r2.getName()
            java.util.Map r4 = p000.t07.m52025d(r8)
            java.lang.Object r3 = r4.remove(r3)
            qc3$a r3 = (p000.qc3.C6401a) r3
            if (r3 != 0) goto L_0x032b
            boolean r4 = r2.mo45215m()
            if (r4 == 0) goto L_0x0329
            goto L_0x032b
        L_0x0329:
            r7 = 0
            goto L_0x032c
        L_0x032b:
            r7 = 1
        L_0x032c:
            if (r7 == 0) goto L_0x0332
            r0.add(r3)
            goto L_0x0306
        L_0x0332:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No property for required constructor "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x034d:
            int r1 = r0.size()
            java.util.Set r2 = r8.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0359:
            r24 = r1
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0385
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            r19 = r1
            qc3$a r19 = (p000.qc3.C6401a) r19
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            int r1 = r24 + 1
            r25 = 15
            r26 = 0
            qc3$a r3 = p000.qc3.C6401a.m50499b(r19, r20, r21, r22, r23, r24, r25, r26)
            r0.add(r3)
            goto L_0x0359
        L_0x0385:
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47326W(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p000.dk0.m43495u(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L_0x0398:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03ac
            java.lang.Object r4 = r3.next()
            qc3$a r4 = (p000.qc3.C6401a) r4
            java.lang.String r4 = r4.mo47043e()
            r2.add(r4)
            goto L_0x0398
        L_0x03ac:
            r4 = 0
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r3)
            p000.vx2.m53589e(r2, r12)
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            com.squareup.moshi.JsonReader$b r2 = com.squareup.moshi.JsonReader.C5372b.m41530a(r2)
            qc3 r3 = new qc3
            java.lang.String r4 = "options"
            p000.vx2.m53590f(r2, r4)
            r3.<init>(r6, r0, r1, r2)
            com.squareup.moshi.d r0 = r3.mo39365f()
            return r0
        L_0x03d2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot reflectively serialize sealed class "
            r0.append(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            java.lang.String r1 = ". Please register an adapter."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x03f6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot serialize object declaration "
            r0.append(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0415:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot serialize inner class "
            r0.append(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0434:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot serialize abstract class "
            r0.append(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0453:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot serialize local class or object expression "
            r0.append(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0472:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rc3.mo39349a(java.lang.reflect.Type, java.util.Set, com.squareup.moshi.h):com.squareup.moshi.d");
    }
}
