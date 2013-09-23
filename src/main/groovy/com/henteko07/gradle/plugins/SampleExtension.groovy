package com.henteko07.gradle.plugins

import org.gradle.api.NamedDomainObjectContainer

public class SampleExtension {
    final private NamedDomainObjectContainer<BookTarget> sampleBooks
    String configKey

    public SampleExtension(NamedDomainObjectContainer<BookTarget> books) {
        sampleBooks = books
    }

    public books(Closure closure) {
        sampleBooks.configure(closure)
    }
}
