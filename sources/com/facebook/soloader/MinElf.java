package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.FileChannel;
import okhttp3.internal.p023ws.WebSocketProtocol;

public final class MinElf {

    public static class ElfError extends RuntimeException {
        public ElfError(String str) {
            super(str);
        }
    }

    public enum ISA {
        NOT_SO("not_so"),
        X86("x86"),
        ARM("armeabi-v7a"),
        X86_64("x86_64"),
        AARCH64("arm64-v8a"),
        OTHERS("others");
        
        private final String value;

        /* access modifiers changed from: public */
        ISA(String str) {
            this.value = str;
        }

        public String toString() {
            return this.value;
        }
    }

    /* renamed from: a */
    public static String[] m13709a(File file) throws IOException {
        int i = 0;
        while (true) {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                return m13710b(fileInputStream.getChannel());
            } catch (ClosedByInterruptException e) {
                i++;
                if (i <= 3) {
                    Thread.interrupted();
                } else {
                    throw e;
                }
            } finally {
                fileInputStream.close();
            }
        }
    }

    /* renamed from: b */
    public static String[] m13710b(FileChannel fileChannel) throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        String str;
        long j8;
        long j9;
        String str2;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        FileChannel fileChannel2 = fileChannel;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long f = m13714f(fileChannel2, allocate, 0);
        if (f == 1179403647) {
            boolean z = true;
            if (m13715g(fileChannel2, allocate, 4) != 1) {
                z = false;
            }
            if (m13715g(fileChannel2, allocate, 5) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z) {
                j = m13714f(fileChannel2, allocate, 28);
            } else {
                j = m13711c(fileChannel2, allocate, 32);
            }
            if (z) {
                j2 = (long) m13713e(fileChannel2, allocate, 44);
            } else {
                j2 = (long) m13713e(fileChannel2, allocate, 56);
            }
            if (z) {
                j3 = 42;
            } else {
                j3 = 54;
            }
            int e = m13713e(fileChannel2, allocate, j3);
            if (j2 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                if (z) {
                    j18 = m13714f(fileChannel2, allocate, 32);
                } else {
                    j18 = m13711c(fileChannel2, allocate, 40);
                }
                if (z) {
                    j19 = m13714f(fileChannel2, allocate, j18 + 28);
                } else {
                    j19 = m13714f(fileChannel2, allocate, j18 + 44);
                }
                j2 = j19;
            }
            long j20 = j;
            long j21 = 0;
            while (true) {
                if (j21 >= j2) {
                    j4 = 0;
                    break;
                }
                if (z) {
                    j17 = m13714f(fileChannel2, allocate, j20 + 0);
                } else {
                    j17 = m13714f(fileChannel2, allocate, j20 + 0);
                }
                if (j17 != 2) {
                    j20 += (long) e;
                    j21++;
                } else if (z) {
                    j4 = m13714f(fileChannel2, allocate, j20 + 4);
                } else {
                    j4 = m13711c(fileChannel2, allocate, j20 + 8);
                }
            }
            long j22 = 0;
            if (j4 != 0) {
                long j23 = j4;
                long j24 = 0;
                int i = 0;
                while (true) {
                    boolean z2 = z;
                    if (z) {
                        j5 = m13714f(fileChannel2, allocate, j23 + j22);
                    } else {
                        j5 = m13711c(fileChannel2, allocate, j23 + j22);
                    }
                    long j25 = j4;
                    String str3 = "malformed DT_NEEDED section";
                    if (j5 == 1) {
                        if (i != Integer.MAX_VALUE) {
                            i++;
                            j6 = j5;
                        } else {
                            throw new ElfError(str3);
                        }
                    } else if (j5 == 5) {
                        if (z2) {
                            j6 = j5;
                            j16 = m13714f(fileChannel2, allocate, j23 + 4);
                        } else {
                            j6 = j5;
                            j16 = m13711c(fileChannel2, allocate, j23 + 8);
                        }
                        j24 = j16;
                    } else {
                        j6 = j5;
                    }
                    long j26 = 16;
                    if (z2) {
                        j7 = 8;
                    } else {
                        j7 = 16;
                    }
                    j23 += j7;
                    j22 = 0;
                    if (j6 != 0) {
                        z = z2;
                        j4 = j25;
                    } else if (j24 != 0) {
                        int i2 = 0;
                        while (true) {
                            if (((long) i2) >= j2) {
                                str = str3;
                                j8 = 0;
                                break;
                            }
                            if (z2) {
                                j12 = m13714f(fileChannel2, allocate, j + j22);
                            } else {
                                j12 = m13714f(fileChannel2, allocate, j + j22);
                            }
                            if (j12 == 1) {
                                if (z2) {
                                    j13 = m13714f(fileChannel2, allocate, j + 8);
                                } else {
                                    j13 = m13711c(fileChannel2, allocate, j + j26);
                                }
                                if (z2) {
                                    str = str3;
                                    j14 = m13714f(fileChannel2, allocate, j + 20);
                                } else {
                                    str = str3;
                                    j14 = m13711c(fileChannel2, allocate, j + 40);
                                }
                                if (j13 <= j24 && j24 < j14 + j13) {
                                    if (z2) {
                                        j15 = m13714f(fileChannel2, allocate, j + 4);
                                    } else {
                                        j15 = m13711c(fileChannel2, allocate, j + 8);
                                    }
                                    j8 = j15 + (j24 - j13);
                                }
                            } else {
                                str = str3;
                            }
                            j += (long) e;
                            i2++;
                            str3 = str;
                            j26 = 16;
                            j22 = 0;
                        }
                        long j27 = 0;
                        if (j8 != 0) {
                            String[] strArr = new String[i];
                            long j28 = j25;
                            int i3 = 0;
                            while (true) {
                                long j29 = j28 + j27;
                                if (z2) {
                                    j9 = m13714f(fileChannel2, allocate, j29);
                                } else {
                                    j9 = m13711c(fileChannel2, allocate, j29);
                                }
                                if (j9 == 1) {
                                    if (z2) {
                                        j11 = m13714f(fileChannel2, allocate, j28 + 4);
                                    } else {
                                        j11 = m13711c(fileChannel2, allocate, j28 + 8);
                                    }
                                    strArr[i3] = m13712d(fileChannel2, allocate, j11 + j8);
                                    if (i3 != Integer.MAX_VALUE) {
                                        i3++;
                                        str2 = str;
                                    } else {
                                        throw new ElfError(str);
                                    }
                                } else {
                                    str2 = str;
                                }
                                if (z2) {
                                    j10 = 8;
                                } else {
                                    j10 = 16;
                                }
                                j28 += j10;
                                if (j9 != 0) {
                                    str = str2;
                                    j27 = 0;
                                } else if (i3 == i) {
                                    return strArr;
                                } else {
                                    throw new ElfError(str2);
                                }
                            }
                        } else {
                            throw new ElfError("did not find file offset of DT_STRTAB table");
                        }
                    } else {
                        throw new ElfError("Dynamic section string-table not found");
                    }
                }
            } else {
                throw new ElfError("ELF file does not contain dynamic linking information");
            }
        } else {
            throw new ElfError("file is not ELF: 0x" + Long.toHexString(f));
        }
    }

    /* renamed from: c */
    public static long m13711c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        m13716h(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    /* renamed from: d */
    public static String m13712d(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short g = m13715g(fileChannel, byteBuffer, j);
            if (g == 0) {
                return sb.toString();
            }
            sb.append((char) g);
            j = j2;
        }
    }

    /* renamed from: e */
    public static int m13713e(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        m13716h(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: f */
    public static long m13714f(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        m13716h(fileChannel, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* renamed from: g */
    public static short m13715g(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        m13716h(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    /* renamed from: h */
    public static void m13716h(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) throws IOException {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j)) != -1) {
            j += (long) read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new ElfError("ELF file truncated");
    }
}
