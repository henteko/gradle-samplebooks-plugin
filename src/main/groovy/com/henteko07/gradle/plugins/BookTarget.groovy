package com.henteko07.gradle.plugins

import org.gradle.api.Named
import org.gradle.api.internal.project.ProjectInternal

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
