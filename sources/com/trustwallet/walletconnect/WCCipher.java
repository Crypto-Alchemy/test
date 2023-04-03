package com.trustwallet.walletconnect;

import com.trustwallet.walletconnect.exceptions.InvalidHmacException;
import com.trustwallet.walletconnect.extensions.ByteArrayKt;
import com.trustwallet.walletconnect.extensions.StringKt;
import com.trustwallet.walletconnect.models.WCEncryptionPayload;
import java.security.SecureRandom;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/WCCipher;", "", "()V", "computeHmac", "", "data", "", "iv", "key", "decrypt", "payload", "Lcom/trustwallet/walletconnect/models/WCEncryptionPayload;", "encrypt", "randomBytes", "size", "", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCCipher.kt */
public final class WCCipher {
    public static final WCCipher INSTANCE = new WCCipher();

    private WCCipher() {
    }

    private final String computeHmac(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Mac instance = Mac.getInstance(WCCipherKt.MAC_ALGORITHM);
        byte[] t = C6706xq.m54506t(bArr, bArr2);
        instance.init(new SecretKeySpec(bArr3, WCCipherKt.MAC_ALGORITHM));
        byte[] doFinal = instance.doFinal(t);
        vx2.m53590f(doFinal, "mac.doFinal(payload)");
        return ByteArrayKt.toHex(doFinal);
    }

    private final byte[] randomBytes(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public final byte[] decrypt(WCEncryptionPayload wCEncryptionPayload, byte[] bArr) {
        vx2.m53591g(wCEncryptionPayload, "payload");
        vx2.m53591g(bArr, "key");
        byte[] hexStringToByteArray = StringKt.hexStringToByteArray(wCEncryptionPayload.getData());
        byte[] hexStringToByteArray2 = StringKt.hexStringToByteArray(wCEncryptionPayload.getIv());
        String computeHmac = computeHmac(hexStringToByteArray, hexStringToByteArray2, bArr);
        String hmac = wCEncryptionPayload.getHmac();
        Locale locale = Locale.getDefault();
        vx2.m53590f(locale, "getDefault()");
        String lowerCase = hmac.toLowerCase(locale);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (vx2.m53586b(computeHmac, lowerCase)) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(hexStringToByteArray2);
            Cipher instance = Cipher.getInstance(WCCipherKt.CIPHER_ALGORITHM);
            instance.init(2, secretKeySpec, ivParameterSpec);
            byte[] doFinal = instance.doFinal(hexStringToByteArray);
            vx2.m53590f(doFinal, "cipher.doFinal(data)");
            return doFinal;
        }
        throw new InvalidHmacException();
    }

    public final WCEncryptionPayload encrypt(byte[] bArr, byte[] bArr2) {
        vx2.m53591g(bArr, "data");
        vx2.m53591g(bArr2, "key");
        byte[] randomBytes = randomBytes(16);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(randomBytes);
        Cipher instance = Cipher.getInstance(WCCipherKt.CIPHER_ALGORITHM);
        instance.init(1, secretKeySpec, ivParameterSpec);
        byte[] doFinal = instance.doFinal(bArr);
        vx2.m53590f(doFinal, "encryptedData");
        return new WCEncryptionPayload(ByteArrayKt.toHex(doFinal), computeHmac(doFinal, randomBytes, bArr2), ByteArrayKt.toHex(randomBytes));
    }
}
