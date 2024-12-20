// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.3.0" apply false
    id("com.android.library") version "7.3.0" apply false
}

// Optional: Define tasks
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
