package com.example.broken.library_changes_across_versions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LibraryChangesAcrossVersions1Test {
    @Test
    void test_version_1_method() {
        final LibraryChangesAcrossVersions1 library = new LibraryChangesAcrossVersions1();

        assertThat(library.methodInVersion1()).contains("1");
    }
}
