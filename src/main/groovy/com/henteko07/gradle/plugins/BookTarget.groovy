package com.henteko07.gradle.plugins

import org.gradle.api.DomainObjectSet
import org.gradle.api.Named
import org.gradle.api.internal.project.ProjectInternal
import org.gradle.api.tasks.JavaExec
import org.gradle.api.tasks.TaskAction
import org.gradle.plugins.binaries.model.NativeDependencyCapableSourceSet;
import org.gradle.plugins.binaries.model.NativeDependencySet

class BookTarget implements Named {
    String name
    ProjectInternal target

    String title
    String body
    public BookTarget(String name) {
      super()
      this.name = name
      this.target = target
    }
}
