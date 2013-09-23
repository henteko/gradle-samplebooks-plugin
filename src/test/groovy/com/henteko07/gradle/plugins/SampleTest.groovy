package com.henteko07.gradle.plugins

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

import static org.junit.Assert.assertTrue

class SampleTest {
    @Test
    public void sampleTask() {
        Project project = ProjectBuilder.builder().build()
        project.apply plugin: 'sample'

        assertTrue(project.tasks.allBookRead instanceof BookTask)
    }
}
