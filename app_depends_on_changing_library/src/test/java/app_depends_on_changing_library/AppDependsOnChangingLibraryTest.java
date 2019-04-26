package app_depends_on_changing_library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppDependsOnChangingLibraryTest {
    private AppDependsOnChangingLibrary app;

    @BeforeEach
    void setUp() {
        app = new AppDependsOnChangingLibrary();
    }

    @Test
    void test_got_app() {
        assertThat(this.app).isNotNull();
    }
}