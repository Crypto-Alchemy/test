package com.fasterxml.jackson.core;

import java.io.Serializable;

public class Version implements Comparable<Version>, Serializable {

    /* renamed from: a */
    public static final Version f9831a = new Version(0, 0, 0, (String) null, (String) null, (String) null);
    private static final long serialVersionUID = 1;
    public final String _artifactId;
    public final String _groupId;
    public final int _majorVersion;
    public final int _minorVersion;
    public final int _patchLevel;
    public final String _snapshotInfo;

    @Deprecated
    public Version(int i, int i2, int i3, String str) {
        this(i, i2, i3, str, (String) null, (String) null);
    }

    public static Version unknownVersion() {
        return f9831a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Version version = (Version) obj;
        if (version._majorVersion == this._majorVersion && version._minorVersion == this._minorVersion && version._patchLevel == this._patchLevel && version._artifactId.equals(this._artifactId) && version._groupId.equals(this._groupId)) {
            return true;
        }
        return false;
    }

    public String getArtifactId() {
        return this._artifactId;
    }

    public String getGroupId() {
        return this._groupId;
    }

    public int getMajorVersion() {
        return this._majorVersion;
    }

    public int getMinorVersion() {
        return this._minorVersion;
    }

    public int getPatchLevel() {
        return this._patchLevel;
    }

    public int hashCode() {
        return this._artifactId.hashCode() ^ (((this._groupId.hashCode() + this._majorVersion) - this._minorVersion) + this._patchLevel);
    }

    public boolean isSnapshot() {
        String str = this._snapshotInfo;
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    @Deprecated
    public boolean isUknownVersion() {
        return isUnknownVersion();
    }

    public boolean isUnknownVersion() {
        if (this == f9831a) {
            return true;
        }
        return false;
    }

    public String toFullString() {
        return this._groupId + '/' + this._artifactId + '/' + toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._majorVersion);
        sb.append('.');
        sb.append(this._minorVersion);
        sb.append('.');
        sb.append(this._patchLevel);
        if (isSnapshot()) {
            sb.append('-');
            sb.append(this._snapshotInfo);
        }
        return sb.toString();
    }

    public Version(int i, int i2, int i3, String str, String str2, String str3) {
        this._majorVersion = i;
        this._minorVersion = i2;
        this._patchLevel = i3;
        this._snapshotInfo = str;
        this._groupId = str2 == null ? "" : str2;
        this._artifactId = str3 == null ? "" : str3;
    }

    public int compareTo(Version version) {
        if (version == this) {
            return 0;
        }
        int compareTo = this._groupId.compareTo(version._groupId);
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = this._artifactId.compareTo(version._artifactId);
        if (compareTo2 != 0) {
            return compareTo2;
        }
        int i = this._majorVersion - version._majorVersion;
        if (i != 0) {
            return i;
        }
        int i2 = this._minorVersion - version._minorVersion;
        return i2 == 0 ? this._patchLevel - version._patchLevel : i2;
    }
}
