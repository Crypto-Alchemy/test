package com.google.android.gms.internal.clearcut;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.f */
public final class C4062f {
    /* renamed from: a */
    public static String m33884a(tj8 tj8, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m33886c(tj8, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m33885b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m33885b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m33885b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(wn8.m53993a(zzbb.zzf((String) obj)));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof zzbb) {
                sb.append(": \"");
                sb.append(wn8.m53993a((zzbb) obj));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof C4056e) {
                sb.append(" {");
                m33886c((C4056e) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m33885b(sb, i4, "key", entry.getKey());
                m33885b(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e6, code lost:
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f8, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0209, code lost:
        if (((java.lang.Float) r11).floatValue() == com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021b, code lost:
        if (((java.lang.Double) r11).doubleValue() == com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON) goto L_0x01e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x024d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m33886c(p000.tj8 r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeSet r5 = new java.util.TreeSet
            r5.<init>()
            java.lang.Class r6 = r18.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = r8
        L_0x0020:
            java.lang.String r10 = "get"
            if (r9 >= r7) goto L_0x004f
            r11 = r6[r9]
            java.lang.String r12 = r11.getName()
            r4.put(r12, r11)
            java.lang.Class[] r12 = r11.getParameterTypes()
            int r12 = r12.length
            if (r12 != 0) goto L_0x004c
            java.lang.String r12 = r11.getName()
            r3.put(r12, r11)
            java.lang.String r12 = r11.getName()
            boolean r10 = r12.startsWith(r10)
            if (r10 == 0) goto L_0x004c
            java.lang.String r10 = r11.getName()
            r5.add(r10)
        L_0x004c:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x004f:
            java.util.Iterator r5 = r5.iterator()
        L_0x0053:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0266
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ""
            java.lang.String r9 = r6.replaceFirst(r10, r7)
            java.lang.String r11 = "List"
            boolean r12 = r9.endsWith(r11)
            r13 = 1
            if (r12 == 0) goto L_0x00c9
            java.lang.String r12 = "OrBuilderList"
            boolean r12 = r9.endsWith(r12)
            if (r12 != 0) goto L_0x00c9
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x00c9
            java.lang.String r11 = r9.substring(r8, r13)
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r9.length()
            int r12 = r12 + -4
            java.lang.String r12 = r9.substring(r13, r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r14 = r12.length()
            if (r14 == 0) goto L_0x00a1
            java.lang.String r11 = r11.concat(r12)
            goto L_0x00a7
        L_0x00a1:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            r11 = r12
        L_0x00a7:
            java.lang.Object r12 = r3.get(r6)
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r12 == 0) goto L_0x00c9
            java.lang.Class r14 = r12.getReturnType()
            java.lang.Class<java.util.List> r15 = java.util.List.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x00c9
            java.lang.String r6 = m33887d(r11)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.android.gms.internal.clearcut.C4056e.m33854f(r12, r0, r7)
            m33885b(r1, r2, r6, r7)
            goto L_0x0053
        L_0x00c9:
            java.lang.String r11 = "Map"
            boolean r12 = r9.endsWith(r11)
            if (r12 == 0) goto L_0x0137
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x0137
            java.lang.String r11 = r9.substring(r8, r13)
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r9.length()
            int r12 = r12 + -3
            java.lang.String r12 = r9.substring(r13, r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r14 = r12.length()
            if (r14 == 0) goto L_0x00fc
            java.lang.String r11 = r11.concat(r12)
            goto L_0x0102
        L_0x00fc:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            r11 = r12
        L_0x0102:
            java.lang.Object r6 = r3.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L_0x0137
            java.lang.Class r12 = r6.getReturnType()
            java.lang.Class<java.util.Map> r14 = java.util.Map.class
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x0137
            java.lang.Class<java.lang.Deprecated> r12 = java.lang.Deprecated.class
            boolean r12 = r6.isAnnotationPresent(r12)
            if (r12 != 0) goto L_0x0137
            int r12 = r6.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 == 0) goto L_0x0137
            java.lang.String r7 = m33887d(r11)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r6 = com.google.android.gms.internal.clearcut.C4056e.m33854f(r6, r0, r9)
            m33885b(r1, r2, r7, r6)
            goto L_0x0053
        L_0x0137:
            java.lang.String r6 = "set"
            int r11 = r9.length()
            if (r11 == 0) goto L_0x0144
            java.lang.String r6 = r6.concat(r9)
            goto L_0x014a
        L_0x0144:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r6)
            r6 = r11
        L_0x014a:
            java.lang.Object r6 = r4.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L_0x0053
            java.lang.String r6 = "Bytes"
            boolean r6 = r9.endsWith(r6)
            if (r6 == 0) goto L_0x017e
            int r6 = r9.length()
            int r6 = r6 + -5
            java.lang.String r6 = r9.substring(r8, r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r11 = r6.length()
            if (r11 == 0) goto L_0x0173
            java.lang.String r6 = r10.concat(r6)
            goto L_0x0178
        L_0x0173:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r10)
        L_0x0178:
            boolean r6 = r3.containsKey(r6)
            if (r6 != 0) goto L_0x0053
        L_0x017e:
            java.lang.String r6 = r9.substring(r8, r13)
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r11 = r9.substring(r13)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r11.length()
            if (r12 == 0) goto L_0x019d
            java.lang.String r6 = r6.concat(r11)
            goto L_0x01a3
        L_0x019d:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r6)
            r6 = r11
        L_0x01a3:
            int r11 = r9.length()
            if (r11 == 0) goto L_0x01ae
            java.lang.String r11 = r10.concat(r9)
            goto L_0x01b3
        L_0x01ae:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r10)
        L_0x01b3:
            java.lang.Object r11 = r3.get(r11)
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.String r12 = "has"
            int r14 = r9.length()
            if (r14 == 0) goto L_0x01c6
            java.lang.String r9 = r12.concat(r9)
            goto L_0x01cb
        L_0x01c6:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r12)
        L_0x01cb:
            java.lang.Object r9 = r3.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r11 == 0) goto L_0x0053
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.C4056e.m33854f(r11, r0, r12)
            if (r9 != 0) goto L_0x024f
            boolean r9 = r11 instanceof java.lang.Boolean
            if (r9 == 0) goto L_0x01ed
            r7 = r11
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x01eb
        L_0x01e8:
            r7 = r13
            goto L_0x024a
        L_0x01eb:
            r7 = r8
            goto L_0x024a
        L_0x01ed:
            boolean r9 = r11 instanceof java.lang.Integer
            if (r9 == 0) goto L_0x01fb
            r7 = r11
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L_0x01eb
            goto L_0x01e8
        L_0x01fb:
            boolean r9 = r11 instanceof java.lang.Float
            if (r9 == 0) goto L_0x020c
            r7 = r11
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x01eb
            goto L_0x01e8
        L_0x020c:
            boolean r9 = r11 instanceof java.lang.Double
            if (r9 == 0) goto L_0x021e
            r7 = r11
            java.lang.Double r7 = (java.lang.Double) r7
            double r14 = r7.doubleValue()
            r16 = 0
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 != 0) goto L_0x01eb
            goto L_0x01e8
        L_0x021e:
            boolean r9 = r11 instanceof java.lang.String
            if (r9 == 0) goto L_0x0227
        L_0x0222:
            boolean r7 = r11.equals(r7)
            goto L_0x024a
        L_0x0227:
            boolean r7 = r11 instanceof com.google.android.gms.internal.clearcut.zzbb
            if (r7 == 0) goto L_0x022e
            com.google.android.gms.internal.clearcut.zzbb r7 = com.google.android.gms.internal.clearcut.zzbb.zzfi
            goto L_0x0222
        L_0x022e:
            boolean r7 = r11 instanceof p000.tj8
            if (r7 == 0) goto L_0x023c
            r7 = r11
            tj8 r7 = (p000.tj8) r7
            tj8 r7 = r7.mo30766a()
            if (r11 != r7) goto L_0x01eb
            goto L_0x01e8
        L_0x023c:
            boolean r7 = r11 instanceof java.lang.Enum
            if (r7 == 0) goto L_0x01eb
            r7 = r11
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
            if (r7 != 0) goto L_0x01eb
            goto L_0x01e8
        L_0x024a:
            if (r7 != 0) goto L_0x024d
            goto L_0x025b
        L_0x024d:
            r13 = r8
            goto L_0x025b
        L_0x024f:
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.android.gms.internal.clearcut.C4056e.m33854f(r9, r0, r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r13 = r7.booleanValue()
        L_0x025b:
            if (r13 == 0) goto L_0x0053
            java.lang.String r6 = m33887d(r6)
            m33885b(r1, r2, r6, r11)
            goto L_0x0053
        L_0x0266:
            boolean r3 = r0 instanceof com.google.android.gms.internal.clearcut.C4056e.C4059c
            if (r3 == 0) goto L_0x02a7
            r3 = r0
            com.google.android.gms.internal.clearcut.e$c r3 = (com.google.android.gms.internal.clearcut.C4056e.C4059c) r3
            td8<com.google.android.gms.internal.clearcut.e$d> r3 = r3.zzjv
            java.util.Iterator r3 = r3.mo48084e()
        L_0x0273:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02a7
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            com.google.android.gms.internal.clearcut.e$d r5 = (com.google.android.gms.internal.clearcut.C4056e.C4060d) r5
            int r5 = r5.f22452a
            r6 = 13
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "["
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = "]"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.Object r4 = r4.getValue()
            m33885b(r1, r2, r5, r4)
            goto L_0x0273
        L_0x02a7:
            com.google.android.gms.internal.clearcut.e r0 = (com.google.android.gms.internal.clearcut.C4056e) r0
            jo8 r0 = r0.zzjp
            if (r0 == 0) goto L_0x02b0
            r0.mo44545b(r1, r2)
        L_0x02b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C4062f.m33886c(tj8, java.lang.StringBuilder, int):void");
    }

    /* renamed from: d */
    public static final String m33887d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
