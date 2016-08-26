package com.trailblazers.freewheelers;

import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class ApplicationConfigurationTest {
    @Test
    public void shouldAddLetsEncryptCertificate() throws CertificateException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IOException {
        new ApplicationConfiguration();

        URL url = new URL("https://community.letsencrypt.org");
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
    }
}
