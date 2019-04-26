package app_depends_on_changing_library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import com.example.broken.library_changes_across_versions.LibraryChangesAcrossVersions1;
import com.example.broken.library_changes_across_versions.LibraryChangesAcrossVersions2;

class ChangingLibraryTest {
    private LibraryChangesAcrossVersions1 library1;
    private LibraryChangesAcrossVersions2 library2;

    @BeforeEach
    void setUp() {
        this.library1 = new LibraryChangesAcrossVersions1();
        this.library2 = new LibraryChangesAcrossVersions2();
    }

    @Test
    void test_version1_result() {
        assertThat(this.library1.methodInVersion1()).contains("1");
    }

    @Test
    void test_version2_result() {
        assertThat(this.library2.methodInVersion2()).contains("2");
    }
}
