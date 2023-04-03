package org.web3j.crypto;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Provider;
import java.security.SecureRandomSpi;
import java.security.Security;

public class LinuxSecureRandom extends SecureRandomSpi {
    private static final uk3 log;
    private static final FileInputStream urandom;
    private final DataInputStream dis = new DataInputStream(urandom);

    public static class LinuxSecureRandomProvider extends Provider {
        public LinuxSecureRandomProvider() {
            super("LinuxSecureRandom", 1.0d, "A Linux specific random number provider that uses /dev/urandom");
            put("SecureRandom.LinuxSecureRandom", LinuxSecureRandom.class.getName());
        }
    }

    static {
        uk3 i = vk3.m73272i(LinuxSecureRandom.class);
        log = i;
        try {
            File file = new File("/dev/urandom");
            FileInputStream fileInputStream = new FileInputStream(file);
            urandom = fileInputStream;
            if (fileInputStream.read() == -1) {
                throw new RuntimeException("/dev/urandom not readable?");
            } else if (Security.insertProviderAt(new LinuxSecureRandomProvider(), 1) != -1) {
                i.info("Secure randomness will be read from {} only.", file);
            } else {
                i.info("Randomness is already secure.");
            }
        } catch (FileNotFoundException e) {
            log.error("/dev/urandom does not appear to exist or is not openable");
            throw new RuntimeException(e);
        } catch (IOException e2) {
            log.error("/dev/urandom does not appear to be readable");
            throw new RuntimeException(e2);
        }
    }

    public byte[] engineGenerateSeed(int i) {
        byte[] bArr = new byte[i];
        engineNextBytes(bArr);
        return bArr;
    }

    public void engineNextBytes(byte[] bArr) {
        try {
            this.dis.readFully(bArr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void engineSetSeed(byte[] bArr) {
    }
}
