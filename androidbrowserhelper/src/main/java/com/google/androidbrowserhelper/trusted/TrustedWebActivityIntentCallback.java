package com.google.androidbrowserhelper.trusted;

import androidx.browser.trusted.TrustedWebActivityIntent;

public interface TrustedWebActivityIntentCallback {
    TrustedWebActivityIntent onTrustedWebActivityIntentReady(TrustedWebActivityIntent intent);
}
