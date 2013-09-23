package com.henteko07.gradle.plugins

import org.gradle.api.GradleException;
import org.gradle.api.Plugin
import org.gradle.api.Project

class Sample implements Plugin<Project> {

    void apply(Project project) {
        def sample = new SampleExtension(project.container(BookTarget))
        project.convention.plugins.sample = sample
        project.extensions.sample = sample

        def allBookRead = project.task('allBookRead', type: BookTask)
        allBookRead.group = 'Sample'
        allBookRead.description = 'All book read'
    }
}
