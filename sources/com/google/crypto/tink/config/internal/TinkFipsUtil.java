package com.google.crypto.tink.config.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

public final class TinkFipsUtil {

    /* renamed from: a */
    public static final Logger f25048a = Logger.getLogger(TinkFipsUtil.class.getName());

    /* renamed from: b */
    public static final AtomicBoolean f25049b = new AtomicBoolean(false);

    public enum AlgorithmFipsCompatibility {
        ALGORITHM_NOT_FIPS {
            public boolean isCompatible() {
                return !TinkFipsUtil.m37104c();
            }
        },
        ALGORITHM_REQUIRES_BORINGCRYPTO {
            public boolean isCompatible() {
                if (!TinkFipsUtil.m37104c() || TinkFipsUtil.m37103b()) {
                    return true;
                }
                return false;
            }
        };

        public abstract boolean isCompatible();
    }

    /* renamed from: a */
    public static Boolean m37102a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            f25048a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public static boolean m37103b() {
        return m37102a().booleanValue();
    }

    /* renamed from: c */
    public static boolean m37104c() {
        if (uq6.m52963a() || f25049b.get()) {
            return true;
        }
        return false;
    }
}
