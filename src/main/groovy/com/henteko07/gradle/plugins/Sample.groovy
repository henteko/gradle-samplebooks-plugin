package com.henteko07.gradle.plugins

import org.gradle.api.GradleException;
import org.gradle.api.Plugin
import org.gradle.api.Project

class Sample implements Plugin<Project> {

    void apply(Project project) {
        def books = project.container(BookTarget) {
            String bookName = it.toString()
            def subTask = project.task("${bookName}BookRead", type: SubBookTask)
            subTask.group = 'Sample' 
            subTask.description = "${bookName} book read"
            subTask.bookName = bookName

            project.extensions.create(it, BookTarget, bookName)
        }
        def sample = new SampleExtension(books)
        project.convention.plugins.sample = sample
        project.extensions.sample = sample

        def allBookRead = project.task('allBookRead', type: BookTask)
        allBookRead.group = 'Sample'
        allBookRead.description = 'All book read'
    }
}
