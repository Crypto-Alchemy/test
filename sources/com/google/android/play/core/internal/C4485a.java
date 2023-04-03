package com.google.android.play.core.internal;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.internal.a */
public final class C4485a {
    /* renamed from: a */
    public static Pair<ByteBuffer, Long> m36480a(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> h = m36487h(randomAccessFile, 0);
        return h != null ? h : m36487h(randomAccessFile, 65535);
    }

    /* renamed from: b */
    public static long m36481b(ByteBuffer byteBuffer) {
        m36488i(byteBuffer);
        return m36489j(byteBuffer, byteBuffer.position() + 16);
    }

    /* renamed from: c */
    public static void m36482c(ByteBuffer byteBuffer, long j) {
        m36488i(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j < 0 || j > 4294967295L) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("uint32 value of out range: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        byteBuffer.putInt(byteBuffer.position() + position, (int) j);
    }

    /* renamed from: d */
    public static long m36483d(ByteBuffer byteBuffer) {
        m36488i(byteBuffer);
        return m36489j(byteBuffer, byteBuffer.position() + 12);
    }

    /* renamed from: e */
    public static String m36484e(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: f */
    public static String m36485f(String str, String str2, String str3) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: g */
    public static X509Certificate[][] m36486g(String str) throws C4490f, SecurityException, IOException {
        ByteBuffer byteBuffer;
        int limit;
        int position;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair<ByteBuffer, Long> a = m36480a(randomAccessFile);
            if (a != null) {
                ByteBuffer byteBuffer2 = (ByteBuffer) a.first;
                long longValue = ((Long) a.second).longValue();
                long j = -20 + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new C4490f("ZIP64 APK not supported");
                    }
                }
                long b = m36481b(byteBuffer2);
                if (b >= longValue) {
                    StringBuilder sb = new StringBuilder(122);
                    sb.append("ZIP Central Directory offset out of range: ");
                    sb.append(b);
                    sb.append(". ZIP End of Central Directory offset: ");
                    sb.append(longValue);
                    throw new C4490f(sb.toString());
                } else if (m36483d(byteBuffer2) + b != longValue) {
                    throw new C4490f("ZIP Central Directory is not immediately followed by End of Central Directory");
                } else if (b >= 32) {
                    ByteBuffer allocate = ByteBuffer.allocate(24);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    allocate.order(byteOrder);
                    randomAccessFile.seek(b - ((long) allocate.capacity()));
                    randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                        int i = 0;
                        long j2 = allocate.getLong(0);
                        if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                            StringBuilder sb2 = new StringBuilder(57);
                            sb2.append("APK Signing Block size out of range: ");
                            sb2.append(j2);
                            throw new C4490f(sb2.toString());
                        }
                        int i2 = (int) (8 + j2);
                        long j3 = b - ((long) i2);
                        if (j3 >= 0) {
                            ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                            allocate2.order(byteOrder);
                            randomAccessFile.seek(j3);
                            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                            long j4 = allocate2.getLong(0);
                            if (j4 == j2) {
                                Pair create = Pair.create(allocate2, Long.valueOf(j3));
                                byteBuffer = (ByteBuffer) create.first;
                                long longValue2 = ((Long) create.second).longValue();
                                if (byteBuffer.order() == byteOrder) {
                                    int capacity = byteBuffer.capacity() - 24;
                                    if (capacity >= 8) {
                                        int capacity2 = byteBuffer.capacity();
                                        if (capacity <= byteBuffer.capacity()) {
                                            limit = byteBuffer.limit();
                                            position = byteBuffer.position();
                                            byteBuffer.position(0);
                                            byteBuffer.limit(capacity);
                                            byteBuffer.position(8);
                                            ByteBuffer slice = byteBuffer.slice();
                                            slice.order(byteBuffer.order());
                                            byteBuffer.position(0);
                                            byteBuffer.limit(limit);
                                            byteBuffer.position(position);
                                            while (slice.hasRemaining()) {
                                                i++;
                                                if (slice.remaining() >= 8) {
                                                    long j5 = slice.getLong();
                                                    if (j5 < 4 || j5 > 2147483647L) {
                                                        StringBuilder sb3 = new StringBuilder(76);
                                                        sb3.append("APK Signing Block entry #");
                                                        sb3.append(i);
                                                        sb3.append(" size out of range: ");
                                                        sb3.append(j5);
                                                        throw new C4490f(sb3.toString());
                                                    }
                                                    int i3 = (int) j5;
                                                    int position2 = slice.position() + i3;
                                                    if (i3 > slice.remaining()) {
                                                        int remaining = slice.remaining();
                                                        StringBuilder sb4 = new StringBuilder(91);
                                                        sb4.append("APK Signing Block entry #");
                                                        sb4.append(i);
                                                        sb4.append(" size out of range: ");
                                                        sb4.append(i3);
                                                        sb4.append(", available: ");
                                                        sb4.append(remaining);
                                                        throw new C4490f(sb4.toString());
                                                    } else if (slice.getInt() == 1896449818) {
                                                        X509Certificate[][] k = m36490k(randomAccessFile.getChannel(), new wu7(m36497r(slice, i3 - 4), longValue2, b, longValue, byteBuffer2));
                                                        randomAccessFile.close();
                                                        try {
                                                            randomAccessFile.close();
                                                        } catch (IOException unused) {
                                                        }
                                                        return k;
                                                    } else {
                                                        slice.position(position2);
                                                    }
                                                } else {
                                                    StringBuilder sb5 = new StringBuilder(70);
                                                    sb5.append("Insufficient data to read size of APK Signing Block entry #");
                                                    sb5.append(i);
                                                    throw new C4490f(sb5.toString());
                                                }
                                            }
                                            throw new C4490f("No APK Signature Scheme v2 block in APK Signing Block");
                                        }
                                        StringBuilder sb6 = new StringBuilder(41);
                                        sb6.append("end > capacity: ");
                                        sb6.append(capacity);
                                        sb6.append(" > ");
                                        sb6.append(capacity2);
                                        throw new IllegalArgumentException(sb6.toString());
                                    }
                                    StringBuilder sb7 = new StringBuilder(38);
                                    sb7.append("end < start: ");
                                    sb7.append(capacity);
                                    sb7.append(" < ");
                                    sb7.append(8);
                                    throw new IllegalArgumentException(sb7.toString());
                                }
                                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                            }
                            StringBuilder sb8 = new StringBuilder(103);
                            sb8.append("APK Signing Block sizes in header and footer do not match: ");
                            sb8.append(j4);
                            sb8.append(" vs ");
                            sb8.append(j2);
                            throw new C4490f(sb8.toString());
                        }
                        StringBuilder sb9 = new StringBuilder(59);
                        sb9.append("APK Signing Block offset out of range: ");
                        sb9.append(j3);
                        throw new C4490f(sb9.toString());
                    }
                    throw new C4490f("No APK Signing Block before ZIP Central Directory");
                } else {
                    StringBuilder sb10 = new StringBuilder(87);
                    sb10.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb10.append(b);
                    throw new C4490f(sb10.toString());
                }
            } else {
                long length = randomAccessFile.length();
                StringBuilder sb11 = new StringBuilder(102);
                sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb11.append(length);
                sb11.append(" bytes");
                throw new C4490f(sb11.toString());
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* renamed from: h */
    public static Pair<ByteBuffer, Long> m36487h(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i, -22 + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - ((long) allocate.capacity());
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        m36488i(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, 65535);
            int i4 = 0;
            while (true) {
                if (i4 >= min) {
                    break;
                }
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                    break;
                }
                i4++;
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + ((long) i2)));
    }

    /* renamed from: i */
    public static void m36488i(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* renamed from: j */
    public static long m36489j(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    /* renamed from: k */
    public static X509Certificate[][] m36490k(FileChannel fileChannel, wu7 wu7) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer s = m36498s(wu7.f35439a);
                int i = 0;
                while (s.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m36491l(m36498s(s), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    m36492m(hashMap, fileChannel, wu7.f35440b, wu7.f35441c, wu7.f35442d, wu7.f35443e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011f, code lost:
        r1 = android.util.Pair.create(r5, r1);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.cert.X509Certificate[] m36491l(java.nio.ByteBuffer r22, java.util.Map<java.lang.Integer, byte[]> r23, java.security.cert.CertificateFactory r24) throws java.lang.SecurityException, java.io.IOException {
        /*
            java.nio.ByteBuffer r0 = m36498s(r22)
            java.nio.ByteBuffer r1 = m36498s(r22)
            byte[] r2 = m36499t(r22)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = -1
            r6 = 0
            r7 = r4
            r9 = r6
            r8 = 0
        L_0x0016:
            boolean r10 = r1.hasRemaining()
            r11 = 8
            r12 = 769(0x301, float:1.078E-42)
            r13 = 514(0x202, float:7.2E-43)
            r14 = 513(0x201, float:7.19E-43)
            r15 = 1
            if (r10 == 0) goto L_0x0080
            int r8 = r8 + 1
            java.nio.ByteBuffer r10 = m36498s(r1)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            int r5 = r10.remaining()     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            if (r5 < r11) goto L_0x005c
            int r5 = r10.getInt()     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            r3.add(r11)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            if (r5 == r14) goto L_0x0046
            if (r5 == r13) goto L_0x0046
            if (r5 == r12) goto L_0x0046
            switch(r5) {
                case 257: goto L_0x0046;
                case 258: goto L_0x0046;
                case 259: goto L_0x0046;
                case 260: goto L_0x0046;
                default: goto L_0x0045;
            }     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
        L_0x0045:
            goto L_0x0016
        L_0x0046:
            if (r7 == r4) goto L_0x0055
            int r11 = m36494o(r5)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            int r12 = m36494o(r7)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            if (r11 == r15) goto L_0x0016
            if (r12 == r15) goto L_0x0055
            goto L_0x0016
        L_0x0055:
            byte[] r7 = m36499t(r10)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            r9 = r7
            r7 = r5
            goto L_0x0016
        L_0x005c:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            java.lang.String r1 = "Signature record too short"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            throw r0     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            goto L_0x0067
        L_0x0066:
            r0 = move-exception
        L_0x0067:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 45
            r2.<init>(r3)
            java.lang.String r3 = "Failed to parse signature record #"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0080:
            if (r7 != r4) goto L_0x0092
            java.lang.SecurityException r0 = new java.lang.SecurityException
            if (r8 != 0) goto L_0x008c
            java.lang.String r1 = "No signatures found"
            r0.<init>(r1)
            throw r0
        L_0x008c:
            java.lang.String r1 = "No supported signatures found"
            r0.<init>(r1)
            throw r0
        L_0x0092:
            java.lang.String r1 = "Unknown signature algorithm: 0x"
            if (r7 == r14) goto L_0x00c3
            if (r7 == r13) goto L_0x00c3
            if (r7 == r12) goto L_0x00c0
            switch(r7) {
                case 257: goto L_0x00bd;
                case 258: goto L_0x00bd;
                case 259: goto L_0x00bd;
                case 260: goto L_0x00bd;
                default: goto L_0x009d;
            }
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            long r2 = (long) r7
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00b3
            java.lang.String r1 = r1.concat(r2)
            goto L_0x00b9
        L_0x00b3:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x00b9:
            r0.<init>(r1)
            throw r0
        L_0x00bd:
            java.lang.String r4 = "RSA"
            goto L_0x00c5
        L_0x00c0:
            java.lang.String r4 = "DSA"
            goto L_0x00c5
        L_0x00c3:
            java.lang.String r4 = "EC"
        L_0x00c5:
            if (r7 == r14) goto L_0x012a
            if (r7 == r13) goto L_0x0127
            if (r7 == r12) goto L_0x0124
            switch(r7) {
                case 257: goto L_0x010c;
                case 258: goto L_0x00f8;
                case 259: goto L_0x00f1;
                case 260: goto L_0x00ee;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            long r2 = (long) r7
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00e4
            java.lang.String r1 = r1.concat(r2)
            goto L_0x00ea
        L_0x00e4:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x00ea:
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            java.lang.String r1 = "SHA512withRSA"
            goto L_0x00f3
        L_0x00f1:
            java.lang.String r1 = "SHA256withRSA"
        L_0x00f3:
            android.util.Pair r1 = android.util.Pair.create(r1, r6)
            goto L_0x012d
        L_0x00f8:
            java.security.spec.PSSParameterSpec r1 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r19 = java.security.spec.MGF1ParameterSpec.SHA512
            r20 = 64
            r21 = 1
            java.lang.String r17 = "SHA-512"
            java.lang.String r18 = "MGF1"
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            java.lang.String r5 = "SHA512withRSA/PSS"
            goto L_0x011f
        L_0x010c:
            java.security.spec.PSSParameterSpec r1 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r19 = java.security.spec.MGF1ParameterSpec.SHA256
            r20 = 32
            r21 = 1
            java.lang.String r17 = "SHA-256"
            java.lang.String r18 = "MGF1"
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            java.lang.String r5 = "SHA256withRSA/PSS"
        L_0x011f:
            android.util.Pair r1 = android.util.Pair.create(r5, r1)
            goto L_0x012d
        L_0x0124:
            java.lang.String r1 = "SHA256withDSA"
            goto L_0x00f3
        L_0x0127:
            java.lang.String r1 = "SHA512withECDSA"
            goto L_0x00f3
        L_0x012a:
            java.lang.String r1 = "SHA256withECDSA"
            goto L_0x00f3
        L_0x012d:
            java.lang.Object r5 = r1.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.second
            java.security.spec.AlgorithmParameterSpec r1 = (java.security.spec.AlgorithmParameterSpec) r1
            java.security.KeyFactory r4 = java.security.KeyFactory.getInstance(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            java.security.spec.X509EncodedKeySpec r8 = new java.security.spec.X509EncodedKeySpec     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            r8.<init>(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            java.security.PublicKey r4 = r4.generatePublic(r8)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            java.security.Signature r8 = java.security.Signature.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            r8.initVerify(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            if (r1 == 0) goto L_0x014e
            r8.setParameter(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
        L_0x014e:
            r8.update(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            boolean r1 = r8.verify(r9)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            if (r1 == 0) goto L_0x025f
            r0.clear()
            java.nio.ByteBuffer r1 = m36498s(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
        L_0x0164:
            boolean r8 = r1.hasRemaining()
            if (r8 == 0) goto L_0x01ab
            int r5 = r5 + r15
            java.nio.ByteBuffer r8 = m36498s(r1)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            int r9 = r8.remaining()     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            if (r9 < r11) goto L_0x0187
            int r9 = r8.getInt()     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            r4.add(r10)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            if (r9 != r7) goto L_0x0164
            byte[] r6 = m36499t(r8)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            goto L_0x0164
        L_0x0187:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            java.lang.String r1 = "Record too short"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            throw r0     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
        L_0x018f:
            r0 = move-exception
            goto L_0x0192
        L_0x0191:
            r0 = move-exception
        L_0x0192:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 42
            r2.<init>(r3)
            java.lang.String r3 = "Failed to parse digest record #"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x01ab:
            boolean r1 = r3.equals(r4)
            if (r1 == 0) goto L_0x0257
            int r1 = m36494o(r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r23
            java.lang.Object r3 = r4.put(r3, r6)
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L_0x01da
            boolean r3 = java.security.MessageDigest.isEqual(r3, r6)
            if (r3 == 0) goto L_0x01ca
            goto L_0x01da
        L_0x01ca:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = m36495p(r1)
            java.lang.String r2 = " contents digest does not match the digest specified by a preceding signer"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x01da:
            java.nio.ByteBuffer r0 = m36498s(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
        L_0x01e4:
            boolean r4 = r0.hasRemaining()
            if (r4 == 0) goto L_0x021f
            int r3 = r3 + r15
            byte[] r4 = m36499t(r0)
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ CertificateException -> 0x0205 }
            r5.<init>(r4)     // Catch:{ CertificateException -> 0x0205 }
            r6 = r24
            java.security.cert.Certificate r5 = r6.generateCertificate(r5)     // Catch:{ CertificateException -> 0x0205 }
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch:{ CertificateException -> 0x0205 }
            com.google.android.play.core.internal.g r7 = new com.google.android.play.core.internal.g
            r7.<init>(r5, r4)
            r1.add(r7)
            goto L_0x01e4
        L_0x0205:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 41
            r2.<init>(r4)
            java.lang.String r4 = "Failed to decode certificate #"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x021f:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x024f
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.security.PublicKey r0 = r0.getPublicKey()
            byte[] r0 = r0.getEncoded()
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L_0x0247
            int r0 = r1.size()
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.security.cert.X509Certificate[] r0 = (java.security.cert.X509Certificate[]) r0
            return r0
        L_0x0247:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Public key mismatch between certificate and signature record"
            r0.<init>(r1)
            throw r0
        L_0x024f:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No certificates listed"
            r0.<init>(r1)
            throw r0
        L_0x0257:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Signature algorithms don't match between digests and signatures records"
            r0.<init>(r1)
            throw r0
        L_0x025f:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = " signature did not verify"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x026f:
            r0 = move-exception
            goto L_0x0278
        L_0x0271:
            r0 = move-exception
            goto L_0x0278
        L_0x0273:
            r0 = move-exception
            goto L_0x0278
        L_0x0275:
            r0 = move-exception
            goto L_0x0278
        L_0x0277:
            r0 = move-exception
        L_0x0278:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 27
            r3.<init>(r2)
            java.lang.String r2 = "Failed to verify "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = " signature"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C4485a.m36491l(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    /* renamed from: m */
    public static void m36492m(Map<Integer, byte[]> map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            ou7 ou7 = new ou7(fileChannel, 0, j);
            ou7 ou72 = new ou7(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            long j4 = j;
            m36482c(duplicate, j);
            yr7 yr7 = new yr7(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            int i2 = 0;
            for (Integer intValue : map.keySet()) {
                iArr[i2] = intValue.intValue();
                i2++;
            }
            try {
                byte[][] n = m36493n(iArr, new nt7[]{ou7, ou72, yr7});
                while (i < size) {
                    int i3 = iArr[i];
                    Map<Integer, byte[]> map2 = map;
                    if (MessageDigest.isEqual(map.get(Integer.valueOf(i3)), n[i])) {
                        i++;
                    } else {
                        throw new SecurityException(m36495p(i3).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    /* renamed from: n */
    public static byte[][] m36493n(int[] iArr, nt7[] nt7Arr) throws DigestException {
        long j;
        int i;
        int length;
        int[] iArr2 = iArr;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            j3 += (nt7Arr[i2].mo46219a() + 1048575) / 1048576;
            i2++;
        }
        if (j3 < 2097151) {
            int i3 = (int) j3;
            byte[][] bArr = new byte[iArr2.length][];
            int i4 = 0;
            while (true) {
                length = iArr2.length;
                if (i4 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[((m36496q(iArr2[i4]) * i3) + 5)];
                bArr2[0] = 90;
                m36500u(i3, bArr2);
                bArr[i4] = bArr2;
                i4++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i5 = 0;
            while (i5 < iArr2.length) {
                String p = m36495p(iArr2[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(p);
                    i5++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(p.concat(" digest not supported"), e);
                }
            }
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (i = 3; i6 < i; i = 3) {
                nt7 nt7 = nt7Arr[i6];
                long j4 = j2;
                int i9 = i6;
                long a = nt7.mo46219a();
                while (a > j2) {
                    int min = (int) Math.min(a, j);
                    m36500u(min, bArr3);
                    for (int i10 = 0; i10 < length; i10++) {
                        messageDigestArr[i10].update(bArr3);
                    }
                    long j5 = j4;
                    try {
                        nt7.mo46220a(messageDigestArr, j5, min);
                        int i11 = 0;
                        while (i11 < iArr2.length) {
                            int i12 = iArr2[i11];
                            nt7 nt72 = nt7;
                            byte[] bArr4 = bArr[i11];
                            int q = m36496q(i12);
                            byte[] bArr5 = bArr3;
                            MessageDigest messageDigest = messageDigestArr[i11];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr4, (i7 * q) + 5, q);
                            if (digest == q) {
                                i11++;
                                nt7 = nt72;
                                bArr3 = bArr5;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        nt7 nt73 = nt7;
                        MessageDigest[] messageDigestArr3 = messageDigestArr;
                        long j6 = (long) min;
                        long j7 = j5 + j6;
                        a -= j6;
                        i7++;
                        j2 = 0;
                        j = 1048576;
                        long j8 = j7;
                        nt7 = nt73;
                        j4 = j8;
                        bArr3 = bArr3;
                    } catch (IOException e2) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(i7);
                        sb2.append(" of section #");
                        sb2.append(i8);
                        throw new DigestException(sb2.toString(), e2);
                    }
                }
                byte[] bArr6 = bArr3;
                MessageDigest[] messageDigestArr4 = messageDigestArr;
                i8++;
                i6 = i9 + 1;
                j2 = 0;
                j = 1048576;
            }
            byte[][] bArr7 = new byte[iArr2.length][];
            int i13 = 0;
            while (i13 < iArr2.length) {
                int i14 = iArr2[i13];
                byte[] bArr8 = bArr[i13];
                String p2 = m36495p(i14);
                try {
                    bArr7[i13] = MessageDigest.getInstance(p2).digest(bArr8);
                    i13++;
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(p2.concat(" digest not supported"), e3);
                }
            }
            return bArr7;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j3);
        throw new DigestException(sb3.toString());
    }

    /* renamed from: o */
    public static int m36494o(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    /* renamed from: p */
    public static String m36495p(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: q */
    public static int m36496q(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: r */
    public static ByteBuffer m36497r(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: s */
    public static ByteBuffer m36498s(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return m36497r(byteBuffer, i);
            } else {
                int remaining = byteBuffer.remaining();
                StringBuilder sb = new StringBuilder(101);
                sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb.append(i);
                sb.append(", remaining: ");
                sb.append(remaining);
                throw new IOException(sb.toString());
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(93);
            sb2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
    }

    /* renamed from: t */
    public static byte[] m36499t(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: u */
    public static void m36500u(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }
}
