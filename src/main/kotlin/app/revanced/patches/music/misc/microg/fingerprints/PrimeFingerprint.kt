package app.revanced.patches.music.misc.microg.fingerprints


import app.revanced.patcher.fingerprint.MethodFingerprint

object PrimeFingerprint : MethodFingerprint(
    strings = listOf("com.google.android.GoogleCamera", "com.android.vending")
)