package com.google.android.play.core.internal;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.play.core.internal.h */
class C4492h extends X509Certificate {

    /* renamed from: a */
    private final X509Certificate f24776a;

    public C4492h(X509Certificate x509Certificate) {
        this.f24776a = x509Certificate;
    }

    public final void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.f24776a.checkValidity();
    }

    public final void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        this.f24776a.checkValidity(date);
    }

    public final int getBasicConstraints() {
        return this.f24776a.getBasicConstraints();
    }

    public final Set<String> getCriticalExtensionOIDs() {
        return this.f24776a.getCriticalExtensionOIDs();
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        return this.f24776a.getEncoded();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f24776a.getExtensionValue(str);
    }

    public final Principal getIssuerDN() {
        return this.f24776a.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f24776a.getIssuerUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return this.f24776a.getKeyUsage();
    }

    public final Set<String> getNonCriticalExtensionOIDs() {
        return this.f24776a.getNonCriticalExtensionOIDs();
    }

    public final Date getNotAfter() {
        return this.f24776a.getNotAfter();
    }

    public final Date getNotBefore() {
        return this.f24776a.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f24776a.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f24776a.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f24776a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f24776a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f24776a.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f24776a.getSignature();
    }

    public final Principal getSubjectDN() {
        return this.f24776a.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f24776a.getSubjectUniqueID();
    }

    public final byte[] getTBSCertificate() throws CertificateEncodingException {
        return this.f24776a.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f24776a.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f24776a.hasUnsupportedCriticalExtension();
    }

    public final String toString() {
        return this.f24776a.toString();
    }

    public final void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f24776a.verify(publicKey);
    }

    public final void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f24776a.verify(publicKey, str);
    }
}
